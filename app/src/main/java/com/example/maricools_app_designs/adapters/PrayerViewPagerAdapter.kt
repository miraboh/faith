package com.example.maricools_app_designs.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.maricools_app_designs.databinding.FragmentPrayerBinding
import com.example.maricools_app_designs.databinding.MainScreenSingleItemLayoutBinding
import com.example.maricools_app_designs.databinding.PrayerItemViewpagerBinding

class PrayerViewPagerAdapter(val prayerTitles: MutableList<String>, val prayer: MutableList<String>): RecyclerView.Adapter<PrayerViewPagerAdapter.ViewPagerViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val binding = PrayerItemViewpagerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return prayerTitles.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {

        holder.binding.prayerTitle.text = prayerTitles[position]
        holder.binding.prayerBody.text = prayer[position]
    }


    inner class ViewPagerViewHolder(var binding: PrayerItemViewpagerBinding): RecyclerView.ViewHolder(binding.root) {

    }
}