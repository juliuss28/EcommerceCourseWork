package com.example.ecommercecoursework

import android.app.Activity
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
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
        binding.availability.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("$title есть в наличии!")
                .setPositiveButton("Ок") { dialog, _ ->
                    dialog.dismiss()
                }
                .create()
                .show()
        }
        var selectedButton: Button? = null

        fun selectButton(button: Button) {
            button.setBackgroundResource(R.drawable.selected_button_border)
        }

        fun resetButton(button: Button) {
            button.setBackgroundResource(R.drawable.reset_button)
            button.setTextColor(Color.BLACK)
        }

        val sSizeButton = findViewById<Button>(R.id.s_size)
        val mSizeButton = findViewById<Button>(R.id.m_size)
        val lSizeButton = findViewById<Button>(R.id.l_size)

        sSizeButton.setOnClickListener {
            selectedButton?.let { resetButton(it) }
            selectButton(sSizeButton)
            selectedButton = sSizeButton
        }

        mSizeButton.setOnClickListener {
            selectedButton?.let { resetButton(it) }
            selectButton(mSizeButton)
            selectedButton = mSizeButton
        }

        lSizeButton.setOnClickListener {
            selectedButton?.let { resetButton(it) }
            selectButton(lSizeButton)
            selectedButton = lSizeButton
        }

    }
}