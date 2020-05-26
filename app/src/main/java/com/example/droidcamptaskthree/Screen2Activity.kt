package com.example.droidcamptaskthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val name = intent.getStringExtra(ITEM_NAME)
        val price = intent.getStringExtra(ITEM_PRICE)
        val image = intent.getIntExtra(ITEM_IMAGE, 1)

        screen2_name_holder.text = name?.toString()
        screen2_price_holder.text = price?.toString()
        screen2_imageview.setImageResource(image)

    }
}
