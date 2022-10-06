package com.bootcamp.inviobootcampodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.FragmentNavigator
import com.bootcamp.inviobootcampodev4.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment(R.layout.fragment_ana_sayfa) {

    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentAnaSayfaBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        val kisi = Kisiler("Eren Erengil", 27, false)
        val kisi2 = Kisiler("Kerem Keremgil", 35, true)

        binding.apply {

            goA.setOnClickListener {
                val gecis =
                    AnaSayfaFragmentDirections.actionAnaSayfaFragmentToAFragment(nesne = kisi)
                Navigation.findNavController(it).navigate(gecis)
            }

            goX.setOnClickListener {
                val gecis2 =
                    AnaSayfaFragmentDirections.actionAnaSayfaFragmentToXFragment(nesne2 = kisi2)
                Navigation.findNavController(it).navigate(gecis2)
            }

        }

    }
}