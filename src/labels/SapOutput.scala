package labels

import java.util.regex._
import java.nio.charset._
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.Files
import scala.collection.JavaConverters._

class SapOutput 
{

  	private  var p = Pattern.compile("")
	private  var m = p.matcher("lll")
	private  var fileWithTextsToSearch = ""
	private  var lines: List[String] = List()
	private  var charset = StandardCharsets.UTF_8
	
	def this(fileName: String, charsett: Charset)
	{
	  this()
	  this.fileWithTextsToSearch = fileName
	  this.charset = charsett
	  this.lines = readSmallTextFile(this.fileWithTextsToSearch, this.charset)	  
	}
	
    def readSmallTextFile(fileInQuestion: String, charsett: Charset): List[String] =
    {
//	    var path = Paths.get(fileInQuestion)
//	    val initialStringList = Files.readAllLines(Paths.get(fileInQuestion), charsett).asScala.toList
	    this.separateEachField('|', Files.readAllLines(Paths.get(fileInQuestion), charsett).asScala.toList)
    }

    def separateEachField(c: Char, lll: List[String]): List[String] = 
    {
       var l:List[String] = List()
       var listCh = for(ll <- lll)yield string2Chars(ll)
       var acc = ""
       for (chhh <- listCh)
       {
          for(chh  <- chhh)
          {
             if (chh != '|') acc = acc + chh else {l = acc :: l; acc = "" }
          } 
       }       
       l.reverse
    }
    
     def string2Chars(str: String): List[Char] = str.toList
     
     def printParsedFile = {println(this.lines); println("length = " + this.lines.length)}
     
     def getParsedFile: List[String] = this.lines

}

/*
 * 
 * 
 * 
	
	protected String find_input_str(String str1)
	{
		String str3;
		str3 = "";
		int i;
		for(i = 0; i < this.lines.size(); i++)
		{
			p = Pattern.compile(str1);
			m = p.matcher(this.lines.get(i));
			if (m.find())
			{
				 str3 = this.find_field_to_search(this.lines.get(i));
			}
		}
		return str3;
	}
	
	private String find_field_to_search(String str)
	{
		int n, m;
		String str1;
		n = str.indexOf('"');
//		m = str.indexOf('"', (n + 1));
		m = findlastquote(str);
		str1 = str.substring((n + 1), m);
		return str1;
	}
	
	private int findlastquote(String str)
	{
		int n;
		n = str.length() - 1;
		while (str.charAt(n) != '"')
		{
			n--;
		}
		return n;
	}
	
 * 
 * 
 * 
 * 
 */
