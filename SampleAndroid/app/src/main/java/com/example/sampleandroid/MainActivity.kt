package com.example.sampleandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import kotlinx.android.synthetic.main.activity_main.*
import com.example.sampleandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

 //   fun convertCurrency(view: View) {
 //       if (dollarText.text.isNotEmpty()) {
 //           val dollarValue = dollarText.text.toString().toFloat()
 //           val euroValue = dollarValue * 0.85f
 //           textView.text = euroValue.toString()
 //       } else {
 //           textView.text = getString(R.string.no_value_string)
 //       }
 //   }
 //}

    fun convertCurrency(view: View) {
        if(binding.dollarText.text.isNotEmpty()){
            val dollarValue=binding.dollarText.text.toString().toFloat()
            val euroValue=dollarValue*0.85f
            binding.textView.text=euroValue.toString()
        }else{
            binding.textView.text=getString(R.string.no_value_string)
        }
    }
}