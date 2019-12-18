package kr.hs.dgsw.daggerwithkotlin

import kr.hs.dgsw.daggerwithkotlin.di.components.*
import kr.hs.dgsw.daggerwithkotlin.di.modules.SubModule
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    lateinit var activityComponent: AppComponent
    lateinit var subComponent: SubComponent

    @Before
    fun before() {
        activityComponent = DaggerAppComponent.create()
        subComponent = activityComponent.subComponentBuilder().build()
    }

    @Test
    fun addition_isCorrect() {
        assertNotNull(subComponent.apiInterface())
        assertEquals(subComponent.dog().hashCode(), subComponent.dog().hashCode())
    }
}
