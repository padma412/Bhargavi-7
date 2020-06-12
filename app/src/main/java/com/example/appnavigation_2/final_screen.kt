package com.example.appnavigation_2
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.final_screen.*


/**
 * A simple [Fragment] subclass.
 */
class FinalScreen : Fragment(), View.OnClickListener {
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.final_screen, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.but4).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val snackbar = Snackbar.make(finalScreen, "Welcome To Exercise", Snackbar.LENGTH_LONG)
        snackbar.show()
}
}


