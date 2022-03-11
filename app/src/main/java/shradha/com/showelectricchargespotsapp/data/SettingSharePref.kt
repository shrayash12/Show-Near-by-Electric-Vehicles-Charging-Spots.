package shradha.com.showelectricchargespotsapp.data

import android.content.Context

const val SHARE_PREF_NAME = "maxSharePref"
const val KEY_MAX_RESULT = "KEY_MAX_RESULT"

interface SettingSharePref {
    fun setMaxResult(maxResult: String)
    fun getMaxResult(): String
}

class SettingSharePrefImpl(context: Context) : SettingSharePref {
    private val sharePref by lazy {
        context.getSharedPreferences(
            SHARE_PREF_NAME,
            Context.MODE_PRIVATE
        )
    }

    override fun setMaxResult(maxResult: String) {
        sharePref
            .edit()
            .putString(KEY_MAX_RESULT, maxResult).apply()
    }

    override fun getMaxResult(): String {
        return sharePref.getString(KEY_MAX_RESULT, "10") ?: "10"
    }
}