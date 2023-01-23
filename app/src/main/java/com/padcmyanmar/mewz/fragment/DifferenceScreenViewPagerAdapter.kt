package com.padcmyanmar.mewz.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.padcmyanmar.mewz.fragment.HomeFragment.Companion.KEY_HOME_DESCRIPTION
import com.padcmyanmar.mewz.fragment.ShortsFragment.Companion.KEY_SHORT_DESCRIPTION
import com.padcmyanmar.mewz.fragment.SubscriptionFragment.Companion.KEY_SUBSCRIPTION_DESCRIPTION

class DifferenceScreenViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> {
                val homeFragment = HomeFragment()

                // Pass Data
                val bundle = Bundle()
                bundle.putString(KEY_HOME_DESCRIPTION, "This is Home Fragment")
                homeFragment.arguments = bundle

                return homeFragment
            }
            1 -> {
                val shortsFragment = ShortsFragment()

                // Pass Data (Another code style)
                val bundle = Bundle().apply {
                    this.putString(KEY_SHORT_DESCRIPTION, "This is shorts fragment")
                }
                shortsFragment.arguments = bundle

                return shortsFragment
            }
            else -> {
                val subscriptionFragment = SubscriptionFragment()

                // Pass Data
                val bundle = Bundle().apply {
                    this.putString(KEY_SUBSCRIPTION_DESCRIPTION, "This is subscription fragment")
                }
                subscriptionFragment.arguments = bundle

                return subscriptionFragment
            }
        }
    }


}