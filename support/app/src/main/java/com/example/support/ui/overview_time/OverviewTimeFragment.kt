package com.example.support.ui.overview_time

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.support.databinding.FragmentOverviewTimeBinding


class OverviewTimeFragment : Fragment() {

    private var _binding: FragmentOverviewTimeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val overviewTimeViewModel = ViewModelProvider(this).get(OverviewTimeViewModel::class.java)
        _binding = FragmentOverviewTimeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}