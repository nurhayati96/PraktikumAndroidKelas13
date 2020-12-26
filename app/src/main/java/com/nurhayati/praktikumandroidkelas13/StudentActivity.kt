package com.nurhayati.praktikumandroidkelas13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)


        val etNPM = findViewById<EditText>(R.id.etNpm)
        val etNama = findViewById<EditText>(R.id.etNama)
        val etIpk = findViewById<EditText>(R.id.etIpk)
        val etJumlahMataKuliah = findViewById<EditText>(R.id.etJumlahMataKuliah)

        val btIntent1 = findViewById<Button>(R.id.btIntent1)
        val btIntent2 = findViewById<Button>(R.id.btIntent2)

        btIntent1.setOnClickListener {
            val npm = etNPM.text.toString()
            val nama = etNama.text.toString()
            val ipk = etIpk.text.toString().toDouble()
            val jumlahMataKuliah = etJumlahMataKuliah.text.toString().toInt()

            val i = Intent(this, StudentResultActivity::class.java)
            i.putExtra("npm", npm)
            i.putExtra("nama", nama)
            i.putExtra("ipk", ipk)
            i.putExtra("jumlahMataKuliah", jumlahMataKuliah)

            startActivity(i)

        }


        btIntent2.setOnClickListener {
            val npm = etNPM.text.toString()
            val nama = etNama.text.toString()
            val ipk = etIpk.text.toString().toDouble()
            val jumlahMataKuliah = etJumlahMataKuliah.text.toString().toInt()

            val mahasiswa = Student(npm, nama, ipk, jumlahMataKuliah)

            val i = Intent(this, StudentResultActivity::class.java)
            i.putExtra("mahasiswa", mahasiswa)

            startActivity(i)
        }

    }
}