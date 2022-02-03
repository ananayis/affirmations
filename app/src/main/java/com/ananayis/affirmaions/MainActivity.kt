package com.ananayis.affirmaions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ananayis.affirmaions.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView: TextView = findViewById(R.id.textView)
//        textView.text = DataSource().loudAffirmation().size.toString()
    }
}