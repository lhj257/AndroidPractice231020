package com.example.myapplication_test4

class Test231023 (val name:String, val age:Int, val email:String) {

    constructor(name:String, age:Int, email:String, password:String) : this(name, age, email)

    init {
        println("객체 생성 할 때 마다, init 실행이 됨. ")
    }


    var name3: String="이호진"
    var email3: String = "lhj@naver.com"

    // 초기화를 미루겠다. 결론, 사용하는 시점에 초기화함.
    lateinit var name2: String
    var email2: String = "클래스 내부에서 선언만 안됨. 예외는 lateinit"
    val price: Int = 1000

    val data4: Int by lazy{
        println("by lazy 사용, 뒤늦게 초기화 ")
        30
    }

    val data5 : Array<String> = Array(3,{"기본값"})

    fun sayHello(){
        println("주생성자의 name을 사용하기 :${name}")
    }

}

 open class SuperClass(val name:String, val email:String){
     init{
         println("부모 클래스 초기화 됨, 매 자식이 인스턴스 생성때마다")
     }
//    val name :String="이호진"

     fun sayHello(){
         println("클래스의 멤버 이름과 이메일 출력하기 : ${name},${email}")
     }
}
//open 키워드 있어야 상속가능
class SubClass : SuperClass("이호진","lhj@nave.com"){
    init{
        println("자식 클래스 초기화 됨, 인스턴스 생성때마다")
    }
    val password:String = "1234"
    fun printPassword(){
        println("password : ${password}")
    }
}



fun main(){
    val test33 = SubClass()
    test33.printPassword()
    test33.sayHello()

    val test1 : Test231023 = Test231023("이호진", 28, "lhj@naver.com", "1234")
    val test3 : Test231023 = Test231023("이호진3", 28, "lhj@naver.com", "1234")
    test3.sayHello()
    val test4 : Test231023 = Test231023("이호진4", 28, "lhj@naver.com", "1234")

    println("비 데이터 글래스 toString 해보기 (의미없는 메모리 주소값 표기): "+test1.toString())

    test1.name2 = "초기값 할당 후 사용."
    val lateInitName =test1.name2
    println("lateInitName 사용 : "+lateInitName)

    val array_0=test1.data5.get(0)
    test1.data5.set(0,"이호진 0")
    println("array_0 의 값: "+array_0)

    var mutableList = mutableListOf<Int>(10,20,30)

    for (i in mutableList.indices){
        println("List 가져오기 : ${mutableList.get(i)}")
    }

    //불변
    var map = mapOf<String, String>(Pair("one","hello"), "two" to "world")
    println("맵 가져오기 :${map.get("one")}")
    //가변
    var map2 = mutableMapOf<String,String>(Pair("one","hello"), "two" to "world")
    map2.set("3","test")
    println("맵 가져오기 :${map2.get("3")}")

    var data7 : Any = "hi"
    when (data7) {
        is String -> println("문자열 데터다")
        in 1..10 -> println("숫자 데이터다")
        else->{
            println("기타 데이터다")
        }
    }

    var data10 = arrayOf<Int>(10,20,30)
    for ( (index,value) in data10.withIndex()) {
        print(value)
        if (index !== data10.size -1) print(",")
    }




    //다른 변수에 재할당(사용하는 시점에 초기화가 되고, 값도 할당 됨. (표현식)
    //앱이 시작하면, 순차적으로, 다 초기화를 해서 사용함.
    //하지만, lateinit, by lazy, 특징은 뒤늦게 초기화를 한다. 사용하는 시점에 초기화를 한다.
    val data4_2=test1.data4
    println("data4_2 : "+data4_2)
    println("data4_2 : ${data4_2}")

    val test2: User=User("이호진2", "lhj2@naver.com", "1234")
    println("데이터 글래스 toString 해보기 (실제값 표기): "+test2.toString())
}