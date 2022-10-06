package com.bootcamp.inviobootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bootcamp.inviobootcampodev4.databinding.FragmentBBinding

class BFragment : Fragment(R.layout.fragment_b) {

    private lateinit var binding: FragmentBBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentBBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.goY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_BFragment_to_YFragment)
        }
    }
}
