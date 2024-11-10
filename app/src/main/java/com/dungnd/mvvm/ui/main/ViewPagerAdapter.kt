package com.dungnd.mvvm.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dungnd.mvvm.ui.categories.CategoriesFragment
import com.dungnd.mvvm.ui.detail.DetailFragment
import com.dungnd.mvvm.ui.edit.EditProfileFragment
import com.dungnd.mvvm.ui.favorite.FavoritesFragment
import com.dungnd.mvvm.ui.home.HomeFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
       return when(position){
           0 -> {
               HomeFragment()
           }
           1 -> {
               FavoritesFragment()
           }
           2 -> {
               CategoriesFragment()
           }
           else -> {
              HomeFragment()
           }
       }
    }
}