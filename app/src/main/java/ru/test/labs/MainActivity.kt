package ru.test.labs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.start_btn)
        val nameInput = findViewById<EditText>(R.id.name_input)

        startButton.setOnClickListener {
            intent = Intent(this, Activity2::class.java)
            intent.putExtra("USERNAME", nameInput.text.toString())

            startActivity(intent)
        }
    }
}