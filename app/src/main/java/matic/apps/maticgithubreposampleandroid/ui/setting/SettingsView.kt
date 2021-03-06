package matic.apps.maticgithubreposampleandroid.ui.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import matic.apps.maticgithubreposampleandroid.R
import matic.apps.maticgithubreposampleandroid.ui.common.base.BaseView


/**
 * Shows a setting screen
 */
class SettingsView : BaseView() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.view_setting_layout, container, false)
    }
}
