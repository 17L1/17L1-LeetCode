package Algorithm.caozuoxitong.deadLock;

/**
 * @author: 17L1
 * @date: 2021年08月22日 11:15 下午
 * @method：
 */
public class DeadLockDemo1 {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() ->{
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + "get the resource1");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waitting for the resource2");
                synchronized (resource2) {
                    System.out.println(Thread.currentThread() + "get the resource2");
                }
            }
        }).start();
        new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread() + "get the resource2");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waitting for the resource1");
                synchronized (resource1) {
                    System.out.println(Thread.currentThread() + "get the resource2");
                }
            }
        }).start();
    }
}
