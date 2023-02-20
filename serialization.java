import java.io.*;
import java.rmi.server.RemoteObjectInvocationHandler;

class serial implements Serializable{
    int id;
    String name;
    public serial(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class serialization{
    public static void main(String[] args)throws Exception{
            try{
                serial o1 = new serial(34,"Vishal");
                FileOutputStream fout = new FileOutputStream("res.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);
                out.writeObject(o1);
                out.flush();
                out.close();
                System.out.println("Completed");
            }catch(Exception e){System.out.println(e);}
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("res.txt"));
                serial s = (serial) in.readObject();
                System.out.println(s.id + " " + s.name);
                in.close();
            }catch (Exception e){System.out.println(e);}

        }
}