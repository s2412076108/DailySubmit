class Mythread{
    Thread t;//creat an booj of the buit-in class thread

    //constructor
    Mythread(){
        t=Thread.currentThread();
        System.out.println(t);

    }
}


public class ThreadDemo {
    public static void main(String args[]){
        System.out.println("Main thread");

        Mythread mt=new Mythread();
    }
}



