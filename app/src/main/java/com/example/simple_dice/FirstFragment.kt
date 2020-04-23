package com.example.simple_dice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.roll).setOnClickListener {
            generateRandom(view)
        }
    }

    private fun generateRandom(view: View)
    {
        val resultView = view.findViewById<TextView>(R.id.result_box)

        var random = java.util.Random()

        var randomNum = random.nextInt(6) + 1

        resultView.text = randomNum.toString()

    }
}
