package kr.hs.dgsw.daggerwithkotlin.di.components

import dagger.Component
import dagger.Module
import kr.hs.dgsw.daggerwithkotlin.di.modules.ActivityModule
import kr.hs.dgsw.daggerwithkotlin.di.modules.AppModule
import kr.hs.dgsw.daggerwithkotlin.di.modules.NetModule
import kr.hs.dgsw.daggerwithkotlin.utils.ApiInterface
import javax.inject.Singleton

@Singleton
@Component(modules = [NetModule::class, AppModule::class])
interface AppComponent {

    //module에 있는 객체들을 명시적으로 가져올 수 있다
    fun apiInterface(): ApiInterface

    fun subComponentBuilder(): SubComponent.Builder

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        fun netModule(appModule: NetModule): Builder
    }
}