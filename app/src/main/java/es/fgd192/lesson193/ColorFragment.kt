package es.fgd192.lesson193

import android.os.Bundle
import android.provider.Settings.Global.getString
import android.view.View
import es.fgd192.lesson193.base.BaseFragment
import es.fgd192.lesson193.viewpager.FirstColorFragment
import es.fgd192.lesson193.viewpager.SecondColorFragment
import es.fgd192.lesson193.viewpager.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_colors.*

class ColorFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_colors

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        val adapter = ViewPagerAdapter(childFragmentManager)
        viewPager.adapter = adapter
        adapter.addFragment(FirstColorFragment(), getString(R.string.first_fragment))
        adapter.addFragment(SecondColorFragment(), getString(R.string.second_fragment))
        tabLayout.setupWithViewPager(viewPager)
    }
}