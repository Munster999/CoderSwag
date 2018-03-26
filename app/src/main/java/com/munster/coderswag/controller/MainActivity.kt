package com.munster.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.munster.coderswag.R
import com.munster.coderswag.model.Category
import com.munster.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category> // Initialise the adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter( this, // context
                                android.R.layout.simple_list_item_1, // type of view
                                DataService.categories) // data that will be required to be adapted
        categoryListview.adapter = adapter // Now we need to tell the listview WHO it needs to listen to
    }
}

/*
LISTVIEW
---------

- We have a listview, we have data so now we need a way for the data to be inserted into the listview
- To do this we need certain components:

        DATASOURCE      ----->  ADAPTER         ---->   LISTVIEW
        (Data Model)            (Interface)             (ListView)

    - An adapter (The 'interface' or 'go-between' the data and the listview)
    - This takes the data from the datasource, converts the data, formats it and outputs it into the listview component.

- So in order to create an 'ArrayAdapter' we need to do the following things:
    1 - Initialise the adapter
    2 - Pass the following params into the adapter:
        1 - Context
        2 - The type of view that the 'listview' requires (android.R.layout.simple_list_item_1)
        3 - the data that will be required to be adapted. (Dataservice.categories)
    3 - Now we need to tell the listview WHO it needs to listen to (.adapter)
*/