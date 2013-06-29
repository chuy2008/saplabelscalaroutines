package labels

import java.util.Scanner
import java.util.regex._

object FileExplorer 
{
    def ConvertFileToListOfStrings(scanner: Scanner, endTag: String):List[String] = 
    {      
        def TermFound(p: Pattern): Boolean =
        {
            def loopTermFound(p: Pattern): Boolean =
            {
               if(scanner.hasNextLine())
               {
                  var lineRead = scanner.nextLine()
//                  println("pos 1 = " + lineRead)
		          var m = p.matcher(lineRead)
		          if (!(m.find())) loopTermFound(p) else true
               }
               else false         
           }
           loopTermFound(p)
       }
                           
        def loopExtractLines(acc:List[String], p: Pattern):List[String] =
    	{     
                   if(scanner.hasNextLine())
                   {
                       var lineRead = scanner.nextLine()
        		       var endMatch = p.matcher(lineRead)
			           if (!(endMatch.find()))  loopExtractLines(acc ::: List(lineRead), p) else acc 
                    }
                   else   acc    		      
   	    }
        var endPatt = Pattern.compile(endTag)
        if (TermFound(endPatt)) loopExtractLines(List(): List[String], endPatt) else List()
    }
}
