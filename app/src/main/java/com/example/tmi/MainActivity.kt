package com.example.tmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var accountname = findViewById<EditText>(R.id.accountName)
        var accountnumber = findViewById<EditText>(R.id.accountNumber)
        var button = findViewById<Button>(R.id.accountAssign)
        var backbutton = findViewById<TextView>(R.id.backButton)
        var spinner = findViewById<Spinner>(R.id.spinner)
        var categoryComboBox = findViewById<Spinner>(R.id.spinner)

        val sAdapter = ArrayAdapter.createFromResource(this, R.array.catrgories, android.R.layout.simple_spinner_dropdown_item)
        categoryComboBox.setAdapter(sAdapter);

        button.setOnClickListener {
            if((accountname.text.toString()!=null)and(accountnumber.text.toString()!=null)and(categoryComboBox.text.toString()!=null)){
                button.setBackgroundResource(R.drawable.button_background)
                Toast.makeText(this, "계좌 등록이 완료되었습니다.", Toast.LENGTH_SHORT).show()

            }
            else{
                button.setBackgroundResource(R.drawable.buttonbackground2)
                Toast.makeText(this, "정보를 모두 입력해주세요", Toast.LENGTH_SHORT).show()
            }
        }
        backbutton.setOnClickListener{
            startActivity(Intent(this, ::class.java))
        }
    }
    override fun onBackPressed() {
        //super.onBackPressed()
    }
}