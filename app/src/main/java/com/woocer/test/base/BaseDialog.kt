package com.woocer.test.base

import android.app.Dialog
import android.os.Bundle
import android.view.*
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment


abstract class BaseDialog<T : ViewDataBinding>(@LayoutRes private val layoutRes: Int) :
    DialogFragment() {

    protected lateinit var binding: T

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)

        dialog.window?.let { window ->
//            TODO: 28.09.21 change background and anim
//            window.attributes.windowAnimations = R.style.DialogAnimation_Window
//            window.setBackgroundDrawableResource(R.drawable.dialog_background)

            val layoutParams = WindowManager.LayoutParams()
            layoutParams.copyFrom(window.attributes)
            layoutParams.width = (resources.displayMetrics.widthPixels * 0.9).toInt()
            layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT
            layoutParams.gravity = Gravity.CENTER
            window.attributes = layoutParams
        }

        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        setupViews()
        return binding.root
    }


    protected abstract fun setupViews()

}