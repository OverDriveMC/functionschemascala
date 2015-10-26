package com.mblinn.mbfpp.oo.fi

case class Person2(firstName:String, middleName:String ,lastName:String)
object PersonExpanded {
  def main(args :Array[String]){
    val p1=Person2("Aaron","Jeffrey","Smith");
    val p2=Person2("Aaron","Bailey","Zanthar");
    val p3=Person2("Brian","Adams","Smith");
    val people=Vector(p1,p2,p3)
    //≈≈–Ú
    println(people.sortWith(complicatedSort))
  }
  
  def complicatedSort(p1 : Person2, p2 : Person2)=
    if(p1.firstName!=p2.firstName)
      p1.firstName<p2.firstName
    else if (p1.lastName!=p2.lastName)
      p1.lastName<p2.lastName
    else
      p1.middleName<p2.middleName
  
}