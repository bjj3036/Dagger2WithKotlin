package kr.hs.dgsw.daggerwithkotlin.di.components

import dagger.Component
import dagger.android.AndroidInjector
import kr.hs.dgsw.daggerwithkotlin.MainActivity
import kr.hs.dgsw.daggerwithkotlin.di.PerActivity
import kr.hs.dgsw.daggerwithkotlin.di.modules.ActivityModule
import kr.hs.dgsw.daggerwithkotlin.di.modules.NetModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ActivityModule::class, NetModule::class])
@PerActivity
interface ActivityComponent{

    fun inject(activity:MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): ActivityComponent
        fun activityModule(appModule: ActivityModule): Builder
        fun netModule(appModule: NetModule): Builder
    }
}