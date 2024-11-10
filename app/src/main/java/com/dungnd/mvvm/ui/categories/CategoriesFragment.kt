package com.dungnd.mvvm.ui.categories

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dungnd.mvvm.R
import com.dungnd.mvvm.databinding.FragmentCategoriesBinding
import com.dungnd.mvvm.ui.base.BaseFragment

class CategoriesFragment : BaseFragment<FragmentCategoriesBinding, CategoriesViewModel>() {
    override fun layoutRes(): Int {
        return R.layout.fragment_categories
    }

    override fun viewModelClass(): Class<CategoriesViewModel> = CategoriesViewModel::class.java

    override fun initView() {

    }


}