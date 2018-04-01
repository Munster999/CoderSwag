package com.munster.coderswag.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.munster.coderswag.R
import com.munster.coderswag.adapters.CategoryRecyclerAdapter
import com.munster.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(
                this,
                DataService.categories,
                { category -> val productIntent = Intent(this, ProductsActivity::class.java)
                    productIntent.putExtra(EXTRA_CATEGORY, category.title) // this tells us which category was clicked on
                    startActivity(productIntent) // starts the intent (i.e. other screen)
                })  // New 'Lambda expression' param
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true) // used for optimisation
    }
}

