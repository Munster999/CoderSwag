package com.munster.coderswag.model


class Category(val title: String, val image: String) {

    override fun toString(): String {
        return title
    } // returns the title of the category (NOT the default value)

}