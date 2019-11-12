package kr.hs.dgsw.daggerwithkotlin.di.modules

import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    fun provideHelloWorld(): String = "Hello, World!"


}