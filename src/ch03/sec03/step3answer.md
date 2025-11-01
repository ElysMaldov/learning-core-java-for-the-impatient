Add a class

    class GoodbyeTask implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Goodbye");
                try { Thread.sleep(10); } catch (InterruptedException ex) {}
            } 
        }
    }

Also add the call to `Thread.sleep(10)` to the `HelloTask`. 

Start both threads:

    Runnable task1 = new HelloTask();
    Runnable task2 = new GoodbyeTask();
    Thread.ofPlatform().start(task1);
    Thread.ofPlatform().start(task2);
