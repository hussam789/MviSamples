package com.example.hussamlawen.mvisamples.injection.component

import android.app.Application
import android.content.Context
import com.squareup.picasso.Picasso
import dagger.Component
import com.example.hussamlawen.mvisamples.injection.module.ApplicationModule
import com.example.hussamlawen.mvisamples.injection.scope.ApplicationContext
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun application(): Application
    @ApplicationContext fun context(): Context
//    fun dataManager(): DataManager
    fun picasso(): Picasso
}
