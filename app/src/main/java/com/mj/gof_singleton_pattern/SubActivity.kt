package com.mj.gof_singleton_pattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        init()
    }

    private fun init(){
        txt_receive_name.text = Singleton.name
        txt_receive_age.text = Singleton.age
        Singleton.showResult()
    }
}