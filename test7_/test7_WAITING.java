//WAITING状态是线程执行了Object.wait()方法后所处的状态。
//执行wait()方法后线程状态枚举值就是WAITING。

class Lock{
    static final Byte lock=new Byte("0");
}
class Mythread7 extends Thread{

    @Override
    public void run() {
        try {
            synchronized (Lock.lock){
                Lock.lock.wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Run7 {
    public static void main(String[] args) {
        try{
            Mythread7 mythread7=new Mythread7();
            mythread7.start();
            Thread.sleep(1000);
            System.out.println("main方法中的mythread7状态： "+mythread7.getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
