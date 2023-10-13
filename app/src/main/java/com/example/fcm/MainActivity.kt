package com.example.fcm

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fcm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    var dataString : String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        Check that intent is null or not
        if(intent!=null)
        {
//            Check that intent has extra or not
            if(intent.hasExtra("Key"))
            {
//                Get the data from intent
                for (key in intent.extras!!.keySet())
                {
                    dataString += intent.extras!!.getString(key) + "\n"
                }
//                Set the data to textview
                binding.showText.text = dataString
            }
        }

    }
}