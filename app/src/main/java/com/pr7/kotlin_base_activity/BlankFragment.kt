package com.pr7.kotlin_base_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pr7.kotlin_base_activity.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {

    lateinit var binding: FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding=FragmentBlankBinding.inflate(inflater,container,false)

        return binding.root
    }


}