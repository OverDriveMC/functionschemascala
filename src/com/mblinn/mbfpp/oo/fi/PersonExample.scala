package com.mblinn.mbfpp.oo.fi

case class Person(firstName:String, lastName :String)

object PersonExample {
    def main(args : Array[String]){
      val p1=Person("Michael","Bevilacqua");
      val p2=Person("Pedro","Vasquez");
      val p3=Person("Robert","Aarons");
      
      val people=Vector(p1,p3,p2)
      /**
       * sortWith�����������ıȽϺ����ܹ�����һ������ֵ���������жϵ�һ�������Ƿ����
       * �ڶ���������
       * Scala�ıȽϲ�����<��>�������ַ������ͣ����Կ���ʹ���������������ﵽ
       * ��һĿ��
       */
      println(people)
      println(people.sortWith((p1,p2) =>p1.firstName<p2.firstName)) 
    }
}