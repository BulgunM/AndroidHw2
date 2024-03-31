package com.example.layout

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import com.example.layout.databinding.CustomViewBinding

class CustomView (context: Context,
     attrs: AttributeSet) : RelativeLayout(context, attrs) {
         private val binding: CustomViewBinding

init {
    val view = inflate(context, R.layout.custom_view, this)
    binding = CustomViewBinding.bind(view)
}

    fun setTopText(text: String) {
        binding.topText.text = text
    }

    fun setBottomText(text: String) {
        binding.bottomText.text = text
    }
}