package labels

import java.io.File

object wksht2
{

    var path = "/home/chuy/FOXPRO/"               //
                                                  //> path  : String = /home/chuy/FOXPRO/
    var files = ""                                //
                                                  //> files  : String = ""
    var folder = new File(path);                  //
                                                  //> folder  : java.io.File = /home/chuy/FOXPRO
    var listOfFiles = folder.listFiles();         //
                                                  //> listOfFiles  : Array[java.io.File] = Array(/home/chuy/FOXPRO/000001039731.tx
                                                  //| t, /home/chuy/FOXPRO/basetiq, /home/chuy/FOXPRO/JSapconsole, /home/chuy/FOXP
                                                  //| RO/trial.txt, /home/chuy/FOXPRO/08042013.zip, /home/chuy/FOXPRO/000001039834
                                                  //| .txt, /home/chuy/FOXPRO/trial, /home/chuy/FOXPRO/000001039921.txt, /home/chu
                                                  //| y/FOXPRO/fox.docx, /home/chuy/FOXPRO/000001039618.txt)
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
      }                                           //> 000001039731.txt
                                                  //| trial.txt
                                                  //| 000001039834.txt
                                                  //| 000001039921.txt
                                                  //| 000001039618.txt
   }
}