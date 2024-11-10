package com.dungnd.mvvm.ui.edit

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dungnd.mvvm.R
import com.dungnd.mvvm.databinding.FragmentEditProfileBinding
import com.dungnd.mvvm.ui.base.BaseFragment

class EditProfileFragment : BaseFragment<FragmentEditProfileBinding, EditProfileViewModel>() {
    override fun layoutRes(): Int {
       return R.layout.fragment_edit_profile
    }

    override fun viewModelClass(): Class<EditProfileViewModel> = EditProfileViewModel::class.java

    override fun initView() {

    }


}