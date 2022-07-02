package com.example.successful_success.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.successful_success.R
import com.example.successful_success.adapters.DaysListAdapter
import com.example.successful_success.adapters.SingleDayHoursListAdapter
import com.example.successful_success.utils.CITY
import com.example.successful_success.utils.REQUEST_KEY

class FirstFragment: Fragment() {
    private var button1: ImageView? = null
    private var button2: ImageView? = null
    private var location: TextView? = null
    var recyclerView: RecyclerView? = null
    var recyclerView1: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        activity?.supportFragmentManager?.setFragmentResultListener(REQUEST_KEY, this)
        { _, result ->
            val chosenCity = result.getString(CITY)
            Log.d("CHOSEN_CITY", chosenCity ?: "null")
            location?.setText(chosenCity)
        }
    }

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
            location = view?.findViewById(R.id.nameCity)

            initViews(view)
            setupRecyclerView()
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

        private fun initViews(view: View) {
            button1 = view.findViewById(R.id.city)
            recyclerView = view.findViewById(R.id.recyclerView)
            recyclerView1 = view.findViewById(R.id.hoursRecyclerView)
        }

        private fun setupRecyclerView() {
            recyclerView?.layoutManager = LinearLayoutManager(requireContext())
            recyclerView?.adapter = DaysListAdapter()
            recyclerView1?.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            recyclerView1?.adapter = SingleDayHoursListAdapter()
        }

}


