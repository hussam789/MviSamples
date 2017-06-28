package com.example.hussamlawen.mvisamples

import android.app.Application
import android.content.Context
import com.jakewharton.threetenabp.AndroidThreeTen
import com.example.hussamlawen.mvisamples.injection.component.ApplicationComponent
import fmrsabino.moviesdb.injection.component.DaggerApplicationComponent
import com.example.hussamlawen.mvisamples.injection.module.ApplicationModule
import timber.log.Timber

/**
 * Created by hussamlawen on 6/27/17.
 */
class MviSamplesApp : Application() {
    val component: ApplicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    companion object {
        operator fun get(context: Context): MviSamplesApp {
            return context.applicationContext as MviSamplesApp
        }
    }
}
