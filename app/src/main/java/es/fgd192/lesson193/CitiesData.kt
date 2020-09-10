package es.fgd192.lesson193

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CitiesData(
    var imageCity: Int,
    var imageFlag: Int,
    var TeVi: String,
    var TeVi2: String
) : Parcelable