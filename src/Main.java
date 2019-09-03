public class Main {

    public static void main(String[] args) {

        ThisThread thisThread=new ThisThread("Count");           //calling the Class where thread is implemanted;
        Thread thread=new Thread(thisThread);                         // constructing the Thread with the class
        thread.start();                                              // this will start the Thread
    }
}

class ThisThread implements Runnable{


        String getThread;                                       //Initialize a String



    @Override
    public void run() {                                         //  This is automaticly genarated method when we implementing Runnable;
        System.out.println(getThread+" is Starting ");
        for(int c=0;c<10;c++){                                  // Initialize for loot for completing the Threads;
            try {
                Thread.sleep(1000);                        // Te=his helps to sleep Threads at the desired time as mentions
                System.out.println(getThread+" is Counting Position "+c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Terminated");
        }
    }

    ThisThread(String string){                      // This will helps to set String value in Thread
        this.getThread=string;
    }
}
