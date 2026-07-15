package com.example.siakadkampus

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.siakadkampus.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    // deklarasi binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// menghubungkan layout dengan activity
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
// ==========================
// MENU PROFIL
// ==========================
        binding.menuProfil.setOnClickListener {
            Toast.makeText(this, "Menu Profil", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
// ==========================
// MENU DATA
// ==========================
        binding.menuData.setOnClickListener {
            Toast.makeText(this, "Menu Data", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DataActivity::class.java)
            startActivity(intent)
        }
// ==========================
// MENU TRANSAKSI
// ==========================
        binding.menuTransaksi.setOnClickListener {
            Toast.makeText(this, "Menu Transaksi",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this, TransaksiActivity::class.java)
            startActivity(intent)
        }
// ==========================
// MENU LAPORAN
// ==========================
        binding.menuLaporan.setOnClickListener {
            Toast.makeText(this, "Menu Laporan",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LaporanActivity::class.java)
            startActivity(intent)
        }
// ==========================
// MENU SETTING
// ==========================
        binding.menuSetting.setOnClickListener {
            Toast.makeText(this, "Menu Setting",
                Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
// ==========================
// MENU LOGOUT
// ==========================
        binding.menuLogout.setOnClickListener {
            Toast.makeText(this, "Logout berhasil",
                Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}