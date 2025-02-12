package com.first.hello

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var button_add:Button
    lateinit var button_subtract:Button
    lateinit var button_division:Button
    lateinit var button_modulus:Button
 //   lateinit var result:Button
    lateinit var ResultView:TextView
    lateinit var button_multiply:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            button_add=findViewById(R.id.button_add)
            button_subtract=findViewById(R.id.button_subtract)
            button_division=findViewById(R.id.button_division)
            button_modulus=findViewById(R.id.button_modulus)
            button_multiply=findViewById(R.id.button_multiply)
            ResultView=findViewById(R.id.ResultView)

        button_add.setOnClickListener(this)
        button_subtract.setOnClickListener(this)
        button_division.setOnClickListener(this)
        button_modulus.setOnClickListener(this)
        button_multiply.setOnClickListener(this)
    //    result.setOnClickListener(this)
        }


    override fun onClick(v: View?) {
        var a=findViewById<EditText>(R.id.text1).text.toString().toDouble()
        var b=findViewById<EditText>(R.id.text2).text.toString().toDouble()
        var result=0.0
        when(v?.id){
            R.id.button_add->{result=a+b}
            R.id.button_subtract->{result=a-b}
            R.id.button_division->{result=a/b}
            R.id.button_modulus->{result=a%b}
            R.id.button_multiply->{result=a*b}
            R.id.clear->{ ResultView.text=" "}
        }
           ResultView.text="$result"
        }

}
