package com.munster.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.munster.coderswag.R
//import com.munster.coderswag.R.id.categoryListview
import com.munster.coderswag.adapters.CategoryAdapter
import com.munster.coderswag.model.Category
import com.munster.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter // Initialise the adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, // context
                                  DataService.categories) // data that will be required to be adapted
        categoryListView.adapter = adapter // Now we need to tell the listview WHO it needs to listen to

        categoryListView.setOnItemClickListener { adapterView, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        } // NOTE: THIS WILL NOT WORK WITH RECYCLERVIEW !!!!
    }
}

/*

RECYCLERVIEW
------------


*/