package com.piyush.testlibrary

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class CustomizedLinearLayout: LinearLayout {

    constructor(context: Context?) : super(context) {
        initializeView()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initializeView()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initializeView()
    }
    
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        initializeView()
    }

    private fun initializeView() {
        inflate(context, R.layout.customized_linear_layout, this)
    }
}