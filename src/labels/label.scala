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
    								
     val inputParameterFile             = "/home/chuy/FOXPRO/trial/inputParameterFile.txt"       
     var inputParameterScanner = new Scanner(new FileInputStream(new File(inputParameterFile)))
     var inputParameterListOfStrings = FileExplorer.ConvertFileToListOfStrings(inputParameterScanner, "END OF FILE")
     val sapFieldsName   =  InitialParameterSearch.EstablishFields(inputParameterListOfStrings, 
                                                                   referenceSapFields)
     val labelFieldsName =  InitialParameterSearch.EstablishFields(inputParameterListOfStrings, 
                                                                   referenceLabelFields)
     val inputFolder     = InitialParameterSearch.EstablishField(inputParameterListOfStrings,
                           "INPUT_FOLDER_WITH_SAP_OUTPUT_FILES")
     val outputFolder    = InitialParameterSearch.EstablishField(inputParameterListOfStrings,
                           "OUTPUT_FOLDER_WITH_FILES_READY_FOR_EASY_LABEL")     
     val listOfFiles     =  InitialParameterSearch.SearchForFiles(inputFolder)   
 
     val plainFileName                  = listOfFiles(0).getName
     val sapOutputFileNameAndPath       = inputFolder + plainFileName  
     val sapLabeler                  	= new SapOutput(sapOutputFileNameAndPath, StandardCharsets.UTF_8)     
     val sapOutputList					= sapLabeler.getParsedFile
     val easyLabelInputFile             = outputFolder + AdaptNameToDBF(plainFileName)

     DBaseWr.createDbfFile(sapOutputList, labelFieldsName, easyLabelInputFile)
    
     def AdaptNameToDBF(str:String): String =
    {
       str.substring(0, str.length - 4) + "&.dbf"
     }
}


     