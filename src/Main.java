public class Main {

    public static void main(String[] args) {

        ThisThread thisThread=new ThisThread("Count");
        Thread thread=new Thread(thisThread);
        thread.start();
    }
}

class ThisThread implements Runnable{
        String getThread;
    @Override
    public void run() {
        System.out.println(getThread+" is Starting ");
        for(int c=0;c<10;c++){
            try {
                Thread.sleep(1000);
                System.out.println(getThread+" is Counting Position "+c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Terminated");
        }
    }

    ThisThread(String string){
        this.getThread=string;
    }
}
