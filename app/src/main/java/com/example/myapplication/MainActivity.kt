package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = GridLayoutManager(this,2)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view

        data.add(ItemsViewModel(R.drawable.cargo_jordan, "crago jordan "))
        data.add(ItemsViewModel(R.drawable.sweet_pant, "sweat pant " ))
        data.add(ItemsViewModel(R.drawable.dress,"dress"))
        data.add(ItemsViewModel(R.drawable.gas_jeans,"gas jeans"))
        data.add(ItemsViewModel(R.drawable.highwastejeans,"high waste jeans"))
        data.add(ItemsViewModel(R.drawable.slit_trouser,"slit trouser"))




        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}
