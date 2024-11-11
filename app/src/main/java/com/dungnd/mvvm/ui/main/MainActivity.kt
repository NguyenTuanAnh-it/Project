package com.dungnd.mvvm.ui.main

import com.dungnd.mvvm.R
import com.dungnd.mvvm.databinding.ActivityMainBinding
import com.dungnd.mvvm.ui.base.BaseActivity
import com.dungnd.mvvm.ui.mainfragment.mainFragment

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun layoutRes(): Int = R.layout.activity_main

    override fun viewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun initView() {
        // Khởi tạo MainFragment
        val mainFragment = mainFragment()

        // Thêm MainFragment vào Activity
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, mainFragment)
            .commit()
    }
}