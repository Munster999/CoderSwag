package com.munster.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.munster.coderswag.R
import utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY) // this gets us the category that was clicked on
        println(categoryType)

    }
}