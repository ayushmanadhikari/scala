package com.rockthejvm

object functionalpractice extends App {
  class Person(name: String) {
    def apply(age: Int): Unit = println("nothing")
  }

  val incrementer = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }

  print(incrementer(23))

  val stringConcat = new Function3[String, String, String, Unit] {
    override def apply(v1: String, v2: String, v3: String): Unit = print(v1 + v2 + v3)

  }

  val s1 = "I "
  val s2 = "Love "
  val s3 = "Scala "
  stringConcat(s1, s2, s3)

  def doubler(x: Int): Int = {
    2 * x
  }

  //writing function with FunctionX type
  val doubler1: Function1[Int, Int] = (x: Int) => 2 * x
  //the FunctionX part can be replaced with Int => Int
  //as the first int is argument and second int os return type
  val doubler: Int => Int = (x: Int) => 2 * x
  val addOne: Int => Int = _ + 1
  val weirdSum: (Int, Int) => Int = (x: Int, y: Int) => 2 * x + 3 * y
  print(weirdSum(2, 3))

  //higher order functions
  val mappedList = List(1, 2, 3).map(x => x + 1)
  val flatMappedList = List(1, 2, 3).flatMap { x =>
    List(x, x * 2)
  } //alternative syntax
  println(flatMappedList)
  val aFilterList = List(1, 2, 3, 4, 5, 6).filter(x => x <= 3)
  println(aFilterList)

  //all pairs between number 1,2,3 and letter a,b,c
  val allPairs = List(1, 2, 3).flatMap(numbers => List('a', 'b', 'c').map(letters => s"$numbers-$letters"))
  println(allPairs)


  val allpairs = List(1,2,3).flatMap(numbers => List('a', 'b', 'c').map(letters => s"$letters-$numbers"))
  println(allpairs)

  val usernames = List ('a', 'b', 'c', 'd', 'e')
  val id = List(1,2,3,4,5)

  //for compreshensions
  val idUserPairs = for {
    user <- usernames
    id <- id if id <= 3
  } yield s"$user-$id"
println(idUserPairs)




}