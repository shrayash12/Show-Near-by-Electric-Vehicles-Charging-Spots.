package shradha.com.showelectricchargespotsapp.ui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import shradha.com.showelectricchargespotsapp.R
import shradha.com.showelectricchargespotsapp.data.SettingSharePref
import shradha.com.showelectricchargespotsapp.data.SettingSharePrefImpl
import shradha.com.showelectricchargespotsapp.di.ShowElectricChargeApplication
import shradha.com.showelectricchargespotsapp.domain.ElectricChargeSpotViewModel
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var electricChargeSpotViewModel: ElectricChargeSpotViewModel
    private lateinit var electricChargeSpotListAdapter: ElectricChargeSpotListAdapter
    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private lateinit var settingSharePref: SettingSharePref
    private lateinit var progressBar: ProgressBar
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpDependencyInjection()
        recyclerviewSetUp()
        progressBar = findViewById(R.id.progressBar1)
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        settingSharePref = SettingSharePrefImpl(this)
        fetchLocation()
        electricChargeSpotViewModel.chargeSpots.observe(this, Observer {
            progressBar.visibility = View.GONE
            recyclerView.visibility = View.VISIBLE
            electricChargeSpotListAdapter.submitList(it)
        })
    }

    private fun setUpDependencyInjection() {
        (application as ShowElectricChargeApplication)
            .appComponent
            .inject(this)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (checkPermission()) return
        fetchLocation()
    }

    private fun fetchLocation() {
        val task = fusedLocationProviderClient.lastLocation
        if (checkPermission()) return
        task.addOnSuccessListener(this) {
            if (it != null) {
                progressBar.visibility = View.VISIBLE
                electricChargeSpotViewModel.getNearByChargingSpot(
                    it.latitude,
                    it.longitude,
                    settingSharePref.getMaxResult()
                )
            }
        }
        task.addOnFailureListener(this) {
            Log.d(MainActivity::class.java.simpleName, it.localizedMessage)
        }
    }

    private fun checkPermission(): Boolean {
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
            return true
        }
        return false
    }

    private fun recyclerviewSetUp() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
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