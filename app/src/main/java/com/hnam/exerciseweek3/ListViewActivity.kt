package com.hnam.exerciseweek3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

import java.util.ArrayList

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val ls = findViewById<ListView>(R.id.listView)

        val data = ArrayList<String>()
        for (i in 0..19) {
            data.add("Item " + (i + 1))
        }

        val adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, data)
        ls.adapter = adapter

        ls.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id -> Toast.makeText(this@ListViewActivity, "click " + data[position], Toast.LENGTH_SHORT).show() }

        ls.onItemLongClickListener = AdapterView.OnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this@ListViewActivity, "long click " + data[position], Toast.LENGTH_SHORT).show()
            true
        }


    }
}
