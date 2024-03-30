package com.example.basiccalc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var num1: EditText =findViewById(R.id.num1)
        var num2:EditText=findViewById(R.id.num2)
        var result: TextView =findViewById(R.id.result)
        var btnadd: Button =findViewById(R.id.btnadd)
        var btnsub:Button=findViewById(R.id.btnsub)
        var btnmul:Button=findViewById(R.id.btnmul)
        var btndiv:Button=findViewById(R.id.btndiv)
        var btnclr:Button=findViewById(R.id.btnclr)
        var a:Float=num1.text.toString().toFloat()
        var b:Float=num2.text.toString().toFloat()

        btnadd.setOnClickListener(){
            result.text= (a+b).toString()
        }
        btnsub.setOnClickListener(){
            result.text=(a-b).toString()
        }
        btnmul.setOnClickListener(){
            result.text=(a*b).toString()
        }
        btndiv.setOnClickListener(){
            result.text=(a/b).toString()
        }
        btnclr.setOnClickListener(){
            num1.setText("")
            num2.setText("")
            result.text=""
        }
    }
}