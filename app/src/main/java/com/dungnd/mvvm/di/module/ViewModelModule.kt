package com.dungnd.mvvm.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dungnd.mvvm.di.viewmodel.ViewModelFactory
import com.dungnd.mvvm.di.viewmodel.ViewModelKey
import com.dungnd.mvvm.ui.categories.CategoriesViewModel
import com.dungnd.mvvm.ui.detail.DetailViewModel
import com.dungnd.mvvm.ui.edit.EditProfileViewModel
import com.dungnd.mvvm.ui.favorite.FavoritesViewModel
import com.dungnd.mvvm.ui.home.HomeViewModel
import com.dungnd.mvvm.ui.main.MainViewModel
import com.dungnd.mvvm.ui.mainfragment.MainFragmentViewModel
import com.dungnd.mvvm.ui.mainfragment.mainFragment
import com.dungnd.mvvm.ui.splash.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun mainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    internal abstract fun splashViewModel(viewModel: SplashViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    internal abstract fun homeViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    internal abstract fun detailViewModel(viewModel: DetailViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(EditProfileViewModel::class)
    internal abstract fun editProfileViewModel(viewModel: EditProfileViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FavoritesViewModel::class)
    internal abstract fun favoritesViewModel(viewModel: FavoritesViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CategoriesViewModel::class)
    internal abstract fun categoriesViewModel(viewModel: CategoriesViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainFragmentViewModel::class)
    internal abstract fun mainFragmentViewModel(viewModel: MainFragmentViewModel): ViewModel

}