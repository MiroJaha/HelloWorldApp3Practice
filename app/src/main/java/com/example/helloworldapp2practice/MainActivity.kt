package com.example.helloworldapp2practice

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text as Text1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Entry = findViewById<EditText>(R.id.editTextEntry)
        var listShow=findViewById<TextView>(R.id.EntredText)
        val addB=findViewById<Button>(R.id.BAdd)
        val deleteB=findViewById<Button>(R.id.BDelete)

        var list= arrayListOf<String>()
        var str =""

        addB.setOnClickListener{
            if(Entry.text.isBlank()){
                listShow.text="Please Enter Something"
            }
            else {
                list.add(Entry.text.toString())
                str = ""
                for (i in list) {
                    str += i + "\n"
                }
                listShow.text = str
                Entry.text = null
            }
        }

        deleteB.setOnClickListener{
            str=""
            if(list.size==0)
                listShow.text="Nothing There to Delete"
            else {
                list.remove(list[list.size - 1])
                for (i in list) {
                    str+=i+"\n"
                }
                listShow.text=str
            }
        }
    }
}