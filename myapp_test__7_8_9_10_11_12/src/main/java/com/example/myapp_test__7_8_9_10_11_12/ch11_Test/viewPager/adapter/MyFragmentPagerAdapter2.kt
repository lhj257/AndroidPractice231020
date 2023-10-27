package com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewPager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewPager.fragment.Sample2Frag1
import com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewPager.fragment.SampleFrag2
import com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewPager.fragment.SampleFrag3

class MyFragmentPagerAdapter2 (fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
    var sampleFragment : List<Fragment>
    init {
        sampleFragment= listOf(Sample2Frag1(), SampleFrag2(), SampleFrag3())
    }
    override fun getItemCount(): Int =sampleFragment.size

    override fun createFragment(position: Int): Fragment {
        val returnFragment : Fragment = sampleFragment[position]
        return returnFragment
    }
}