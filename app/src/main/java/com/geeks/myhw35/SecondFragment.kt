package com.geeks.myhw35
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {

    private lateinit var secondTextView: TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        secondTextView = view.findViewById(R.id.secondTextView)

        val value = arguments?.getString("value")
        secondTextView.text = "Value from first fragment: $value"

        return view
    }
}
