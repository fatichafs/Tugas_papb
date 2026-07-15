package com.example.siakadkampus

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        // Inisialisasi komponen
        val etNama = findViewById<EditText>(R.id.etNamaUser)
        val switchDark = findViewById<SwitchCompat>(R.id.switchDark)
        val btnSimpan = findViewById<Button>(R.id.btnSimpanSetting)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        // SharedPreferences
        val sharedPref = getSharedPreferences("setting_app", MODE_PRIVATE)

        // Ambil data tersimpan
        val nama = sharedPref.getString("nama", "")
        val dark = sharedPref.getBoolean("dark", false)

        etNama.setText(nama)
        switchDark.isChecked = dark

        tvHasil.text = "Nama: $nama\nDark Mode: $dark"

        // Tombol simpan
        btnSimpan.setOnClickListener {
            val namaBaru = etNama.text.toString()
            val darkMode = switchDark.isChecked

            val editor = sharedPref.edit()
            editor.putString("nama", namaBaru)
            editor.putBoolean("dark", darkMode)
            editor.apply()

            tvHasil.text = "Nama: $namaBaru\nDark Mode: $darkMode"

            Toast.makeText(this, "Pengaturan disimpan", Toast.LENGTH_SHORT).show()
        }
    }
}