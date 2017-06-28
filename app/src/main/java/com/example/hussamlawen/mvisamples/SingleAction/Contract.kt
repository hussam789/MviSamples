package com.example.hussamlawen.mvisamples.SingleAction

import com.example.hussamlawen.mvisamples.base.uievents.UiEvent
import io.reactivex.Observable
import io.reactivex.subjects.Subject

/**
 * Created by hussamlawen on 6/27/17.
 */
interface Contract {
    interface Presenter {
        val uiEvents: Subject<UiEvent>
        fun renderUiModel(): Observable<SingleUiModel>
    }
}