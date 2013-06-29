package labels

import java.io.File

object wksht2
{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(106); 

    var path = "/home/chuy/FOXPRO/";System.out.println("""path  : String = """ + $show(path ));$skip(53);                //
    var files = "";System.out.println("""files  : String = """ + $show(files ));$skip(53);                                 //
    var folder = new File(path);System.out.println("""folder  : java.io.File = """ + $show(folder ));$skip(53); ;                  //
    var listOfFiles = folder.listFiles();System.out.println("""listOfFiles  : Array[java.io.File] = """ + $show(listOfFiles ));$skip(310); ;         //
                                                  //
 
   for (i <- 0 to (listOfFiles.length - 1))
   {
      if (listOfFiles(i).isFile)
      {
         files = listOfFiles(i).getName();
         if (files.endsWith(".txt") || files.endsWith(".TXT"))
         {
             println(files);
         }
      }}
   }
}
