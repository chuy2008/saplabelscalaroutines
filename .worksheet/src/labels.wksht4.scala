package labels

object wksht4
{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 
   val xs = List(1, 2);System.out.println("""xs  : List[Int] = """ + $show(xs ));$skip(23); 
   val ys = List(3, 4);System.out.println("""ys  : List[Int] = """ + $show(ys ));$skip(24); 
   val zs = Array(5, 6);System.out.println("""zs  : Array[Int] = """ + $show(zs ));$skip(13); val res$0 = 
   xs zip ys;System.out.println("""res0: List[(Int, Int)] = """ + $show(res$0));$skip(13); val res$1 = 
   xs zip zs;System.out.println("""res1: List[(Int, Int)] = """ + $show(res$1))}


}
