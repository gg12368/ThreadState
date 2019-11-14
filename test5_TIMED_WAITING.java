//线程状态TIMED_WAITING代表线程执行了Thread.sleep()方法，呈等待状态，等待时间到达，然后继续向下运行。
//执行sleep()方法后线程的状态枚举值就是TIMED_WAITING。
 class Mythread2 extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("begin sleep");
            Thread.sleep(1000);
            System.out.println("end sleep");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Run5 {
    public static void main(String[] args) {
        try{
            Mythread2 mythread2=new Mythread2();
            mythread2.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态： "+mythread2.getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}



运行结果：
begin sleep
end sleep
main方法中的状态：  RUNNABLE
