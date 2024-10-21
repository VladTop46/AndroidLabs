package ru.test.labs

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("USERNAME")

        val textView = findViewById<TextView>(R.id.name_text_view)
        textView.text = "Hello, $name"
    }
}