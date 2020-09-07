package jp.techacademy.yuuya.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {
     constructor(name: String, age: Int, hobby: String ):super(name,age,hobby){
     }

     override fun say() {
         Log.d("kotlinWork","私の名前は" + this.name +"です。" + "歳は" + this.age +"です。" )
     }

     override fun think() {
         Log.d("kotlinWork","私は" + this.hobby + "について考える。")
     }
}