package com.example.editprofile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.editprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        //setupToolbar()

    }

    /*private fun setupToolbar() {
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }*/

    /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_close, menu)
        return true
    }*/
}