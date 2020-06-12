package com.example.appnavigation_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
/**
 * A simple [Fragment] subclass.
 */
class SecondScreen : Fragment(),View.OnClickListener{
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_screen, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.but2).setOnClickListener(this)
        view.findViewById<Button>(R.id.but3).setOnClickListener(this)
    }

    override fun onClick(button: View?) {
        when (button!!.id) {
            R.id.but2 -> navController!!.navigate(R.id.action_secondScreen_to_finalScreen)
            R.id.but3 -> navController!!.navigate(R.id.action_secondScreen_to_firstScreen)
        }
    }

}

