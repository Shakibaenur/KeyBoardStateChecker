package com.shakibaenur.keyboardstate

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.shakibaenur.keyboardstate.databinding.ActivityMainBinding
import com.shakibaenur.keyboardstate.keyBoardState.KeyboardStateEvent
import com.shakibaenur.keyboardstate.keyBoardState.KeyboardStateEventListener

class MainActivity : AppCompatActivity() {
    private lateinit var mViewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityMainBinding.inflate(layoutInflater)
        KeyboardStateEvent.setEventListener(
            this
        ) {isOpen->
            if(isOpen) Toast.makeText(this,"Keyboard Open!",Toast.LENGTH_SHORT).show()
            else Toast.makeText(this,"Keyboard closed!", Toast.LENGTH_SHORT).show()

        }
        setContentView(mViewBinding.root)
    }
}

