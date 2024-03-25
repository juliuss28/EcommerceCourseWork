package com.example.ecommercecoursework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProductDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)
        val title = intent.getStringExtra("title")
        //пока криво - 3 видео
        val product_name: TextView = findViewById(R.id.product_name)
        product_name.text = title
    }
}