package com.example.support.ui.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.support.R
import com.example.support.databinding.FragmentBudgetBinding
import com.example.support.databinding.FragmentTodolistBinding
import com.example.support.databinding.FragmentWalletBinding
import com.example.support.ui.wallet.WalletViewModel


class  TodolistFragment : Fragment() {

    private var _binding: FragmentTodolistBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val walletViewModel = ViewModelProvider(this).get(TodolistViewModel::class.java)
        _binding = FragmentTodolistBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.text
//        walletViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}