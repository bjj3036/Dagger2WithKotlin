package kr.hs.dgsw.daggerwithkotlin

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_main.*
import kr.hs.dgsw.daggerwithkotlin.di.components.ActivityComponent
import kr.hs.dgsw.daggerwithkotlin.di.components.DaggerActivityComponent
import kr.hs.dgsw.daggerwithkotlin.di.modules.ActivityModule
import kr.hs.dgsw.daggerwithkotlin.di.modules.NetModule
import kr.hs.dgsw.daggerwithkotlin.test.Dog
import kr.hs.dgsw.daggerwithkotlin.utils.ApiInterface
import javax.inject.Inject
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mString: String
    @Inject
    lateinit var mApiInterface: ApiInterface
    @Inject
    lateinit var mSharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activityComponent = DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule(this))
            .appComponent(InitApplication.get(applicationContext).getComponent())
            .build()

        activityComponent.inject(this)
        textView.setText(mString)
        Log.d("Dagger", mApiInterface.toString())
        Log.d("Dagger", mSharedPreferences.toString())
    }

}
