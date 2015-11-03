package com.mblinn.mbfpp.oo.closure

case class Person(firstName: String, middleName: String, lastName: String)

object ClosureExample {
  def makeComposedComparison(comparisons: (Person, Person) => Int*) =
    (p1: Person, p2: Person) =>
      comparisons.map(cmp => cmp(p1, p2)).find(_ != 0).getOrElse(0)

  /**
   * 我们将选取两个比较函数，并将它们组合到一起
   */
  def firstNameComparison(p1: Person, p2: Person) =
    p1.firstName.compareTo(p2.firstName)

  def lastNameComparison(p1: Person, p2: Person) =
    p1.lastName.compareTo(p2.lastName)
  val firstAndLastNameComparison = makeComposedComparison(
    firstNameComparison, lastNameComparison)

  def main(args: Array[String]) {
    val p1=Person("John","","Adams")
    val p2=Person("John","Quincy","Adams")
    println(firstAndLastNameComparison(p1,p2)) //0
  }
}