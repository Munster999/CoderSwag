package com.munster.coderswag.services

import com.munster.coderswag.model.Category
import com.munster.coderswag.model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Balck", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Balck", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Balck", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$25", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$32", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$25", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$32", "hoodie4"),
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$25", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Red Shirt", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Devslopes Kickflip Studios", "$18", "shirt5"),
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Red Shirt", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Devslopes Kickflip Studios", "$18", "shirt5"),
            Product("Devslopes Shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Red Shirt", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Devslopes Kickflip Studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>() // needed to add in an array for DigitalGoods as well (empty array)

    fun getProducts(category: String) : List<Product> {
        return when (category) { // 'return' keyword is placed here to save you from using it after every return statement
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        } // Returns correct product list based upon the string that is passed into it
    }
}

/*
- Create both Categories and then Products

*/