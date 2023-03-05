package com.example.recycleviewerapp

import android.content.Context

class DataSource(val context: Context) {

    fun getStringArray() : Array<String> {
        return context.resources.getStringArray(R.array.flowers)
    }

}