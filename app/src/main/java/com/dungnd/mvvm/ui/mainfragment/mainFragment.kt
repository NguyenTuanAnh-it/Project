package com.dungnd.mvvm.ui.mainfragment

import androidx.viewpager2.widget.ViewPager2
import com.dungnd.mvvm.R
import com.dungnd.mvvm.databinding.FragmentMainBinding
import com.dungnd.mvvm.ui.base.BaseFragment

class mainFragment : BaseFragment<FragmentMainBinding, MainFragmentViewModel>() {
    override fun layoutRes(): Int {
        return R.layout.fragment_main
    }

    override fun viewModelClass(): Class<MainFragmentViewModel> = MainFragmentViewModel::class.java

    override fun initView() {
        val adapter = ViewPagerAdapter(requireActivity().supportFragmentManager, lifecycle)
        binding.vpPage.adapter = adapter
        binding.vpPage.isUserInputEnabled = true

        binding.btmNav.setOnItemSelectedListener { menuItem ->
            // Kiểm tra xem Fragment hiện tại đã được chọn chưa trước khi chuyển đổi
            val currentFragment = binding.vpPage.currentItem
            when (menuItem.itemId) {
                R.id.homeFood -> {
                    if (currentFragment != 0) {
                        binding.vpPage.currentItem = 0
                    }
                }
                R.id.favorite -> {
                    if (currentFragment != 1) {
                        binding.vpPage.currentItem = 1
                    }
                }
                else -> {
                    if (currentFragment != 2) {
                        binding.vpPage.currentItem = 2
                    }
                }
            }
            return@setOnItemSelectedListener true
        }

        binding.vpPage.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> binding.btmNav.menu.findItem(R.id.homeFood)?.isChecked = true
                    1 -> binding.btmNav.menu.findItem(R.id.favorite)?.isChecked = true
                    2 -> binding.btmNav.menu.findItem(R.id.category)?.isChecked = true
                }
            }
        })
    }
}



