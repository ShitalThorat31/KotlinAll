package com.shital.kotlinall.SharedPreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shital.kotlinall.databinding.ActivitySharedPreferenceBinding

class SharedPreferenceActivity : AppCompatActivity() {

    lateinit var binding: ActivitySharedPreferenceBinding
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding= ActivitySharedPreferenceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences=getSharedPreferences("noteData", Context.MODE_PRIVATE)


        binding.btnSubmit.setOnClickListener {

            val note=binding.edtNote.text.toString()

            val edit=sharedPreferences.edit()
            edit.putString("note",note)
            edit.apply()
            Toast.makeText(this,"Note Strored successfully",Toast.LENGTH_LONG).show()
            binding.edtNote.text.clear()

        }

        binding.btnGetNote.setOnClickListener {

            val storedNote=sharedPreferences.getString("note","")
            binding.txtGetNote.text=storedNote
        }


    }
}