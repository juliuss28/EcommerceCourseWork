package com.example.ecommercecoursework

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
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
        binding.availability.setOnClickListener{
            AlertDialog.Builder(this)
                .setMessage("$title есть в наличии!")
                .setPositiveButton("Ок", object : DialogInterface.OnClickListener {
                    override fun onClick(p0: DialogInterface?, p1: Int) {

                    }
                })
                .create()
                .show()

        }
    }
}