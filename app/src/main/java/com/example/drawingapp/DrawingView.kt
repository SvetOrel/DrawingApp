package com.example.drawingapp

import android.content.Context
import android.graphics.Path
import android.util.AttributeSet
import android.view.View


class DrawingView(context : Context, attrs : AttributeSet) : View(context , attrs) {

    private var mDrawPath : CustomPath? = null

    internal inner class CustomPath : Path() {

    }
}