package com.geeks.myhw35
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.button) {
            if (count == 0) {
                button.text = "-1"
                count--
            } else if (count == -1) {
                openSecondFragment()
            } else {
                count++
            }

            textView.text = count.toString()
        }
    }

    private fun openSecondFragment() {
        val fragment = SecondFragment()
        val bundle = Bundle()
        bundle.putString("value", textView.text.toString())
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}