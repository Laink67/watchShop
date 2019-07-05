package com.example.watchshop.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import com.example.watchshop.R

class AuthenticationActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        val buttonLogin = findViewById<Button>(R.id.button_login)
        progressBar = findViewById<ProgressBar>(R.id.main_progress_bar)

        buttonLogin.setOnClickListener(View.OnClickListener {
            progressBar.visibility = View.VISIBLE
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }

    override fun onStart() {
        super.onStart()
        progressBar.visibility = View.INVISIBLE
    }
}
