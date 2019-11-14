//BLOCK状态出现在某个线程在等待锁的时候。
//从运行结果来看mythread32线程一直在等待mythread31对锁进行释放，所以mythread32当时处于BLOCKED状态。
 class MyService{
    synchronized static public void serviceMethod(){
        try{
            System.out.println(Thread.currentThread().getName()+"进入了业务方法");
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

 class MyThread31 extends Thread{
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}

 class MyThread32 extends Thread{
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}

public class Run6 {
    public static void main(String[] args) throws InterruptedException{
        MyThread31 mythread31=new MyThread31();
        mythread31.setName("a");
        mythread31.start();
        Thread.sleep(1000);
        MyThread32 mythread32=new MyThread32();
        mythread32.setName("b");
        mythread32.start();
        Thread.sleep(1000);
        System.out.println("main方法中没有thread21状态："+mythread32.getState());
    }
}
