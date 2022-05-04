import scala.language.postfixOps

class Quicksort {
  def sort(list:List[Int]): List[Int] =
    if (list.length < 2) list
    else {
      val pivot = list(list.length / 2)
        sort (list filter (pivot>)) ++ (list filter (pivot == )) ++ sort (list filter(pivot <))
    }
}

object mySorting {

  def main(args: Array[String]) {
    val myList : List[Int]= List(40,30,500,2000,5)
    val quicksort = new Quicksort
    val result = quicksort.sort(myList)

    println(result)
  }
}