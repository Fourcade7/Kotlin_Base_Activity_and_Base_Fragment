package com.pr7.kotlin_base_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pr7.kotlin_base_activity.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.beginTransaction().replace(R.id.linearlay1,HomeFragment()).commit()
        binding.apply {

        }



    }
}