package com.example.hussamlawen.mvisamples.SingleAction

import com.nhaarman.mockito_kotlin.mock
import org.junit.Before

import org.junit.Assert.*

/**
 * Created by hussamlawen on 6/27/17.
 */
class SingleActivityPresenterTest {

    lateinit var presenter : SingleActivityPresenter
    lateinit var interactor: SingleInteractor

    @Before
    fun setUp() {
        interactor = mock()
        presenter.uiEvents
    }

}