package kr.hs.dgsw.daggerwithkotlin.di.components

import dagger.Subcomponent
import kr.hs.dgsw.daggerwithkotlin.di.PerActivity
import kr.hs.dgsw.daggerwithkotlin.di.SubScope
import kr.hs.dgsw.daggerwithkotlin.di.modules.SubModule
import kr.hs.dgsw.daggerwithkotlin.test.Dog
import kr.hs.dgsw.daggerwithkotlin.utils.ApiInterface
import javax.inject.Singleton

@SubScope
@Subcomponent(modules = [SubModule::class])
interface SubComponent {
    fun dog(): Dog
    // SubComponent는 현재 NetModule와 부모 자식 관계다, 그래서 NetModule의 ApiInterface를 불러 올 수 있다
    fun apiInterface():ApiInterface

    @Subcomponent.Builder
    interface Builder {
        fun build(): SubComponent
    }
}