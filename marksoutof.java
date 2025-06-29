import java.util.*;
public class marksoutof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 , m2 , m3 , flag ;
        System.out.println("Enter m1 ,m2 , m3 :");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        try{
            if (m1 > 50 || m1<20 ) {
                flag = 1 ;
                throw new MarksOutOfBoundsException(m1, flag);
            }
            else if(m2>50 || m2<20){
                flag = 2 ;
                throw new MarksOutOfBoundsException(m2, flag);
            }
            else if (m3 >50 || m3<20) {
                flag = 3 ;
                throw new MarksOutOfBoundsException(m3, flag);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
