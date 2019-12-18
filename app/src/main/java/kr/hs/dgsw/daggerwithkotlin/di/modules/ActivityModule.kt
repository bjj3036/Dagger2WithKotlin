package kr.hs.dgsw.daggerwithkotlin.di.modules

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import kr.hs.dgsw.daggerwithkotlin.di.PerActivity
import kr.hs.dgsw.daggerwithkotlin.test.Dog
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
class ActivityModule(val context: Context) {

    @Provides
    fun provideHelloWorld(): String = "Hello, World!"


    @Provides
    @PerActivity
    fun provideSharedPreferences(): SharedPreferences =
        context.getSharedPreferences("DaggerWithKotlin", Context.MODE_PRIVATE)

}