import java.util.SortedMap;

class MyThread extends Thread{
    public MyThread(){
        System.out.println("构造方法中的状态: Thread.currentThread().getState()="+Thread.currentThread().getState());
        System.out.println("构造方法中的状态：this.getState()="+this.getState());
    }
    @Override
    public void run(){
        System.out.println("run方法中的状态："+Thread.currentThread().getState());
    }
}
public class Run1 {
    public static void main(String[] args) {
        try {
            MyThread mythread=new MyThread();
            System.out.println("main方法中的状态1："+mythread.getState());
            Thread.sleep(1000);
            mythread.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2："+mythread.getState());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}



运行结果：
构造方法中的状态: Thread.currentThread().getState()=RUNNABLE
构造方法中的状态：this.getState()=NEW
main方法中的状态1：NEW
run方法中的状态：RUNNABLE
main方法中的状态2：TERMINATED
