package kr.hs.dgsw.daggerwithkotlin

import android.app.Application
import android.content.Context
import kr.hs.dgsw.daggerwithkotlin.di.components.AppComponent
import kr.hs.dgsw.daggerwithkotlin.di.components.DaggerAppComponent
import kr.hs.dgsw.daggerwithkotlin.di.modules.NetModule

class InitApplication : Application() {

    companion object{
        fun get(context: Context):InitApplication = context as InitApplication
    }

    fun getComponent(): AppComponent {
        return DaggerAppComponent.builder()
            .netModule(NetModule())
            .build()
    }
}