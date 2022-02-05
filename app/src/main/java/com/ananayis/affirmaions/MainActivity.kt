package com.ananayis.affirmaions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ananayis.affirmaions.adapter.ItemAdapter
import com.ananayis.affirmaions.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView: TextView = findViewById(R.id.textView)
//        textView.text = DataSource().loudAffirmation().size.toString()


        // Initialize data.
        val myDataset = DataSource().loudAffirmation()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}

