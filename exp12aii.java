import java.io.*;
public class exp12aii {
    public static void main(String[] args) {
        try{
            InputStreamReader i = new InputStreamReader(System.in);
            BufferedReader r = new BufferedReader(i);
            String str = r.readLine();
            System.out.println(str);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
