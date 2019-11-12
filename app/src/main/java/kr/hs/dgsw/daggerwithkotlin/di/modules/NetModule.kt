package kr.hs.dgsw.daggerwithkotlin.di.modules

import dagger.Module
import dagger.Provides
import kr.hs.dgsw.daggerwithkotlin.utils.ApiInterface
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule {

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/search/"
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().apply {
            baseUrl(NetModule.BASE_URL)
            addConverterFactory(GsonConverterFactory.create())
            addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        }.build()
    }

    @Provides
    @Singleton
    fun provideApiInterface(retrofit:Retrofit):ApiInterface{
        return retrofit.create(ApiInterface::class.java)
    }

}