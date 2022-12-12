package com.example.gb_kotlin_homework_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val textView: TextView = findViewById(R.id.textView)
    val countString = textView.text.toString()
    val tvCity: TextView = findViewById(R.id.textViewCity)
    val tvTemperature: TextView = findViewById(R.id.textViewTemperature)
    val tvSibling: TextView = findViewById(R.id.textViewSibling)


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIncri = findViewById<Button>(R.id.button2)
        btnIncri.setOnClickListener {
            increase()
        }

        val btnDecri = findViewById<Button>(R.id.button1)
        btnDecri.setOnClickListener {
            decrease()
        }

        val btnInit = findViewById<Button>(R.id.buttonInit)
        btnInit.setOnClickListener {
            initialize()
        }

        val btnSibling = findViewById<Button>(R.id.buttonSibling)
        btnSibling.setOnClickListener {
            showResult()
        }
    }


        // 4 задание, добавить кнопку в разметку и повесить слушатель


       fun increase() {
            var count: Int = Integer.parseInt(countString)
            count++

            textView.text = count.toString()
        }

        fun decrease() {
            var count: Int = Integer.parseInt(countString)
            count--

            textView.text = count.toString()
        }

        // создать Дата-класс и вывести свойства на экран

        data class Weather(var town: String, var temperature: Int)

        var moscow = Weather("Москва", 15)

        fun initialize() {
            tvCity.text = moscow.town
            tvTemperature.setText(moscow.temperature)
        }

        //создать объект и вывести значение copy на экран
        fun showResult() {

            data class Person(
                var name: String = "Василий",
                var lastName: String = "Попов",
                var fatherName: String = "Иванович",
                var age: Int = 27
            )

            val person = Person()
            val sibling = person.copy(name = "Иван", fatherName = "Васильевич", age = 67)
            tvSibling.text = sibling.lastName + " " + sibling.name + " " + sibling.fatherName

        }
    }


    //Отработка циклов

    //for each
    fun main() {
        val fruits = listOf("apple", "banana", "orange")
        for (item in fruits)
            println(item)

        //while
        var index = 0
        while (index < fruits.size) {
            println("Item at index $index is ${fruits[index]}")
            index++
        }

        // циклы for

        for (i in 1..10)
            println(i)

        for (i in 1 until 10)
            println(i)

        for (i in 10 downTo 1 )
            println(i)

        for (i in 1..100 step 10)
            println(i)
    }

