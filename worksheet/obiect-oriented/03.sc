class Employee(first:String,last:String) {

  override def toString: String = first +  " " + last
}

val amyJones = new Employee("Amy","Jones")

amyJones

