package com.bootcamp.inviobootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bootcamp.inviobootcampodev4.databinding.FragmentYBinding

class YFragment : Fragment(R.layout.fragment_y) {

    private lateinit var binding: FragmentYBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentYBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
    }
}