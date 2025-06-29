class A extends Thread {  
public void run(){  
for(int i=1;i<=5;i++)
{   System.out.println("Running Thread A: "+i);     }
System.out.println("exit from thread A");  
}
}
class B extends Thread {  
public void run(){  
for(int i=1;i<=3;i++)
{   System.out.println("Running Thread B: "+i);     }
System.out.println("exit from thread B");  
}}        
class C extends Thread{  
public void run(){  
for(int i=1;i<=3;i++)
{  System.out.println("Running Thread C: "+i);     }
System.out.println("exit from thread C");  
}
}
class ThreadPriority
{  
public static void main(String args[]) throws Exception{  
int MIN_PRIORITY=1;
int NORM_PRIORITY=5;
int MAX_PRIORITY=10;

A t1=new A(); 
B t2=new B(); 
C t3=new C();
t3.setPriority(Thread.MAX_PRIORITY); 
t2.setPriority(t1.getPriority()+1);
t1.setPriority(Thread.MIN_PRIORITY);
System.out.println("start of thread A"); 
t1.start();
t1.join();
System.out.println("start of thread B");  
t2.start();
t2.join();
System.out.println("start of thread C"); 
t3.start();    
t3.join();
 }  
} 