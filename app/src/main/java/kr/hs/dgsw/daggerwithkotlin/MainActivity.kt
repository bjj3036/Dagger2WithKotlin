package kr.hs.dgsw.daggerwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kr.hs.dgsw.daggerwithkotlin.di.components.ActivityComponent
import kr.hs.dgsw.daggerwithkotlin.di.components.DaggerActivityComponent
import kr.hs.dgsw.daggerwithkotlin.di.modules.ActivityModule
import kr.hs.dgsw.daggerwithkotlin.di.modules.NetModule
import kr.hs.dgsw.daggerwithkotlin.utils.ApiInterface
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mString:String
    @Inject
    lateinit var mApiInterface:ApiInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var activityComponent = DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule())
            .netModule(NetModule())
            .build()

        activityComponent.inject(this)
        textView.setText(mString)
        Log.d("Dagger", mApiInterface.toString())
    }
}
