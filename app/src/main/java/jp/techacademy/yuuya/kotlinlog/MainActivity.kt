package jp.techacademy.yuuya.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val man = Human("山田太郎", 21,"野球")

        man.say()
        man.think()

        val woman =Human("山田サチ子",13,"家事" )
        woman.say()
        woman.think()
    }
}