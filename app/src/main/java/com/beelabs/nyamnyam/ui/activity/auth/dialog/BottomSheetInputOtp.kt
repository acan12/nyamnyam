package com.beelabs.nyamnyam.ui.activity.auth.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beelabs.nyamnyam.databinding.DialogBottomSheetInputOtpBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetInputOtp(val onContinueClicked: () -> Unit) : BottomSheetDialogFragment() {
    private lateinit var binding: DialogBottomSheetInputOtpBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogBottomSheetInputOtpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnContinue.setOnClickListener {
            dismiss()
            onContinueClicked.invoke()
        }

    }
}