package com.example.feedback.feature.presentation.input

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.feedback.R
import com.example.feedback.core.BaseFragment
import com.example.feedback.databinding.FragmentDataInputBinding

class DataInputFragment : BaseFragment<FragmentDataInputBinding>() {

    override fun initBinding(inflater: LayoutInflater) = FragmentDataInputBinding.inflate(inflater)

    private val viewModel by lazy { initViewModel<DataInputViewModel>() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClickNextButton()

    }

    private fun onClickNextButton() = binding.buttonNext.setOnClickListener {

        if (viewModel.createFeedBack(
                binding.name.text.toString(),
                binding.them.text.toString(),
                binding.descriptions.text.toString(),
            )
        ) findNavController().navigate(R.id.action_dataInputFragment_to_dataOutputFragment)
        else binding.errorEmpty.isVisible = true
    }
}
