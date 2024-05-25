package com.example.support.ui.wallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.support.R
import com.example.support.databinding.FragmentBudgetBinding
import com.example.support.databinding.FragmentWalletBinding


class WalletFragment : Fragment() {

    private var _binding: FragmentWalletBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val walletViewModel = ViewModelProvider(this).get(WalletViewModel::class.java)
        _binding = FragmentWalletBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}