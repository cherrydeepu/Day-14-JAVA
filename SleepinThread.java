public class SleepinThread{
    public static void main(String args[]){
        System.out.println("Thread Statring....");
        try{
            Thread.sleep(100000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Thread resumed");
    }
}