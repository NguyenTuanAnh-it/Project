package com.dungnd.mvvm.di.module

import com.dungnd.mvvm.ui.categories.CategoriesFragment
import com.dungnd.mvvm.ui.detail.DetailFragment
import com.dungnd.mvvm.ui.edit.EditProfileFragment
import com.dungnd.mvvm.ui.favorite.FavoritesFragment
import com.dungnd.mvvm.ui.home.HomeFragment
import com.dungnd.mvvm.ui.main.MainActivity
import com.dungnd.mvvm.ui.mainfragment.mainFragment
import com.dungnd.mvvm.ui.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun bindSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    abstract fun bindHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun bindDetailFragment(): DetailFragment

    @ContributesAndroidInjector
    abstract fun editProfileFragment(): EditProfileFragment

    @ContributesAndroidInjector
    abstract fun favoritesFragment(): FavoritesFragment

    @ContributesAndroidInjector
    abstract fun categoriesFragment(): CategoriesFragment

    @ContributesAndroidInjector
    abstract fun mainFragment(): mainFragment
}