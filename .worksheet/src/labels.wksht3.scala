package labels

import java.io.File

object wksht3
{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(118); 
        var file = new File("/home/chuy/FOXPRO/trial/trial.txt");System.out.println("""file  : java.io.File = """ + $show(file ));$skip(116); ;
 
    		if(file.delete){ println(file.getName + " is deleted!")}
    		else{println("Delete operation is failed.")}}
}
