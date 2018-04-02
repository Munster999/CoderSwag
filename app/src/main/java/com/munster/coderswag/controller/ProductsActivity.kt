package com.munster.coderswag.controller

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.munster.coderswag.R
import com.munster.coderswag.adapters.ProductsAdapter
import com.munster.coderswag.model.Product
import com.munster.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_products.*
import utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter  // created outside onCreate() so we can use it elsewhere

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY) // this gets us the category that was clicked on
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) // gets initialised here

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        } // This checks if phone is in landscape mode then it creates 3 columns for display

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            spanCount = 3
        } // This checks if tablet then create 3 columns in both orientations

        val layoutManager = GridLayoutManager(this, spanCount) // span count shows the number of columns you require
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}