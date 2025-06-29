import java.io.*;
public class IOExcp {
    public static void main(String[] args) {
        try{
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            int a = br.read();
            System.out.println(a);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
