package InterviewAlgorithm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadPool {
    public static void main(String[] args) {
        // 创建一个固定大小的线程池，线程池中有5个线程
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        // 往线程池中提交任务
        for (int i = 1; i <= 10; i++) {
            final int task = i;
            threadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "执行了任务" + task);
                }
            });
        }

        // 关闭线程池
        threadPool.shutdown();
    }
}
