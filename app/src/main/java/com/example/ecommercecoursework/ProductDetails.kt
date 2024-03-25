package com.example.ecommercecoursework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ecommercecoursework.databinding.ProductDetailsBinding


class ProductDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ProductDetailsBinding

        super.onCreate(savedInstanceState)
        binding = ProductDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val title = intent.getStringExtra("title")
        binding.productName.text = title
        binding.availability
    }
}