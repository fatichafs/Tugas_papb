package com.example.siakadkampus

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class TransaksiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaksi)

        val etNama = findViewById<EditText>(R.id.etNamaTransaksi)
        val etJumlah = findViewById<EditText>(R.id.etJumlah)
        val etKet = findViewById<EditText>(R.id.etKeterangan)
        val btnTambah = findViewById<Button>(R.id.btnTambahTransaksi)
        val container = findViewById<LinearLayout>(R.id.containerTransaksi)

        btnTambah.setOnClickListener {
            val nama = etNama.text.toString()
            val jumlah = etJumlah.text.toString()
            val ket = etKet.text.toString()

            if (nama.isEmpty() || jumlah.isEmpty()) {
                Toast.makeText(this, "Data belum lengkap!", Toast.LENGTH_SHORT).show()
            } else {

                val textView = TextView(this)
                textView.text = "Transaksi: $nama\nJumlah: Rp $jumlah\nKeterangan: $ket"
                textView.textSize = 16f
                textView.setPadding(16,16,16,16)
                textView.setBackgroundResource(android.R.drawable.dialog_holo_light_frame)

                container.addView(textView)

                // reset input
                etNama.text.clear()
                etJumlah.text.clear()
                etKet.text.clear()

                Toast.makeText(this, "Transaksi berhasil ditambahkan", Toast.LENGTH_SHORT).show()
            }
        }
    }
}