
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
    }
    
}
