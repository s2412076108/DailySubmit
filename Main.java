<<<<<<< HEAD
import first_package.My_Package;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello");
        My_Package ob = new My_Package();
        ob.addition();
    }
}

=======
class ChildThread1 implements Runnable{
    ChildThread1(String child_name){
        Thread t = new Thread(this, child_name);

        t.start();

    }

    public void run(){

        System.out.println("Child");
    }

}

class ChildThread2 implements Runnable{
    ChildThread2(String child_name){
        Thread t = new Thread(this, child_name);

        t.start();
    }

    public void run(){
        Thread ct = Thread.currentThread();
        System.out.println("ct");
    }

}

class MultiThread{
	public static void main(String args[]){
        Thread ct = Thread.currentThread();
        System.out.println(ct);

        new ChildThread1(Child1.1);
        new ChildThread1(Child1.2);
        new ChildThread2(Child2.1);
	}
}
>>>>>>> 414f4db4592cd0c56bfd0fc5deb9cac402f80d6f
