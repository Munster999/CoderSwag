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

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View // initialise our 'View' type param
        val holder: ViewHolder // initialise our 'ViewHolder' type param
        if (convertView == null) { // Means this is the very first time the views are being presented, Hence, we
                                   // continue with finding the categoryview and name and then inflating
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage) // reassign using the 'holder' parent object
            holder.categoryName = categoryView.findViewById(R.id.categoryName) // holder now has references to the IDs
            // BELOW: Allows us to recycle our 'views' into the holders. (Means we do not have to recreate and re-inflate our views each time)
            categoryView.tag = holder // This gives a unique value to the CategoryView
        } else { // if there is already a cell created we will reuse it
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
        val category = categories[position]
        // convert the image name to a resource Id
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    } // Gets a View that displays the data at the specified position in the data set.

    override fun getItem(position: Int): Any {
        return categories[position]
    } // Gets the data item associated with the specified position in the data set.
    // (i.e. within the ListView)

    override fun getItemId(position: Int): Long {
        return 0
    } // Gets the row id associated with the specified position in the list.
    // (i.e. Assigns an Id to each row - Not using in this e.g.)

    override fun getCount(): Int {
        return categories.count()
    } // How many items are in the data set represented by this Adapter.(i.e. how many categories
    // are in the categories array)

    private class ViewHolder {
        var categoryImage: ImageView? = null // need this to start out null
        var categoryName: TextView? = null
    } // This class holds a reference to the 'categoryImage' & its 'name'
}

/*


*/