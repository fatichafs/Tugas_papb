package com.example.siakadkampus

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LaporanActivity : AppCompatActivity() {

    private var totalMasuk = 0
    private var totalKeluar = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laporan)

        val etJumlah = findViewById<EditText>(R.id.etJumlah)
        val spJenis = findViewById<Spinner>(R.id.spJenis)
        val btnTambah = findViewById<Button>(R.id.btnTambah)

        val tvMasuk = findViewById<TextView>(R.id.tvPemasukan)
        val tvKeluar = findViewById<TextView>(R.id.tvPengeluaran)
        val tvSaldo = findViewById<TextView>(R.id.tvSaldo)

        // isi spinner
        val jenis = arrayOf("Pemasukan", "Pengeluaran")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, jenis)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spJenis.adapter = adapter

        btnTambah.setOnClickListener {
            val jumlahStr = etJumlah.text.toString()

            if (jumlahStr.isEmpty()) {
                Toast.makeText(this, "Masukkan jumlah!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val jumlah = jumlahStr.toInt()
            val selected = spJenis.selectedItem.toString()

            if (selected == "Pemasukan") {
                totalMasuk += jumlah
            } else {
                totalKeluar += jumlah
            }

            val saldo = totalMasuk - totalKeluar

            tvMasuk.text = "Total Pemasukan: Rp $totalMasuk"
            tvKeluar.text = "Total Pengeluaran: Rp $totalKeluar"
            tvSaldo.text = "Saldo: Rp $saldo"

            etJumlah.text.clear()
        }
    }
}