package jp.techacademy.yuuya.kotlinlog

abstract class Animal{

    //プロパティ
    var name: String = ""
    var age: Int =0
    var hobby: String =""

    //引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String){
        //プロパティ
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    abstract fun say()
}