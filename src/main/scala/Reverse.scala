class Reverse {

  def listReverse[Int](list: List[Int]): List[Int] =
    (for (i <- list.length-1 to 0 by -1) yield list(i)).toList

}
    object Reverse {

  def main(args:Array[String])
  {
    val myList = List(6,5,4,3,1)
    val reverse = new Reverse
    val result = reverse.listReverse(myList)

    println("Reversed List is: " + result)

  }
}
