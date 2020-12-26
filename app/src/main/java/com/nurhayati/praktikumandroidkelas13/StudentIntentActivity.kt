package com.nurhayati.praktikumandroidkelas13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StudentIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_intent)


        val tvNpm = findViewById<TextView>(R.id.tvNpm)
        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvIpk = findViewById<TextView>(R.id.tvIpk)
        val tvjumlahMataKuliah = findViewById<TextView>(R.id.tvJumlahMataKuliah)


        val npm = intent.getStringExtra("npm")
        val nama = intent.getStringExtra("nama")
        val ipk = intent.getDoubleExtra("ipk", 0.0)
        val jumlahMataKuliah = intent.getIntExtra("jumlahMataKuliah", 0)

        tvNpm.text = npm
        tvNama.text = nama
        tvIpk.text = ipk.toString()
        tvjumlahMataKuliah.text = jumlahMataKuliah.toString()


    }
}