package com.bootcamp.inviobootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.bootcamp.inviobootcampodev4.databinding.FragmentABinding


class AFragment : Fragment(R.layout.fragment_a) {

    private lateinit var binding: FragmentABinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentABinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        val bundle: AFragmentArgs by navArgs() //by delegate
        val gelenNesne = bundle.nesne

        binding.apply {

            g1.setText("Ad: ${gelenNesne.ad}")
            g2.setText("Yaş: ${gelenNesne.yas.toString()}")

            if (gelenNesne.covidMi == false)
                g3.setText("Korona Mı?: Hayır")
            else
                g3.setText("Korona Mı?: Evet")

            goB.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_AFragment_to_BFragment)
            }
        }
    }
}