package com.padcmyanmar.mewz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_shorts.view.*


class ShortsFragment : Fragment() {

    companion object{
        const val KEY_SHORT_DESCRIPTION = "KEY_SHORT_DESCRIPTION"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shorts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle:Bundle? = arguments.takeIf { bundle -> bundle?.containsKey(KEY_SHORT_DESCRIPTION) ?: false }
        view.tvShortsFragmentDescription.text = bundle?.getString(KEY_SHORT_DESCRIPTION) ?: ""
    }


}