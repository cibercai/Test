
package executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class FixedPool {

  private static ExecutorService service = null;

  private static final int noThreads = 1;

  public FixedPool() {
    synchronized (FixedPool.class) {
      if (service == null) {
        start();
      }
    }
  }

  /**
   *
   */
  private void start() {
    service = Executors.newFixedThreadPool(noThreads, new ThreadFactory() {
      private int no = 1;

      @Override
      public Thread newThread(Runnable r) {
        System.out.println("A thread");
        Thread t = new Thread(r, "Tester - " + (this.no++));
        return t;
      }
    });
  }

  public void stop() {
    if (service != null) {
      service.shutdown();
    }
  }

  public void addJob(String job) {
    // service.execute(new Printer(job));
    service.submit(new Printer(job));
  }

  public static void main(String[] args) {
    FixedPool pools = new FixedPool();
    for (int i = 0; i < 10; i++) {
      pools.addJob(String.valueOf(i));
    }
    pools.stop();
    System.out.println("completed");
  }

}

class Printer implements Runnable {
  private final String _name;

  Printer(String name) {
    this._name = name;
  }

  /* (non-Javadoc)
   * @see java.lang.Runnable#run()
   */
  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println("printer  [ " + this._name + " ]  " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }

}
