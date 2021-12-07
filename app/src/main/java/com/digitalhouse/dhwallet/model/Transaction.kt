package com.digitalhouse.dhwallet.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Transaction(
    val image: String,
    val title: String,
    val subtitle: String,
    val value: String,
): Parcelable
