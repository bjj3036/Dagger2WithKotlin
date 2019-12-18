package kr.hs.dgsw.daggerwithkotlin.di

import javax.inject.Qualifier
import javax.inject.Scope

// Module과 Component의 생명주기를 정하는 거라 보면 될 거 같다
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class SubScope