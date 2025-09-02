package com.example.proyectobase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.usdpesos.Conversor

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edMontoPesos:EditText = findViewById(R.id.ed_valor_pesos)
        val btnAccion:Button = findViewById(R.id.btn_accion)
        val tvResultado:TextView = findViewById(R.id.tv_resultado)

        btnAccion.setOnClickListener{
            var montoPesosInt:Int = edMontoPesos.text.toString().toIntOrNull()?:0

            tvResultado.text = "Resutado: " + Conversor.convertir_usd_string(montoPesosInt)
        }
    }
}