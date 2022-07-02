package com.example.successful_success.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.successful_success.R
import com.example.successful_success.utils.CITY
import com.example.successful_success.utils.MESSAGE_FROM_FIRST_FRAGMENT
import com.example.successful_success.utils.REQUEST_KEY

class CityFragment() : Fragment() {
    private var nameCityEditText: EditText? = null

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_city_map, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        setOnClickListeners()
    }
    private fun initViews(view: View){
        nameCityEditText = view.findViewById(R.id.cities)
    }

    private fun setOnClickListeners() {
        // Устанавливаем слушателя нажатий на Enter клавиатуры
        nameCityEditText?.setOnKeyListener(object : View.OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent): Boolean {
                if (event.action == KeyEvent.ACTION_DOWN) {
                    when (keyCode) {
                        KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                            Log.d("CHOSEN_CITY", "enter clicked")
                            sendMessage()
                            navigateBack()
                            return true
                        }
                        else -> {}
                    }
                }
                return false
            }
        })
    }

    private fun sendMessage(){
        val chosenCity = nameCityEditText?.text.toString()
        // Отправляем полученный город в FirstFragment
        activity?.supportFragmentManager?.setFragmentResult(REQUEST_KEY, bundleOf(CITY to chosenCity))
    }

    private fun navigateBack(){
        activity?.supportFragmentManager?.popBackStack()
    }
}

