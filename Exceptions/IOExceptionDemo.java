import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) {
	try
    {
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);      
	    String s= br.readLine();
	    System.out.println(s);
}
    catch(IOException e)
        {
             System.out.println(e);
        }
    }
    }