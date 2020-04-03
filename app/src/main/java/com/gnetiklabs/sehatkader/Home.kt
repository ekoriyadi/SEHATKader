package com.gnetiklabs.sehatkader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnKader.setOnClickListener{
            startActivity(Intent(this, KaderList::class.java))
        }

        btnOdha.setOnClickListener{
            startActivity(Intent(this, OdhaList::class.java))
        }

        btnObat.setOnClickListener{
            startActivity(Intent(this, MedicineList::class.java))
        }
    }
}
