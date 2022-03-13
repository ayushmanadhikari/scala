package com.rockthejvm

object ObjectOrientationPractice extends App {

  class Vehicle() {
    val name: String = "a vehicle"
    def print_name(): Unit = println(s"$name")
  }

class Lambo(val lambo_name: String) extends Vehicle{
  override def print_name(): Unit = println(s"$lambo_name")
}

val aLambo = new Lambo("override Check")
aLambo.print_name()

trait electricVehicle{
  def battery(power: Int): Unit
}

class Tesla extends Vehicle with electricVehicle {
  override def battery(power: Int): Unit = println(s"battery size: $power watts.")
}

val tes1 = new Tesla
tes1.battery(25)

val tes2 = new electricVehicle {
  override def battery(power: Int): Unit = println(s"battery size: $power watts.")
}

  tes2.battery(55)


 //exceptions
 try {
   val x: String = null
   x.length
 } catch {
   case e: Exception => "error message"
 }  finally {
   //execute some code no matter what
 }

}
