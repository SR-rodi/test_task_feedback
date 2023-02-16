package com.example.feedback.feature.presentation.input

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.feedback.R
import com.example.feedback.core.BaseFragment
import com.example.feedback.databinding.FragmentDataInputBinding

class DataInputFragment : BaseFragment<FragmentDataInputBinding>() {

    override fun initBinding(inflater: LayoutInflater) = FragmentDataInputBinding.inflate(inflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}