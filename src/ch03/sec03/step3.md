Change the `RunnableDemo` to also have 1000 threads saying "Goodbye". Start both tasks. 

If you want to see the tasks run concurrently, slow them down by adding 

    try { Thread.sleep(10); } catch (InterruptedException ex) {}
    
inside the `for` loop.    
