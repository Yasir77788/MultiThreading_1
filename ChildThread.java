// Yasir Hassan
// MultiThreading
// This program generates as many threads as needed.
// implementing Runnable interface and different Thread methods such as 
// start(), run(), isAlive(), and join().

package multiThreadingPackage;

// ChildThread class implements Runnable interface, to construct thread(s).
// Runnable abstracts a unit of executable code.
// This class implements a single Runnable method called run().
public class ChildThread implements Runnable // start of the ChildThread
{
	Thread threadObj;  // declaring Thread object
	String threadName; // Thread name
	
	/**
	   Constructor
	   creating a ChildThread object.
	   @param threadName the thread name
	 */
	public ChildThread (String threadName)
	{
		// assign name to the threadName
		this.threadName = threadName;
		
		// Passing this as the first parameter indicates that you want the new thread 
		// to call the run() method on this object.
		// The second parameter is the thread name.
		threadObj = new Thread(this, threadName);
		System.out.println("New Child thread: " + threadObj);
	}
	
	/**
	   run() is the entry point for the new thread (child thread)
	   where the thread code is defined and executed.
	 */
	@Override
	public void run()
	{
		try
		{
			// For loop counts down from five, pausing one second between each line
			// The argument to sleep() specifies the delay period in milliseconds.
			for(int i = 5; i > 0; --i)
			{
				System.out.println(threadName + ": " + i);
				
				// this thread sleep for a second (1000 milliseconds )
				Thread.sleep(1000);
			}
			
		}
		// The sleep() method  might throw an InterruptedException, if some
		// other thread wanted to interrupt this sleeping thread.
		catch(InterruptedException e)
		{
			System.out.println(threadName + ": is interrupted.");
		}
		
		System.out.println("Exiting thread " + threadName);
	}
	
} // End of the ChildThread