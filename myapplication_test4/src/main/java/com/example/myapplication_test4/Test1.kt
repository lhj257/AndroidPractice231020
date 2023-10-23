package com.example.myapplication_test4

import java.util.Scanner

class Test1 {
    companion object{
        fun test(menu: Menu){
            if(menu.lunch.equals("한식")||menu.lunch.equals("일식")||menu.lunch.equals("중식")){
                println("그래서 뭐먹음")
            }else{
                println("뭐함?")
            }
        }
    }

}

data class Menu(val lunch:String){
}

val scanner : Scanner = Scanner(System.`in`)

fun main(){
    println("점심메뉴 입력")
    val lunch = scanner.nextLine()
    println("lunch 값 : ${lunch}")

    val menu:Menu = Menu(lunch)
    Test1.test(menu)
}