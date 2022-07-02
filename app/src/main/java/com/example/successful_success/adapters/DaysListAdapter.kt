package com.example.successful_success.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.successful_success.R
import com.example.successful_success.data.Weather

class DaysListAdapter: RecyclerView.Adapter<DaysListAdapter.WeatherListViewHolder>() {

    private val weatherList: List<Weather> = listOf<Weather>(
        Weather("Monday", "+27°/+19°"),
        Weather("Tuesday", "+25°/+17°"),
        Weather("Wednesday", "+19°/+16°"),
        Weather("Thursday", "+19°/+15°"),
        Weather("Friday", "+19°/+17°"),
        Weather("Saturday", "+23°/+19°"),
        Weather("Sunday", "+31°/+23°")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return WeatherListViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: WeatherListViewHolder, position: Int) {
        holder.day?.text = weatherList[position].day
        holder.temperature?.text = weatherList[position].temperature
    }

    override fun getItemCount(): Int = weatherList.size

    class WeatherListViewHolder(view: View): RecyclerView.ViewHolder(view){
        val day: TextView? = view.findViewById(R.id.dayTextView)
        val temperature: TextView? = view.findViewById(R.id.temperatureTextView)
    }
}