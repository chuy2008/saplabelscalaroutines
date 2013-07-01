package labels

import com.linuxense.javadbf._
import java.io._

object DBaseWr 
{
   def createDbfFile(inputList: List[String], dbfLabels: Array[String], outputFileNameAndPath: String ) =
   {     

      val inputZippedList          = dbfLabels zip inputList
      val outputFile       		= new File(outputFileNameAndPath)  
      val fos = new FileOutputStream(outputFile);
      val writer = new DBFWriter
      var fields = new Array[DBFField](2)

      fields(0) = new DBFField()
      fields(0).setName("field 1")
      fields(0).setDataType( DBFField.FIELD_TYPE_C)
      fields(0).setFieldLength(30)

      fields(1) = new DBFField()
      fields(1).setName("field 2")
      fields(1).setDataType( DBFField.FIELD_TYPE_C)
      fields(1).setFieldLength(200)
            
      writer.setFields(fields)
        
      var rowData = new Array[Object](2)
      for (i <- inputZippedList)
      {
        rowData(0) = i._1
        rowData(1) = i._2
        println(i)
        writer.addRecord(rowData);
        rowData = new Array[Object](2)   // this is a necessary step
      }
      
    writer.write(fos);
    fos.flush()
    fos.close();
         
   }
  
}

class DBaseWr
{
  
}