import java.io.File;
import java.util.*;
public class fileFunctions {

    public static String getFileExtension(String path){
        String fName = new File(path).getName();
        int dotIndex = path.lastIndexOf('.');
        return (dotIndex == -1) ? "" : path.substring(dotIndex+1);
    }

    public static void main(String[] args) {
        System.out.println("Please Enter the Full path of the file.");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        File obj = new File(path);
        if(obj.exists()){
            System.out.println("Name of the File: "+obj.getName());

            System.out.println("File can Read: "+obj.canRead());

            System.out.println("File can Write: "+obj.canWrite());

            System.out.println("Size of the File: "+obj.length()+" bytes");

            System.out.println("Type of File: "+ getFileExtension(path));
        }else{
            System.out.println("The File Does not Exist!");
        }
    }
}
