// Yasir Hassan
// MultiThreading
// This program generates as many threads as needed.
// implementing Runnable interface and different Thread methods such as 
// start(), run(), isAlive(), and join().

package multiThreadingPackage;

public class MainThread // start of the Main Thread
{
	public static void main(String[] args)
	{
		
		// create the child Thread objects
		ChildThread childThreadObj1 = new ChildThread("One");
		ChildThread childThreadObj2 = new ChildThread("Two");
		ChildThread childThreadObj3= new ChildThread("Three");
		
		// call start() method to initiates a call to run() of the specific child thread.
		childThreadObj1.threadObj.start();
		childThreadObj2.threadObj.start();
		childThreadObj3.threadObj.start();
		
		// The isAlive( ) method returns true if the thread upon which it is called is still running. 
		// isAlive() returns false otherwise.
		System.out.println("\nThread one is alive? " + childThreadObj1.threadObj.isAlive());
		System.out.println("Thread two is alive? " + childThreadObj2.threadObj.isAlive());
		System.out.println("Thread three is alive? " + childThreadObj3.threadObj.isAlive());
		System.out.println();

		try
		{
			// join() method waits until the thread on which it is called terminates.
			// using join() to wait for the threads to finish
			childThreadObj1.threadObj.join();
			childThreadObj2.threadObj.join();
			childThreadObj3.threadObj.join();
		}
		
		// The join() method  might throw an InterruptedException,
		// if some other thread wanted to interrupt this method.
		catch(InterruptedException e)
		{
			System.out.print("Child thread is interrupted.");
		}
		//
		
		// After calls to join() return, the main thread continues.
		System.out.println("\nThread one is alive? " + childThreadObj1.threadObj.isAlive());
		System.out.println("Thread two is alive? " + childThreadObj2.threadObj.isAlive());
		System.out.println("Thread three is alive? " + childThreadObj3.threadObj.isAlive());
		
		System.out.print("\nMain thread exiting.");
			
	}
	
} // End of the Main Thread