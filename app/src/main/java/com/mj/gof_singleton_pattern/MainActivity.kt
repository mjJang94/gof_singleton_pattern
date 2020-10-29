package com.mj.gof_singleton_pattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_confirm.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view?.id){

            R.id.btn_confirm -> {
                Singleton.name = et_name.text.toString()
                Singleton.age = et_age.text.toString()

                startActivity(Intent(this@MainActivity, SubActivity::class.java))
            }
        }
    }
}