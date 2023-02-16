package com.example.feedback.feature.presentation.output

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.feedback.core.BaseFragment
import com.example.feedback.core.LoadState
import com.example.feedback.databinding.FragmentDataOutputBinding
import com.example.feedback.feature.domain.module.Feedback

class DataOutputFragment : BaseFragment<FragmentDataOutputBinding>() {
    override fun initBinding(inflater: LayoutInflater) = FragmentDataOutputBinding.inflate(inflater)

    private val viewModel by lazy { initViewModel<DataOutputViewModel>() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClickBackButton()

        dataObserve(viewModel.data) { feedBack -> setData(feedBack) }

        dataObserve(viewModel.loadState) { loadState -> setLoad(loadState) }
    }

    private fun setLoad(loadState: LoadState) {
        binding.error.isVisible = loadState == LoadState.ERROR
        binding.progressCircular.isVisible = loadState == LoadState.LOADING
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