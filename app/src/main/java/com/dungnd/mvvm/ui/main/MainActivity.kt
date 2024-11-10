package com.dungnd.mvvm.ui.main

import androidx.viewpager2.widget.ViewPager2
import com.dungnd.mvvm.R
import com.dungnd.mvvm.databinding.ActivityMainBinding
import com.dungnd.mvvm.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {
    override fun layoutRes(): Int = R.layout.activity_main

    override fun viewModelClass(): Class<MainViewModel> = MainViewModel::class.java

    override fun initView() {
        val adapter = ViewPagerAdapter(this)
        binding.vpPage.adapter = adapter
        binding.vpPage.isUserInputEnabled = false
        binding.btmNav.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.homeFood -> {
                    binding.vpPage.currentItem = 0
                }
                R.id.favorite -> {
                    binding.vpPage.currentItem = 1
                }
                else -> {
                    binding.vpPage.currentItem = 2
                }
            }
            return@setOnItemSelectedListener true
        }

        binding.vpPage.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position){
                    0 -> binding.btmNav.menu.findItem(R.id.homeFood).setChecked(true)
                    1 -> binding.btmNav.menu.findItem(R.id.favorite).setChecked(true)
                    2 -> binding.btmNav.menu.findItem(R.id.category).setChecked(true)
                }
            }

        })

    }
}