class Employee(val first:String, val last:String) {

  override def toString: String = first +  " " + last
}

val amyJones = new Employee("Amy","Jones")

amyJones.first

class Color(val value:String)
val c = new Color("red")
c.value

class Shape(var value:String)
val s = new Shape("circle")
s.value
s.value = "square"
s.value
