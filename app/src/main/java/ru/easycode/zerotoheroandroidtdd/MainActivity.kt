package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeBtn = findViewById<Button>(R.id.changeButton)
        val myView = findViewById<TextView>(R.id.titleTextView)

        changeBtn.setOnClickListener {
            myView.setText("I am an Android Developer!")
        }
    }
}