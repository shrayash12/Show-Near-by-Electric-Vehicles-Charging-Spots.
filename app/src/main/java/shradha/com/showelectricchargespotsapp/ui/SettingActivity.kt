package shradha.com.showelectricchargespotsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.text.isDigitsOnly
import shradha.com.showelectricchargespotsapp.R

const val SHARE_PREF_NAME = "maxSharePref"
const val KEY_MAX_RESULT = "KEY_MAX_RESULT"


class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val editMaxResult = findViewById<EditText>(R.id.editEnterMaxResult)
        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val sharePref = getSharedPreferences(SHARE_PREF_NAME, MODE_PRIVATE)

        editMaxResult.setText(sharePref.getString(KEY_MAX_RESULT, ""))

        buttonSave.setOnClickListener {
            if (editMaxResult.text.toString().isNullOrEmpty().not() &&
                editMaxResult.text.toString().isDigitsOnly()
            ) {
                sharePref
                    .edit()
                    .putString(KEY_MAX_RESULT, editMaxResult.text.toString())
                    .apply()

            }
        }
    }
}