package labels

import java.io.File

object wksht3
{
        var file = new File("/home/chuy/FOXPRO/trial/trial.txt");
                                                  //> file  : java.io.File = /home/chuy/FOXPRO/trial/trial.txt
 
    		if(file.delete){ println(file.getName + " is deleted!")}
    		else{println("Delete operation is failed.")}
                                                  //> trial.txt is deleted!
}