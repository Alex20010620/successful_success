package com.example.successful_success

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class FirstFragment: Fragment() {
    var button1: ImageView? = null
    var button2: ImageView? = null

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1 = view.findViewById(R.id.city)
        button1?.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainerView, CityFragment())
                ?.addToBackStack(CityFragment::class.java.simpleName)
                ?.commit()
        }
        button2 = view.findViewById(R.id.settings)
        button2?.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainerView, SettingsFragment())
                ?.addToBackStack(SettingsFragment::class.java.simpleName)
                ?.commit()
        }
    }
}


