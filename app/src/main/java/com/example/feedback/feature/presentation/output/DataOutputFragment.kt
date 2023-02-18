package com.example.feedback.feature.presentation.output

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.feedback.core.BaseFragment
import com.example.feedback.databinding.FragmentDataOutputBinding
import com.example.feedback.feature.data.Feedback

class DataOutputFragment : BaseFragment<FragmentDataOutputBinding>() {
    override fun initBinding(inflater: LayoutInflater) = FragmentDataOutputBinding.inflate(inflater)

    private val viewModel by lazy { initViewModel<DataOutputViewModel>() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClickBackButton()

        setData(viewModel.getFeedBack())

    }

    private fun onClickBackButton() =
        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }

    private fun setData(feedBack: Feedback) {
        binding.name.text = feedBack.name
        binding.them.text = feedBack.theme
        binding.descriptions.text = feedBack.descriptions
    }
}