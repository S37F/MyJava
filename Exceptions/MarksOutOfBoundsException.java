import java.util.*;
class MarksOutOfBoundsException extends Exception
{
	int subMarks;
	public MarksOutOfBoundsException(int marks,int flag)
	{

		subMarks=marks;	
		if(subMarks<0)
		{
			System.out.println("Subject:"+flag+" Marks must be Greater than 0 and less than 100");
		}
		if(subMarks>100)
		{
			System.out.println("Subject:"+flag+" Marks must be less than 100 and Greater than 0");
		}
		
	}
	
	public String tostring()
	{

		return "MarksOutOfBoundsException...(0>Marks<100)";

	}
}

class StudentResult
{
	String name,date,centerNo;
	int marks,seatNo,sub1,sub2,sub3,flag;
	
	Scanner sc=new Scanner(System.in);	

	public void getResultDetails() throws MarksOutOfBoundsException
	{
		System.out.println("Enter Students Name: ");
		name=sc.nextLine();
		System.out.println();
		System.out.println("Enter Date: ");
		date=sc.nextLine();
		System.out.println("Enter Students CenterNo: ");
		centerNo=sc.nextLine();
		System.out.println("Enter Students SeatNumber: ");
		seatNo=sc.nextInt();
		System.out.println("Enter Marks of Three Subjects: ");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		
			if(sub1<0||sub1>100)
				{
					flag=1;	
					throw new MarksOutOfBoundsException(sub1,flag);
					
				}
				
			else if(sub2<0||sub2>100)
				{
					flag=2;	
					throw new MarksOutOfBoundsException(sub2,flag);

				}
				
			else if(sub3<0||sub3>100)
				{
					flag=3;	
					throw new MarksOutOfBoundsException(sub3,flag);
				}
				
			else
				{
					displayResult();
				}
		}
	public void displayResult()
	{
		System.out.println("Students Name: "+name);
		System.out.println("Date: "+date);
		System.out.println("Students SeatNumber: "+seatNo);
		System.out.println("Students CenterNo: "+centerNo);
		System.out.println("Marks of Three Subjects: "+sub1+" "+sub2+" "+sub3);
	}

	public static void main(String args[])
	{
		StudentResult sr=new StudentResult();
			try
			{
			      sr.getResultDetails();
			}
			catch(MarksOutOfBoundsException mobe)
			{
				System.out.println(mobe);
				
			}

	}
}
