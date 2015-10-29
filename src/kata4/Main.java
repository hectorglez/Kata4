
package kata4;

import java.io.File;


public class Main {

    
    public static void main(String[] args) {
       String pathname = "C:\\Users\\usuario\\Documents";
       File file = new File (pathname);
       String [] dire = file.list();
        for (String dire1 : dire) {
            System.out.println(dire1);
        }
        print(file.listFiles(),"");
    }

    private static void print(File[] listFiles, String string) {
        if(listFiles == null){
            return;
        }
        for (File listFile : listFiles) {
            System.out.println(string +(listFile.isDirectory()? "+": " ")+ listFile.getName());
            if(listFile.isFile() || listFile.isHidden())continue;
            print(listFile.listFiles(),string+" ");
        }
    }
    
}
