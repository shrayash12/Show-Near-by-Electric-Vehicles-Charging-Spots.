package shradha.com.showelectricchargespotsapp.ui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import kotlinx.coroutines.Dispatchers
import shradha.com.showelectricchargespotsapp.R
import shradha.com.showelectricchargespotsapp.data.ElectricChargeSpotRepositoryImpl
import shradha.com.showelectricchargespotsapp.domain.ElectricChargeSpotViewModel
import shradha.com.showelectricchargespotsapp.domain.ElectricChargeSpotViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var electricChargeSpotViewModel: ElectricChargeSpotViewModel
    lateinit var electricChargeSpotListAdapter: ElectricChargeSpotListAdapter
    lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerviewSetUp()
        electricChargeSpotViewModel = createViewModel()
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

        fetchLocation()
        electricChargeSpotViewModel.chargeSpots.observe(this, Observer {
            Log.d("MainActivity", "Charging" + it.size)
            electricChargeSpotListAdapter.submitList(it)
        })
    }

    private fun fetchLocation() {
        val task = fusedLocationProviderClient.lastLocation
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
            && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                101
            )
            return
        }
        task.addOnSuccessListener(this, OnSuccessListener {
            if (it != null) {
                electricChargeSpotViewModel.getNearByChargingSpot(it.latitude, it.longitude)
            }
        })
        task.addOnFailureListener(this, OnFailureListener {

        })
    }

    private fun createViewModel(): ElectricChargeSpotViewModel {
        val sharePref = getSharedPreferences(SHARE_PREF_NAME, MODE_PRIVATE)
        val maxResult = sharePref.getString(KEY_MAX_RESULT, "10") ?: "10"
        val electricChargeSpotRepository = ElectricChargeSpotRepositoryImpl(
            Dispatchers.IO,
            maxResult
        )

        val electricChargeSpotViewModel: ElectricChargeSpotViewModel by viewModels {
            ElectricChargeSpotViewModelFactory(electricChargeSpotRepository)
        }
        return electricChargeSpotViewModel
    }

    private fun recyclerviewSetUp() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        electricChargeSpotListAdapter = ElectricChargeSpotListAdapter()
        recyclerView.adapter = electricChargeSpotListAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        startActivity(Intent(this, SettingActivity::class.java))
        return true
    }

}