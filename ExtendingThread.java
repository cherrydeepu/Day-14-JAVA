//Extending Thread class
class a extends Thread{
    public void r(){
        System.out.println("Hello i'm Thread");
    }
}
public class ExtendingThread{
    public static void main(String args[]){
        a j=new a ();
        j.r();
        j.start();
    }
}