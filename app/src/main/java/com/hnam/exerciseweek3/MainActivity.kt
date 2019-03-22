package com.hnam.exerciseweek3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnListView = findViewById<Button>(R.id.btn_listView)
        btnListView.setOnClickListener {
            val i = Intent(this@MainActivity, ListViewActivity::class.java)
            startActivity(i)
        }

        val btnRecyclerView = findViewById<Button>(R.id.btn_recyclerView)
        btnRecyclerView.setOnClickListener {
            val i = Intent(this@MainActivity, RecyclerViewActivity::class.java)
            startActivity(i)
        }
    }
}
