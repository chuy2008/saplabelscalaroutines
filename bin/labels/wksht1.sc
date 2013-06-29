package labels

object wksht1
{
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  var ll = List("ab", "cd")                       //> ll  : List[String] = List(ab, cd)
  ll(0)                                           //> res0: String = ab
  ll(1)                                           //> res1: String = cd
  var c = 5                                       //> c  : Int = 5
  c += 1
  c                                               //> res2: Int = 6
  var pp = List("hy", "mn")                       //> pp  : List[String] = List(hy, mn)
  var tt = "" :: ll                               //> tt  : List[String] = List("", ab, cd)
  tt                                              //> res3: List[String] = List("", ab, cd)
  tt.head                                         //> res4: String = ""
  ll.head                                         //> res5: String = ab
  "ki" :: ll                                      //> res6: List[String] = List(ki, ab, cd)
  ll ++ "kif"                                     //> res7: List[Any] = List(ab, cd, k, i, f)
  ll ++ pp                                        //> res8: List[String] = List(ab, cd, hy, mn)
  ll :: pp                                        //> res9: List[Object] = List(List(ab, cd), hy, mn)
  ll ++ "h"                                       //> res10: List[Any] = List(ab, cd, h)
  ll                                              //> res11: List[String] = List(ab, cd)
  ll.reverse                                      //> res12: List[String] = List(cd, ab)
  "hub" + 'c'                                     //> res13: String = hubc
  var chh = 'd'                                   //> chh  : Char = d
  chh == 'd'                                      //> res14: Boolean = true
  chh == "d"                                      //> res15: Boolean = false
  
  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: Int => Boolean, elem: Int)Boolean

  def singletonSet(elem: Int): Set =
   ((x: Int) => x == elem)                        //> singletonSet: (elem: Int)Int => Boolean
 
  var s1 = singletonSet(1)                        //> s1  : Int => Boolean = <function1>
  s1(3)                                           //> res16: Boolean = false
  
  var b = new Array[String](10)                   //> b  : Array[String] = Array(null, null, null, null, null, null, null, null, n
                                                  //| ull, null)
  b(0) = "1"
  b(1) = "hola"
  b                                               //> res17: Array[String] = Array(1, hola, null, null, null, null, null, null, nu
                                                  //| ll, null)
  b.length                                        //> res18: Int = 10
  
  var a = new Array[Int](10)                      //> a  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  a(0) = 1
  a(1) = 4
  a(0)                                            //> res19: Int = 1
  a                                               //> res20: Array[Int] = Array(1, 4, 0, 0, 0, 0, 0, 0, 0, 0)
  
  
  
  
  
/*
  for (i <- 1 to 3)
  {
     for (j <- 1 to 5)
     {
        println (i, j)
     }
  }
*/
  
  
  
}