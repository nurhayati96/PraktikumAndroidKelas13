package com.nurhayati.praktikumandroidkelas13

import android.os.Parcel
import android.os.Parcelable

data class Student (
    val npm: String?,
    val nama: String?,
    val ipk: Double,
    val jumlahMataKuliah: Int

): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(npm)
        parcel.writeString(nama)
        parcel.writeDouble(ipk)
        parcel.writeInt(jumlahMataKuliah)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }
}