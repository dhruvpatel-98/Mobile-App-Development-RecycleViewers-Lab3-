package com.example.recycleviewerapp

import android.content.res.Resources
import com.example.recycleviewerapp.R

/* Returns initial list of flowers. */
fun flowerList(resources: Resources): List<Flower> {
    return listOf(
        Flower(
            id = 1,
            name = resources.getString(R.string.amaryllis),
            image = R.drawable.amaryllis,
            description = resources.getString(R.string.amaryllis_description)
        ),
        Flower(
            id = 2,
            name = resources.getString(R.string.lilly),
            image = R.drawable.lilly,
            description = resources.getString(R.string.lilly_description)
        ),
        Flower(
            id = 3,
            name = resources.getString(R.string.orchid),
            image = R.drawable.orchid,
            description = resources.getString(R.string.amaryllis_description)
        ),
        Flower(
            id = 4,
            name = resources.getString(R.string.sunflower),
            image = R.drawable.sunflower,
            description = resources.getString(R.string.tulip_description)
        ),
        Flower(
            id = 5,
            name = resources.getString(R.string.rose),
            image = R.drawable.rose,
            description = resources.getString(R.string.amaryllis_description)
        )
    )
}