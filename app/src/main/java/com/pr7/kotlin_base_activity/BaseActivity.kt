package com.pr7.kotlin_base_activity

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

open class BaseActivity<VB : ViewBinding> constructor(
        val bindinginflater:(layouinflater:LayoutInflater)->(VB)
):AppCompatActivity() {
    lateinit var binding:VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=bindinginflater.invoke(layoutInflater)
        setContentView(binding.root)

    }

    fun showtoast(text:String){
        Toast.makeText(this@BaseActivity,text,Toast.LENGTH_SHORT).show()
    }
}