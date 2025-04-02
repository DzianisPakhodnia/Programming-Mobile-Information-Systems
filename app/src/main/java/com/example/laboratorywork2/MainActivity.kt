package com.example.laboratorywork2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Обработка WindowInsets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Инициализация кнопок
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)
        val button12 = findViewById<Button>(R.id.button12)
        val button13 = findViewById<Button>(R.id.button13)
        val button14 = findViewById<Button>(R.id.button14)
        val button15 = findViewById<Button>(R.id.button15)
        val button16 = findViewById<Button>(R.id.button16)
        val button17 = findViewById<Button>(R.id.button17)
        val button18 = findViewById<Button>(R.id.button18)
        val button19 = findViewById<Button>(R.id.button19)
        val button20 = findViewById<Button>(R.id.button20)
        val button21 = findViewById<Button>(R.id.button21)
        val button22 = findViewById<Button>(R.id.button22)
        val button23 = findViewById<Button>(R.id.button23)
        val button24 = findViewById<Button>(R.id.button24)
        val button25 = findViewById<Button>(R.id.button25)
        val button26 = findViewById<Button>(R.id.button26)
        val button27 = findViewById<Button>(R.id.button27)
        val button28 = findViewById<Button>(R.id.button28)
        val button29 = findViewById<Button>(R.id.button29)
        val button30 = findViewById<Button>(R.id.button30)

        // Устанавливаем обработчики кликов для всех кнопок
        button1.setOnClickListener { showToast(button1) }
        button2.setOnClickListener { showToast(button2) }
        button3.setOnClickListener { showToast(button3) }
        button4.setOnClickListener { showToast(button4) }
        button5.setOnClickListener { showToast(button5) }
        button6.setOnClickListener { showToast(button6) }
        button7.setOnClickListener { showToast(button7) }
        button8.setOnClickListener { showToast(button8) }
        button9.setOnClickListener { showToast(button9) }
        button10.setOnClickListener { showToast(button10) }
        button11.setOnClickListener { showToast(button11) }
        button12.setOnClickListener { showToast(button12) }
        button13.setOnClickListener { showToast(button13) }
        button14.setOnClickListener { showToast(button14) }
        button15.setOnClickListener { showToast(button15) }
        button16.setOnClickListener { showToast(button16) }
        button17.setOnClickListener { showToast(button17) }
        button18.setOnClickListener { showToast(button18) }
        button19.setOnClickListener { showToast(button19) }
        button20.setOnClickListener { showToast(button20) }
        button21.setOnClickListener { showToast(button21) }
        button22.setOnClickListener { showToast(button22) }
        button23.setOnClickListener { showToast(button23) }
        button24.setOnClickListener { showToast(button24) }
        button25.setOnClickListener { showToast(button25) }
        button26.setOnClickListener { showToast(button26) }
        button27.setOnClickListener { showToast(button27) }
        button28.setOnClickListener { showToast(button28) }
        button29.setOnClickListener { showToast(button29) }
        button30.setOnClickListener { showToast(button30) }
    }

    // Метод для отображения Toast с номером кнопки
    private fun showToast(button: Button) {
        val buttonText = button.text.toString()
        Toast.makeText(this, "Нажата кнопка $buttonText", Toast.LENGTH_SHORT).show()
    }

    // Метод для кнопки "Назад"
    fun onBackButtonClick(view: View) {
        Toast.makeText(this, "Кнопка 'Назад' нажата", Toast.LENGTH_SHORT).show()
        finish()
    }
}
