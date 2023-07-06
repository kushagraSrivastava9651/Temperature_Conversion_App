package com.example.temperature_convertor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


private lateinit var input:EditText
private lateinit var f2h:RadioButton
private lateinit var c2f:RadioButton
private lateinit var btn:Button
private lateinit var out:TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input=findViewById(R.id.enter)
          f2h=findViewById(R.id.f2h)
        c2f=findViewById(R.id.c2f)
       btn=findViewById(R.id.result)
        out=findViewById(R.id.output)


        btn.setOnClickListener  {

     if(f2h.isChecked){
        out.setText(((((input.text.toString().toDouble())-32)*5)/9).toString().plus("Degree Celcius"))
     }
    else if(c2f.isChecked){
         out.setText(((((input.text.toString().toDouble())*9)/5)+32).toString().plus("Degree Fahreneit"))

     }
         }
    }








}


