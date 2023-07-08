package com.example.recycle_view_kotlin_wahyu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String,
    val rateSuperhero: String
): Parcelable
