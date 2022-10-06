package com.bootcamp.inviobootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.bootcamp.inviobootcampodev4.databinding.FragmentXBinding


class XFragment : Fragment(R.layout.fragment_x) {

    private lateinit var binding: FragmentXBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentXBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        val bundle: XFragmentArgs by navArgs()
        val gelenNesne = bundle.nesne2

        binding.apply {

            c1.setText("Ad: ${gelenNesne.ad}")
            c2.setText("Yaş: ${gelenNesne.yas}")

            if (gelenNesne.covidMi == false)
                c3.setText("Korona mı?: Hayır")
            else
                c3.setText("Korona mı?: Evet")
        }

        binding.goYftomX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_XFragment_to_YFragment)
        }
    }
}

