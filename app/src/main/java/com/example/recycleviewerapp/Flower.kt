package com.example.recycleviewerapp

import androidx.annotation.DrawableRes

data class Flower(
    val id: Long,
    val name: String,
    @drawableRes
    val image: Int?,
    val description: String
    ) {
    annotation class drawableRes
}


