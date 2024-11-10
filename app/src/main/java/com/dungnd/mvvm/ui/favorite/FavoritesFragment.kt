package com.dungnd.mvvm.ui.favorite

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dungnd.mvvm.R
import com.dungnd.mvvm.databinding.FragmentFavoritesBinding
import com.dungnd.mvvm.ui.base.BaseFragment

class FavoritesFragment : BaseFragment<FragmentFavoritesBinding, FavoritesViewModel>() {
    override fun layoutRes(): Int {
        return R.layout.fragment_favorites
    }

    override fun viewModelClass(): Class<FavoritesViewModel> = FavoritesViewModel::class.java

    override fun initView() {

    }


}