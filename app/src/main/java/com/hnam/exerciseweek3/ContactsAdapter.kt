package com.hnam.exerciseweek3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by nampham on 3/10/18.
 */

class ContactsAdapter// Pass in the contact array into the constructor
(// Store the context for easy access
        // Easy access to the context object in the recyclerview
        private val context: Context, // Store a member variable for the contacts
        private val mContacts: List<Contact>?) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return mContacts?.size ?: 0
    }



    // Usually involves inflating a layout from XML and returning the holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.item_contact, parent, false)

        // Return a new holder instance
        return ViewHolder(contactView)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: ContactsAdapter.ViewHolder, position: Int) {
        // Get the data model based on position
        val contact = mContacts?.get(position)

        // Set item views based on your views and data model
        val textView = viewHolder.nameTextView
        textView.text = contact?.name
        val button = viewHolder.messageButton
        button.text = if (contact?.isOnline!!) "Message" else "Offline"
        button.isEnabled = contact.isOnline
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    open inner class ViewHolder// We also create a constructor that accepts the entire item row
    // and does the view lookups to find each subview
    (itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        var nameTextView: TextView
        var messageButton: Button

        init {

            nameTextView = itemView.findViewById<View>(R.id.contact_name) as TextView
            messageButton = itemView.findViewById<View>(R.id.message_button) as Button
        }// Stores the itemView in a public final member variable that can be used
        // to access the context from any ViewHolder instance.
    }
}
