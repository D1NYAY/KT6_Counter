package com.example.kt6_counter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.kt6_counter.fragment.HistoryFragment
import com.example.kt6_counter.fragment.MainFragment
import com.example.kt6_counter.fragment.ResultFragment

class CountAdapter(fm :FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position) {

            0 -> {
                return MainFragment()
            }

            1 -> {
                return ResultFragment()
            }

            2 -> {
                return HistoryFragment()
            }
            else -> {
                return MainFragment()
            }
        }
    }
}