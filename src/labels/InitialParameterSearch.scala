package labels

import java.io.File
import java.util.Scanner
import java.util.regex._

object InitialParameterSearch 
{
   
   def SearchForFiles(inputPath: String): Array[File] =
   {
      val folder = new File(inputPath)                  
      folder.listFiles()         
   }
  
   def EstablishFields(inputListOfStrings: List[String], fieldNames: Array[String]): Array[String] = 
   {
      for(fn <- fieldNames) yield FindInputString(inputListOfStrings, fn)
   }
   
   def EstablishField(inputListOfStrings: List[String], fieldName: String): String = 
   {
      FindInputString(inputListOfStrings, fieldName)
   }
   
	def FindInputString(LofS: List[String], str1: String): String =
	{
	    var str3 =""
		for(i <- LofS)
		{
			var p = Pattern.compile(str1);
			var m = p.matcher(i);
			if (m.find())
			{
				str3 = find_field_to_search(i);
			}
		}
		str3
	}
	
	def find_field_to_search(str: String): String =
	{
		var n = str.indexOf('"')
		var m = findlastquote(str)
		str.substring((n + 1), m)
	}
	
	def findlastquote(str: String): Int = 
	{
		var n = str.length() - 1
		while (str.charAt(n) != '"')
		{
			n -= n
		}
		n
	}     
}

