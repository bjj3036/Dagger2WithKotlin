package kr.hs.dgsw.daggerwithkotlin.di.components

import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjector
import kr.hs.dgsw.daggerwithkotlin.MainActivity
import kr.hs.dgsw.daggerwithkotlin.di.PerActivity
import kr.hs.dgsw.daggerwithkotlin.di.modules.ActivityModule
import kr.hs.dgsw.daggerwithkotlin.di.modules.NetModule
import kr.hs.dgsw.daggerwithkotlin.utils.ApiInterface
import retrofit2.Retrofit
import javax.inject.Singleton

@Component(modules = [ActivityModule::class], dependencies = [AppComponent::class])
@PerActivity
interface ActivityComponent{

    fun inject(activity:MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): ActivityComponent
        fun activityModule(appModule: ActivityModule): Builder
        fun appComponent(appComponent: AppComponent):Builder
    }
}