public class Run4 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
            System.out.println(Thread.currentThread().getName() + ": 我跑着呢");
            // Thread.yield();
                }
        }, "李四");
        Thread thread2 = new Thread(() -> {
            while (true) {
            System.out.println(Thread.currentThread().getName() + ": 我跑着呢");
            }
        }, "王五");
        thread1.start();
        thread2.start();
    }
}




运行结束：

yield() 只是让出 CPU，并不会改变自己的状态。也就上面途中，我从柜台前站起，又重新去排队去了
因为李四总是无私的让出座位，王五并不让座位，所以会导致王五打印的更多。
