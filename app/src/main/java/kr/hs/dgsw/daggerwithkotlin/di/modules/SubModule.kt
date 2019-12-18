package kr.hs.dgsw.daggerwithkotlin.di.modules

import dagger.Binds
import dagger.Module
import dagger.Provides
import kr.hs.dgsw.daggerwithkotlin.di.PerActivity
import kr.hs.dgsw.daggerwithkotlin.di.SubScope
import kr.hs.dgsw.daggerwithkotlin.test.Animal
import kr.hs.dgsw.daggerwithkotlin.test.Dog

@Module
abstract class SubModule {

    @Binds
    abstract fun bindsDog(dog: Dog): Animal

}