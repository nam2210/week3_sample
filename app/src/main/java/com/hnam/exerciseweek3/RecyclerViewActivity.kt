package com.hnam.exerciseweek3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var contacts: List<Contact>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        // Lookup the recyclerview in activity layout
        val rvContacts = findViewById<RecyclerView>(R.id.recycler_view)

        // Initialize contacts
        contacts = Contact.createContactsList(20)
        // Create adapter passing in the sample user data
        val adapter = ContactsAdapter(this, contacts)

        rvContacts.apply {
            // Attach the adapter to the recyclerview to populate items
            this.adapter = adapter
            // Set layout manager to position the items
            this.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
        }


    }
}
