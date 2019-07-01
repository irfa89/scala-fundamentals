class Employee(f:String,l:String,s:Int) {

  private val first:String = f
  private val last:String = l
  private var stocks:Int = s

  def getFirst : String = first
  def getLast : String = last
  def getStocks: Int = stocks

  def awardMoreStocks(numberOfStocks:Int):Unit = stocks += numberOfStocks

  override def toString: String = first +  " " + last + " " + stocks
}

val amyJones = new Employee("Amy","Jones", 10)

amyJones.getFirst
amyJones.getLast
amyJones.getStocks

amyJones.awardMoreStocks(15)
amyJones.getStocks