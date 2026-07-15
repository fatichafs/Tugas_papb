package com.example.siakadkampus

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etNim = findViewById<EditText>(R.id.etNim)
        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val container = findViewById<LinearLayout>(R.id.containerData)

        btnTambah.setOnClickListener {
            val nama = etNama.text.toString()
            val nim = etNim.text.toString()

            if (nama.isEmpty() || nim.isEmpty()) {
                Toast.makeText(this, "Isi dulu datanya!", Toast.LENGTH_SHORT).show()
            } else {

                // Buat TextView baru
                val textView = TextView(this)
                textView.text = "Nama: $nama\nNIM: $nim"
                textView.textSize = 16f
                textView.setPadding(16,16,16,16)
                textView.setBackgroundResource(android.R.drawable.dialog_holo_light_frame)

                // Tambahkan ke layout
                container.addView(textView)

                // Reset input
                etNama.text.clear()
                etNim.text.clear()
            }
        }
    }
}