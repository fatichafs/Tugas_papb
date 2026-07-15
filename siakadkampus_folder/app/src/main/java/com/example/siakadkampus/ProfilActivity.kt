package com.example.siakadkampus

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etNim = findViewById<EditText>(R.id.etNim)
        val etJurusan = findViewById<EditText>(R.id.etJurusan)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etHp = findViewById<EditText>(R.id.etHp)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)

        btnSimpan.setOnClickListener {
            val nama = etNama.text.toString()
            val nim = etNim.text.toString()
            val jurusan = etJurusan.text.toString()
            val email = etEmail.text.toString()
            val hp = etHp.text.toString()

            if (nama.isEmpty() || nim.isEmpty()) {
                Toast.makeText(this, "Nama dan NIM wajib diisi!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show()
            }
        }
    }
}