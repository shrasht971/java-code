//creating our thread using Runnable Interface
public class myThread implements Runnable{
    public void run(){
        //task for thread...
        for(int i =1;i<=10;i++){
            System.out.println("value of i is " +i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
    public static void main(String[] args) {
        //create object of myThread class
        myThread t1=new myThread();
        Thread thr=new Thread(t1);
        thr.start();
    }
}
