package com.example.hussamlawen.mvisamples.base.uievents

interface UiEvent

class RefreshEvent : UiEvent

class LoadDataEvent : UiEvent

data class addNewTask (val taskName:String)