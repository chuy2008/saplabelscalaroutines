package labels

object wksht1
{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(29); 

  var ll = List("ab", "cd");System.out.println("""ll  : List[String] = """ + $show(ll ));$skip(8); val res$0 = 
  ll(0);System.out.println("""res0: String = """ + $show(res$0));$skip(8); val res$1 = 
  ll(1);System.out.println("""res1: String = """ + $show(res$1));$skip(12); 
  var c = 5;System.out.println("""c  : Int = """ + $show(c ));$skip(9); 
  c += 1;$skip(4); val res$2 = 
  c;System.out.println("""res2: Int = """ + $show(res$2));$skip(28); 
  var pp = List("hy", "mn");System.out.println("""pp  : List[String] = """ + $show(pp ));$skip(20); 
  var tt = "" :: ll;System.out.println("""tt  : List[String] = """ + $show(tt ));$skip(5); val res$3 = 
  tt;System.out.println("""res3: List[String] = """ + $show(res$3));$skip(10); val res$4 = 
  tt.head;System.out.println("""res4: String = """ + $show(res$4));$skip(10); val res$5 = 
  ll.head;System.out.println("""res5: String = """ + $show(res$5));$skip(13); val res$6 = 
  "ki" :: ll;System.out.println("""res6: List[String] = """ + $show(res$6));$skip(14); val res$7 = 
  ll ++ "kif";System.out.println("""res7: List[Any] = """ + $show(res$7));$skip(11); val res$8 = 
  ll ++ pp;System.out.println("""res8: List[String] = """ + $show(res$8));$skip(11); val res$9 = 
  ll :: pp;System.out.println("""res9: List[Object] = """ + $show(res$9));$skip(12); val res$10 = 
  ll ++ "h";System.out.println("""res10: List[Any] = """ + $show(res$10));$skip(5); val res$11 = 
  ll;System.out.println("""res11: List[String] = """ + $show(res$11));$skip(13); val res$12 = 
  ll.reverse;System.out.println("""res12: List[String] = """ + $show(res$12));$skip(14); val res$13 = 
  "hub" + 'c';System.out.println("""res13: String = """ + $show(res$13));$skip(16); 
  var chh = 'd';System.out.println("""chh  : Char = """ + $show(chh ));$skip(13); val res$14 = 
  chh == 'd';System.out.println("""res14: Boolean = """ + $show(res$14));$skip(13); val res$15 = 
  chh == "d"
  
  type Set = Int => Boolean;System.out.println("""res15: Boolean = """ + $show(res$15));$skip(85); 

  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(65); 

  def singletonSet(elem: Int): Set =
   ((x: Int) => x == elem);System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(29); 
 
  var s1 = singletonSet(1);System.out.println("""s1  : Int => Boolean = """ + $show(s1 ));$skip(8); val res$16 = 
  s1(3);System.out.println("""res16: Boolean = """ + $show(res$16));$skip(35); 
  
  var b = new Array[String](10);System.out.println("""b  : Array[String] = """ + $show(b ));$skip(13); 
  b(0) = "1";$skip(16); 
  b(1) = "hola";$skip(4); val res$17 = 
  b;System.out.println("""res17: Array[String] = """ + $show(res$17));$skip(11); val res$18 = 
  b.length;System.out.println("""res18: Int = """ + $show(res$18));$skip(32); 
  
  var a = new Array[Int](10);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(11); 
  a(0) = 1;$skip(11); 
  a(1) = 4;$skip(7); val res$19 = 
  a(0);System.out.println("""res19: Int = """ + $show(res$19));$skip(4); val res$20 = 
  a;System.out.println("""res20: Array[Int] = """ + $show(res$20))}
  
  
  
  
  
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
