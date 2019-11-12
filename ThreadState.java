public class ThreadState {
    public static void main(String[] args) {
        for (Thread.State state : Thread.State.values()) {
            System.out.println(state);
        }
    }
}



运行结果：
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED
