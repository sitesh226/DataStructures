package Threading;

public class OddEvenPrintUsingThreading {

    boolean odd;
    int count=1;
    int max=20;


    public static void main(String[] args) {
        OddEvenPrintUsingThreading oddEvenPrintUsingThreading = new OddEvenPrintUsingThreading();
        oddEvenPrintUsingThreading.odd = true;

        Thread t1 = new Thread(() -> {
            oddEvenPrintUsingThreading.printEven();
        });


        Thread t2 = new Thread(() -> {
            oddEvenPrintUsingThreading.printOdd();
        });

        t1.start();
        t2.start();


    }

    private synchronized void printOdd() {

        while (count < max) {

            while (!odd) {
                try {
                  //  System.out.println("Odd waiting : " + count);
                    wait();
                 //   System.out.println("Notified odd :" + count);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("Odd Thread:" + count);
            count++;
            odd = false;
            notify();
        }
    }

    private synchronized void printEven(){

            while(count<max){

                while (odd) {
                    try {
                  //      System.out.println("Even waiting: " + count);
                        wait();
                  //      System.out.println("Notified even:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even Thread:"+count);
                count++;
                odd=true;
                notify();
            }

    }
}
