package com.drozdova.musicplayerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import com.drozdova.musicplayerapp.databinding.ActivityMainBinding
import com.drozdova.musicplayerapp.view.FragmentPlayOneTrack

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        startFragment()
    }

    private fun startFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentPlayOneTrack())
            .commit()
    }
}