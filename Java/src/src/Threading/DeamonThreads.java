package Threading;


class BaseThread implements  Runnable{

  //  @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName()+"  is deamon thread");
        }else
            System.out.println(Thread.currentThread().getName()+"  is user Thread");
    }
}
public class DeamonThreads {

    public static void main(String[] args){
        BaseThread base=new BaseThread();
        Thread t1=new Thread(base,"Thread 1");
        Thread t2=new Thread(base,"Thread 2");
        Thread t3=new Thread(base,"Thread 3");

        t3.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }


}
