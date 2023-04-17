package com.pr7.kotlin_base_activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

open class BaseFragment<VB:ViewBinding> constructor(
    val bindinginflater:(inflater:LayoutInflater)->VB
):Fragment() {

    lateinit var binding: VB
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= bindinginflater(inflater)

        return binding.root
    }

    fun showtoast(text:String){
        Toast.makeText(context,text, Toast.LENGTH_SHORT).show()
    }
}