package es.fgd192.lesson193

import android.os.Bundle
import android.view.View
import es.fgd192.lesson193.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_city.*

class CityFragment : BaseFragment() {

    override fun resID() = R.layout.fragment_city

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val bundle = CitiesFragmentArgs.fromBundle(
                requireArguments()
            )
        TeVi.text = bundle.details?.TeVi
        TeVi2.text = bundle.details?.TeVi2
        if (bundle.details?.imageCity != null)
            Image.setImageResource(bundle.details?.imageCity)
    }
}