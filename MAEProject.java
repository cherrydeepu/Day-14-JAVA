class MAEProject{
    public static void main(String args[]){
        while(true){
        try
        {
            Thread.sleep(200);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("GOOD MORNING");
        try
        {
            Thread.sleep(600);
        }catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("GOOD AFTERNOON");
        try
        {
             Thread.sleep(800);
        }catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("GOOD EVENING");
    }
}
}