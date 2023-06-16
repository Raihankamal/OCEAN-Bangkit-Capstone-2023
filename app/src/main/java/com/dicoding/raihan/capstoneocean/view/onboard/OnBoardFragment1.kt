package com.dicoding.raihan.capstoneocean.view.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.dicoding.raihan.capstoneocean.R
import com.dicoding.raihan.capstoneocean.databinding.FragmentOnBoard1Binding

class OnBoardFragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentOnBoard1Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOnBoard1Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtOb1.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_onBoardFragment1_to_onBoardFragment2)
        )

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}