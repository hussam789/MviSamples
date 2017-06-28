package com.example.hussamlawen.mvisamples.SingleAction

import com.example.hussamlawen.mvisamples.base.uievents.UiEvent

/**
 * Created by hussamlawen on 6/27/17.
 */

// Ui Events/Intents
class SingleActionEvent : UiEvent


// UiModels/State

//sealed class Action {
//    class Loading : Action()
//    class Loaded(val newsList: List<NewsItem>) : Action()
//    class Error(val error: Throwable) : Action()
//}

data class LceUiModel (val loading: Boolean, val data: List<Object>, val error: Throwable)

data class SingleUiModel(val data: List<String> = emptyList())

// Sub-States or Partial States


// Result object