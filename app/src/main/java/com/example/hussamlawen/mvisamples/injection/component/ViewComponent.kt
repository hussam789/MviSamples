package com.example.hussamlawen.mvisamples.injection.component

import com.example.hussamlawen.mvisamples.SingleAction.SingleActionActivity
import dagger.Component
import com.example.hussamlawen.mvisamples.injection.module.ViewModule
import com.example.hussamlawen.mvisamples.injection.scope.ForView

@ForView
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(ViewModule::class))
interface ViewComponent {
    fun inject(activity: SingleActionActivity)
//    fun inject(activity: DetailActivity)
}
