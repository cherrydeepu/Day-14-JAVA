//Implementing runnable interface
class a implements Runnable{
    public void run(){
        System.out.println("Hello i'm Thread");
    }
}
public class RunnableInterface{
    public static void main(String args[]){
        a j=new a ();
        Thread s=new Thread(j);
        s.start();
        s.run();
    }
}