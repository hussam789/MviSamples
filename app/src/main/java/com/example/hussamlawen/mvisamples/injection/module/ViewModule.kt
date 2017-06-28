package com.example.hussamlawen.mvisamples.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import com.example.hussamlawen.mvisamples.injection.scope.ActivityContext
import com.example.hussamlawen.mvisamples.injection.scope.ForView

@Module
class ViewModule(val context: Context) {
    @Provides
    @ForView
    @ActivityContext
    fun providesContext() = context
}