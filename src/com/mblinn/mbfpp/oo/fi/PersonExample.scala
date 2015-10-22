package com.mblinn.mbfpp.oo.fi

case class Person(firstName:String, lastName :String)

object PersonExample {
    def main(args : Array[String]){
      val p1=Person("Michael","Bevilacqua");
      val p2=Person("Pedro","Vasquez");
      val p3=Person("Robert","Aarons");
      
      val people=Vector(p1,p3,p2)
      /**
       * sortWith方法期望它的比较函数能够返回一个布尔值来帮助它判断第一个参数是否大于
       * 第二个参数。
       * Scala的比较操作符<和>适用于字符串类型，所以可以使用这两个操作符达到
       * 这一目的
       */
      println(people)
      println(people.sortWith((p1,p2) =>p1.firstName<p2.firstName)) 
    }
}