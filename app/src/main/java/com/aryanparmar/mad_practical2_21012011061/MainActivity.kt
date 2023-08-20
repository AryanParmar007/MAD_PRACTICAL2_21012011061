package com.aryanparmar.mad_practical2_21012011061

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        displayToast("onStart is called")
        displaySnackbar("onStart is called")
    }

    override fun onResume() {
        super.onResume()
        displayToast("onResume is called.")
        displaySnackbar("onResume is called.")
    }

    override fun onPause() {
        super.onPause()
        displayToast("onResume is called.")
        displaySnackbar("onResume is called.")
    }

    override fun onStop() {
        super.onStop()
        displayToast("onStop is called.")
        displaySnackbar("onStop is called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayToast("onDestroy is called.")
        displaySnackbar("onDestroy is called.")
    }

    fun displayToast(msg:String){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }

    fun displaySnackbar(msg:String){
        Snackbar.make(findViewById(R.id.home),msg,Snackbar.LENGTH_LONG).show()
    }

}