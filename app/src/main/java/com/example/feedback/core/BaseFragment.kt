package com.example.feedback.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    private var _binding: VB? = null
    val binding get() = _binding!!

    protected abstract fun initBinding(inflater: LayoutInflater): VB

    inline fun <reified VM : ViewModel> initViewModel(): VM {
        val viewModel by viewModels<VM> { requireContext().appComponent().viewModelFactory }
        return viewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = initBinding(inflater)
        return binding.root
    }

    protected fun <F> dataObserve(flow: Flow<F>, block: suspend (data: F) -> Unit) {
        viewLifecycleOwner.lifecycleScope.launch {
            flow.collect { data ->
                block(data)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}