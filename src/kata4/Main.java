
package kata4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;


public class Main {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathname = "C:\\Users\\usuario\\Documents";
        File file = new File (pathname);
        /*String [] dire = file.list();
        for (String dire1 : dire) {
            System.out.println(dire1);
        }
        print(file.listFiles(),"");*/
        String from="C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg";
        String to="C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert(1).jpg";
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        
        byte [] buffer = new byte[1024];
        
        Date date = new Date();
        while (true){
            int read = input.read(buffer);
            if(read<0)break;
            output.write(buffer);
        }
        System.out.println(new Date().getTime()-date.getTime()+ " msg");
        input.close();
        output.flush();
        output.close();
    }

    private static void print(File[] listFiles, String string) {
        if(listFiles == null){
            return;
        }
        for (File listFile : listFiles) {
            System.out.println(string +(listFile.isDirectory()? "+": "--> ")+ listFile.getName());
            if(listFile.isFile() || listFile.isHidden())continue;
            print(listFile.listFiles(),string+" ");
        }
    }
    
}
