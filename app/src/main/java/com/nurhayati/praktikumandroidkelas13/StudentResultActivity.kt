package com.nurhayati.praktikumandroidkelas13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StudentResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_result)

        val tvNpm = findViewById<TextView>(R.id.tvNpm)
        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvIpk = findViewById<TextView>(R.id.tvIpk)
        val tvjumlahMataKuliah = findViewById<TextView>(R.id.tvJumlahMataKuliah)


        if(intent.getStringExtra("npm")!=null) {
            val npm = intent.getStringExtra("npm")
            val nama = intent.getStringExtra("nama")
            val ipk = intent.getDoubleExtra("ipk", 0.0)
            val jumlahMataKuliah = intent.getIntExtra("jumlahMataKuliah", 0)

            tvNpm.text = npm
            tvNama.text = nama
            tvIpk.text = ipk.toString()
            tvjumlahMataKuliah.text = jumlahMataKuliah.toString()

        } else {
            val mahasiswa = intent.getParcelableExtra<Student>("mahasiswa")

            if (mahasiswa != null) {
                tvNpm.text = mahasiswa.npm
                tvNama.text = mahasiswa.nama
                tvIpk.text = mahasiswa.ipk.toString()
                tvjumlahMataKuliah.text = mahasiswa.jumlahMataKuliah.toString()
            }
        }
    }
}