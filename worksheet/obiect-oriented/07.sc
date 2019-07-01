
object myApplication{
  def main(args: Array[String]):Unit = {
    println("Entry Point")
    args.foreach(println)
  }
}

myApplication.main(Array("Hello","World"))