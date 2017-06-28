package com.example.hussamlawen.mvisamples.SingleAction

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.hussamlawen.mvisamples.base.uievents.UiEvent
import com.example.hussamlawen.mvisamples.injection.scope.ForView
import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.Subject
import javax.inject.Inject

/**
 * Created by hussamlawen on 6/27/17.
 */
class SingleActivityPresenter(val singleInteractor: SingleInteractor ) : ViewModel(), Contract.Presenter {

    private var currentState = SingleUiModel()
    override val uiEvents: Subject<UiEvent> = BehaviorSubject.create<UiEvent>()

    override fun renderUiModel(): Observable<SingleUiModel> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        @ForView
        class Factory @Inject constructor(val singleInteractor: SingleInteractor) : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>?): T {
                //This is ugly
                @Suppress("UNCHECKED_CAST")
                return SingleActivityPresenter(singleInteractor) as T
            }
        }
    }
}