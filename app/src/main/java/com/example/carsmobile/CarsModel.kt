package com.example.carsmobile
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CarsModel(
    val carModel: String,
    val carSpeed: String,
    val carType: String,
    val imageCar: String,
    val carCompany: String,
    val carStars: String,
    val carDesk: String
): Parcelable
