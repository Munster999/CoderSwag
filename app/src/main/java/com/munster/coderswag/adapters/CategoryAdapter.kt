package com.munster.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.munster.coderswag.R
import com.munster.coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.*

// BaseAdapter() is the adapter that other adapters inherit from. CategoryAdapter requires the 2 params below:
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories
    // An 'adapter' that inherits from 'BaseAdapter' requires the 4 methods below
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View // initialise our 'View' output param
        // we now have a 'categoryView'
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        // we also have both Image and Name values
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)
        println("Heavy Computing") // NOTE: Shows that this way is much more processor intensive
        val category = categories[position]
        // convert the image name to a resource Id
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)
        categoryName.text = category.title
        return categoryView
    } // Gets a View that displays the data at the specified position in the data set.

    override fun getItem(position: Int): Any {
        return categories[position]
    } // Gets the data item associated with the specified position in the data set. (i.e. within the ListView)

    override fun getItemId(position: Int): Long {
        return 0
    } // Gets the row id associated with the specified position in the list. (i.e. Assigns an Id to each row - Not using in this e.g.)

    override fun getCount(): Int {
        return categories.count()
    } // How many items are in the data set represented by this Adapter.(i.e. how many categories are in the categories array)
}

/*
- 'BaseAdapter' - This is the 'adapter' that other adapters INHERIT from. Hence, an 'ArrayAdapter' will inherit from a 'BaseAdapter'
- So when we extend from the BaseAdapter we have some methods that we need to implement:
    - getView() - Get a View that displays the data at the specified position in the data set.
    - getItem() - Get the data item associated with the specified position in the data set.
    - getItemId() - Get the row id associated with the specified position in the list.
    - getCount() - How many items are in the data set represented by this Adapter.
- CategoryAdapter() requires the same params as an ArrayAdapter, hence:
    - context
    - resource (i.e. the datasource involved - i.e. the list of category items - categories: List<Category>)
- GetView() method
    - Input params = position, convertView, parent
    - Return param = View
    - Next we initialise [ categoryView ]
    - LayoutInflater() - Instantiates a layout XML file into its corresponding View objects. (i.e. Converts XML objects into View objects)
    - So, now we inflate a view called 'categoryView' FROM the xml file 'category_list_item.xml'


*/