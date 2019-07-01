class Employee {
  var first:String = ""
  var last:String = ""

  override def toString: String = first +  " " + last
}

val amyJones = new Employee
amyJones.first = "Amy"
amyJones.last = "Jones"

amyJones

amyJones.first = "Bob"
amyJones.last = "Martin"

amyJones

