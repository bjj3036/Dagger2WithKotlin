package kr.hs.dgsw.daggerwithkotlin.test

import kr.hs.dgsw.daggerwithkotlin.di.PerActivity
import kr.hs.dgsw.daggerwithkotlin.di.SubScope
import javax.inject.Inject

//Module에서 Provides를 하지 않더라도 Inject가 가능하다
//constructor에 @Inject를  붙여줘야하는 거 같다
//Provides는 methods를 통해 더 설정해주거나 Type Cast를 해야할 경우에 쓰이는 것 같다
//Scope는 중요하다

@SubScope
class Dog @Inject constructor():Animal(){
    override fun bark(): String =  "bark! bark!"
}

open abstract class Animal{
    abstract fun bark():String
}