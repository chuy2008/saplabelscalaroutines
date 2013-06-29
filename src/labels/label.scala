package labels

import java.io.File
import java.nio.charset._
import java.util.Scanner
import java.io.FileInputStream

object label extends App
{

  val referenceSapFields =    Array("FIELD_LABEL_FOR_SAP_1 =", 
    								"FIELD_LABEL_FOR_SAP_2 =",
    								"FIELD_LABEL_FOR_SAP_3 =",
    								"FIELD_LABEL_FOR_SAP_4 =",
    								"FIELD_LABEL_FOR_SAP_5 =",
    								"FIELD_LABEL_FOR_SAP_6 =",
    								"FIELD_LABEL_FOR_SAP_7 =",
    								"FIELD_LABEL_FOR_SAP_8 =",
    								"FIELD_LABEL_FOR_SAP_9 =",
    								"FIELD_LABEL_FOR_SAP_10 =",
    								"FIELD_LABEL_FOR_SAP_11 =",
            						"FIELD_LABEL_FOR_SAP_12 =",
    								"FIELD_LABEL_FOR_SAP_13 =",
    								"FIELD_LABEL_FOR_SAP_14 =",
    								"FIELD_LABEL_FOR_SAP_15 =",
    								"FIELD_LABEL_FOR_SAP_16 =",
    								"FIELD_LABEL_FOR_SAP_17 =",
    								"FIELD_LABEL_FOR_SAP_18 =",
    								"FIELD_LABEL_FOR_SAP_19 =",
    								"FIELD_LABEL_FOR_SAP_20 =",
    								"FIELD_LABEL_FOR_SAP_21 =",
    								"FIELD_LABEL_FOR_SAP_22 =")
  
  val referenceLabelFields =  Array("FIELD_LABEL_FOR_DBF_1 =", 
    								"FIELD_LABEL_FOR_DBF_2 =",
    								"FIELD_LABEL_FOR_DBF_3 =",
    								"FIELD_LABEL_FOR_DBF_4 =",
    								"FIELD_LABEL_FOR_DBF_5 =",
    								"FIELD_LABEL_FOR_DBF_6 =",
    								"FIELD_LABEL_FOR_DBF_7 =",
    								"FIELD_LABEL_FOR_DBF_8 =",
    								"FIELD_LABEL_FOR_DBF_9 =",
    								"FIELD_LABEL_FOR_DBF_10 =",
    								"FIELD_LABEL_FOR_DBF_11 =",
            						"FIELD_LABEL_FOR_DBF_12 =",
    								"FIELD_LABEL_FOR_DBF_13 =",
    								"FIELD_LABEL_FOR_DBF_14 =",
    								"FIELD_LABEL_FOR_DBF_15 =",
    								"FIELD_LABEL_FOR_DBF_16 =",
    								"FIELD_LABEL_FOR_DBF_17 =",
    								"FIELD_LABEL_FOR_DBF_18 =",
    								"FIELD_LABEL_FOR_DBF_19 =",
    								"FIELD_LABEL_FOR_DBF_20 =",
    								"FIELD_LABEL_FOR_DBF_21 =",
    								"FIELD_LABEL_FOR_DBF_22 =")
  
  
//     val fileNameAndPath           	    = "/home/chuy/FOXPRO/000001039618.txt"
    								
     val inputParameterFile             = "home/chuy/FOXPRO/trial/inputParameterFile.txt"
       
     var inputParameterScanner = new Scanner(new FileInputStream(new File(inputParameterFile)))
     var inputParameterListOfStrings = FileExplorer.ConvertFileToListOfStrings(inputParameterScanner, "END OF FILE")

/*
 *         In the routine below "referenceSapFields" is the label that is written in the inputParameterFile
 *         that must be used as a guide to assign the sapFieldName....
 */             
     val sapFieldsName =  InitialParameterSearch.EstablishFields(inputParameterListOfStrings, referenceSapFields)
 /*
 *         In the routine below "referenceLabelFields" is the label that is written in the inputParameterFile
 *         that must be used as a guide to assign the labelFieldName....
 */                                                                                  
                                                                                                                                                                   
     val labelFieldsName =  InitialParameterSearch.EstablishFields(inputParameterListOfStrings, referenceLabelFields)
                                                                                   
     val listOfFiles     =  InitialParameterSearch.SearchForFiles(inputParameterFile)
     
/*    
 *         idealmente a continuacion no conviene convertir a String para mas adelante convertir a File
 */     
     val sapOutputFileNameAndPath                = listOfFiles(0).getName
     val labelInputFile
     
     val sapLabeler                  	= new SapOutput(sapOutputFileNameAndPath, StandardCharsets.UTF_8)
     val sapOutputList					= sapLabeler.getParsedFile
     println (sapOutputList)
//     sapLabeler.printParsedFile
//     val sipOutput = List("1", "2", "3", "4", "5")
     DBaseWr.createDbfFile(sapOutputList, "OutputFile.dbf")
  
}
     
     
     
/*
  def main(args: Array[String]): Unit = 
  {
    
 //     file location (folder) for file to be read should be configurable on the interface or written on a file

    
    
    
 //     read file and convert to List of Strings
    
    
    
 //     output folder should also be defined on the interface
    
    
//      separate fields according to separator    

    
//      create a new List of Strings based on separators
    
    
  }

*/



  
  
  
  
  
  
  
