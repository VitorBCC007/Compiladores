package lexico;

import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

public class Entrada {
    InputStream is; 
    public Entrada (String arquivo){
        try{
            is = new FileInputStream(new File (arquivo));
        
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public int LerProximoCaractere(){
        try{
            int ret = is.read();
            System.out.println((char)ret);
            return ret;
        }catch (Exception e){
            e.printStackTrace();
            return -1; 
        }
    }

    
}
