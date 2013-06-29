package labels

import com.linuxense.javadbf._
import java.io._

object DBaseWr 
{
   def createDbfFile(inputList: List[String], outputFileNameAndPath: String ) =
   {     
     
      val outputFile       		= new File(outputFileNameAndPath)  
      val fos = new FileOutputStream(outputFile);
      val writer = new DBFWriter
      var fields = new Array[DBFField](2)

      fields(0) = new DBFField()
      fields(0).setName("field 1")
      fields(0).setDataType( DBFField.FIELD_TYPE_C)
      fields(0).setFieldLength(10)

      fields(1) = new DBFField()
      fields(1).setName("field 2")
      fields(1).setDataType( DBFField.FIELD_TYPE_C)
      fields(1).setFieldLength(200)

//      fields[2] = new DBFField();
//      fields(2).setName( "field 3")
//      fields(2).setDataType( DBFField.FIELD_TYPE_C)
//      fields(2).setFieldLength(12)
     
            
      writer.setFields(fields)

    // now populate DBFWriter
    //

/*      
        var rowData = new Array[Object](2)
        rowData(0) = "1000"
        rowData(1) = inputList(0)
        println(rowData(1))
        writer.addRecord(rowData);

        rowData = new Array[Object](2)        
        rowData(0) = "1001"
        rowData(1) = inputList(1)
        println(rowData(1))
        writer.addRecord(rowData);

        rowData = new Array[Object](2)
        rowData(0) = "1002"
        rowData(1) = inputList(2)
        println(rowData(1))
        writer.addRecord(rowData);      
      
        rowData = new Array[Object](2)
        rowData(0) = "1003"
        rowData(1) = inputList(3)
        println(rowData(1))
        writer.addRecord(rowData);

      
        rowData = new Array[Object](2)
        rowData(0) = "1004"
        rowData(1) = inputList(4)
        println(rowData(1))
        writer.addRecord(rowData);        
*/        
        
      var rowData = new Array[Object](2)
      for (i <- inputList)
      {
        rowData(0) = "1000"
        rowData(1) = i
        println(i)
        writer.addRecord(rowData);
        rowData = new Array[Object](2)   // this is a necessary step
      }
      
//      rowData(0) = "1000"
//      rowData(1) = "John"
//      rowData(2) = "ppp"
//      writer.addRecord(rowData);

//    rowData = new Object[3];
//    rowData(0) = "1001"
//    rowData(1) = "Lalit"
//    rowData(2) = "lll"
//    writer.addRecord(rowData);

//    rowData = new Object[3];
//    rowData(0) = "1002"
//    rowData(1) = "Rohit"
//    rowData(2) = "fff"
//    writer.addRecord(rowData);


    writer.write(fos);
    fos.flush()
    fos.close();
         
   }
  
}

class DBaseWr
{
  
}