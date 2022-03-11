package shradha.com.showelectricchargespotsapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import shradha.com.showelectricchargespotsapp.R
import shradha.com.showelectricchargespotsapp.data.SettingSharePrefImpl


class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val editMaxResult = findViewById<EditText>(R.id.editEnterMaxResult)
        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val settingSharePref = SettingSharePrefImpl(this)
        editMaxResult.setText(settingSharePref.getMaxResult())
        buttonSave.setOnClickListener {
            if (editMaxResult.text.toString().isNullOrEmpty().not() &&
                editMaxResult.text.toString().isDigitsOnly()
            ) {
                settingSharePref.setMaxResult(editMaxResult.text.toString())
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }
}