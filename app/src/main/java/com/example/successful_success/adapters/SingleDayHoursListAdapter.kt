package com.example.successful_success.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.successful_success.R
import com.example.successful_success.data.HoursWeather


class SingleDayHoursListAdapter:
    RecyclerView.Adapter<SingleDayHoursListAdapter.SingleDayHoursListViewHolder>() {

    private val hoursList: List<HoursWeather> = listOf<HoursWeather>(
        HoursWeather("02:00", "+16°"),
        HoursWeather("04:00", "+18°"),
        HoursWeather("06:00", "+21°"),
        HoursWeather("08:00", "+22°"),
        HoursWeather("10:00", "+25°"),
        HoursWeather("12:00", "+26°"),
        HoursWeather("14:00", "+27°"),
        HoursWeather("16:00", "+31°"),
        HoursWeather("18:00", "+30°"),
        HoursWeather("20:00", "+28°"),
        HoursWeather("22:00", "+26°"),
        HoursWeather("00:00", "+22°")
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleDayHoursListAdapter.SingleDayHoursListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_hours_list, parent, false)
        return SingleDayHoursListAdapter.SingleDayHoursListViewHolder((itemView))
    }

    override fun onBindViewHolder(holder: SingleDayHoursListViewHolder, position: Int) {
        holder.hour?.text = hoursList[position].hour
        holder.temperature?.text = hoursList[position].temperature
    }

    override fun getItemCount(): Int = hoursList.size

    class SingleDayHoursListViewHolder(view: View): RecyclerView.ViewHolder(view){
        val hour: TextView? = view.findViewById(R.id.hourTextView)
        val temperature: TextView? = view.findViewById(R.id.temperaturesTextView)
    }
}