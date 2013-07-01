package labels

object wksht4
{
   val xs = List(1, 2)                            //> xs  : List[Int] = List(1, 2)
   val ys = List(3, 4)                            //> ys  : List[Int] = List(3, 4)
   val zs = Array(5, 6)                           //> zs  : Array[Int] = Array(5, 6)
   xs zip ys                                      //> res0: List[(Int, Int)] = List((1,3), (2,4))
   xs zip zs                                      //> res1: List[(Int, Int)] = List((1,5), (2,6))


}