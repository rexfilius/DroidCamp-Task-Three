package com.example.droidcamptaskthree

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_screen1.*

class Screen1Activity : AppCompatActivity(), ItemAdapter.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerview.layoutManager = layoutManager

        val adapter = ItemAdapter(this, ItemSupplier.items, this)
        recyclerview.adapter = adapter
    }

    override fun onItemClick(item: Item) {
        val intent = Intent(this, Screen2Activity::class.java)
        intent.putExtra(ITEM_NAME, item.name)
        intent.putExtra(ITEM_PRICE, item.price)
        intent.putExtra(ITEM_IMAGE, item.image)
        startActivity(intent)
    }
}
