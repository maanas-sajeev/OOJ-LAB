class Thread1 extends Thread{
    public void run(){
    while(true){
    System.out.println("BMSCE");
    try{
    Thread.sleep(10000);
    }
    catch(InterruptedException e){}
    }
    }
    }
    class Thread2 extends Thread{
    public void run(){
    while(true){
    System.out.println("CSE");
    try{
    Thread.sleep(2000);
    }
    catch(InterruptedException e){}
    }
    }
    }
    public class Thread {
    public static void main(String[] args) {
    Thread1 t1=new Thread1();
    Thread2 t2=new Thread2();
    t1.start();
    t2.start();
    }
    }