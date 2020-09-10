package es.fgd192.lesson193

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import es.fgd192.lesson193.CitiesFragmentDirections.Companion.actionCitiesFragmentToCityFragment
import es.fgd192.lesson193.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_cities.*

class CitiesFragment : BaseFragment(),
    RvListener {

    override fun resID() = R.layout.fragment_cities

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        val adapter = RvAdapter(this)
        ReVi.adapter = adapter
        adapter.update(getData())
    }

    private fun getData(): ArrayList<CitiesData> {
        val list = arrayListOf<CitiesData>()
        list.add(CitiesData(R.drawable.canberra_image, R.drawable.canberra, getString(R.string.Canberra_title), getString(R.string.Canberra_description)))
        list.add(CitiesData(R.drawable.sydney_image, R.drawable.sydney, getString(R.string.Sydney_title), getString(R.string.Sydney_description)))
        list.add(CitiesData(R.drawable.melbourne_image, R.drawable.melbourne, getString(R.string.Melbourne_title), getString(R.string.Melbourne_description)))
        list.add(CitiesData(R.drawable.brisbane_image, R.drawable.brisbane, getString(R.string.Brisbane_title), getString(R.string.Brisbane_description)))
        list.add(CitiesData(R.drawable.newcastle_image, R.drawable.newcastle, getString(R.string.NewCastle_title), getString(R.string.NewCastle_description)))
        return list
    }

    override fun goToCity(data: CitiesData) {
        val dest = actionCitiesFragmentToCityFragment(data)
        findNavController().navigate(dest)
    }
}