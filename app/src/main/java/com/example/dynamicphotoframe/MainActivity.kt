package com.example.dynamicphotoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.dynamicphotoframe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    var currentimage = 0

    val names = arrayOf("Benazir Bhutto", "Imran Khan", "Mariyam Mukhtar")
    lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imgprevbtn.setOnClickListener {

            val idOfCurrentImgString = "pic$currentimage"

            val idOfCurrentImgInt = this.resources.getIdentifier(idOfCurrentImgString, "id", packageName)

            image = findViewById(idOfCurrentImgInt)

            image.alpha = 0f

            currentimage = (3 + currentimage-1)%3

            val idOfCurrentImgToShowString = "pic$currentimage"

            val idOfCurrentImgToShowInt = this.resources.getIdentifier(idOfCurrentImgToShowString, "id", packageName)

            image = findViewById(idOfCurrentImgToShowInt)

            image.alpha = 1f

            binding.tVNames.text = names[currentimage]
        }

        binding.imgnextbtn.setOnClickListener {

            val idOfCurrentImgString = "pic$currentimage"

            val idOfCurrentImgInt = this.resources.getIdentifier(idOfCurrentImgString, "id", packageName)

            image = findViewById(idOfCurrentImgInt)

            image.alpha = 0f

            currentimage = (3 + currentimage+1)%3

            val idOfCurrentImgToShowString = "pic$currentimage"

            val idOfCurrentImgToShowInt = this.resources.getIdentifier(idOfCurrentImgToShowString, "id", packageName)

            image = findViewById(idOfCurrentImgToShowInt)

            image.alpha = 1f

            binding.tVNames.text = names[currentimage]
        }
    }
}