package jp.techacademy.yuuya.kotlinlog

abstract class Animal{

    //プロパティ
    var name: String = ""
    var age: Int =0


    //引数付きコンストラクタ
    constructor(name: String, age: Int){
        //プロパティ
        this.name = name;
        this.age = age;

    }

    abstract fun say()
}