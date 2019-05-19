import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		/* Queue is a first in first out (FIFO) structure
		 first item in(item added the earliest) first item out,
		 * Array Blocking Queue is a class that has a limited size of occupants
		 * queues have limits to how many can be in queue
		 * linked list has potentially infinant size
		 * 
		 * In array blocking queue, can use forLoops
		 * use element to see head of queue
		 * Some Different methods of Queue:
		 * poll to attempt to remove items from queue  instead of throwing exception, it returns null.
		 * peek will bring you to the head of the queue
		 * queues can be bounded or unbounded
		 * queues can be used in multithreaded and single threaded code.
		 */

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		//throws no such element exception, no items in queue yet
		System.out.println("Head of queue is:" + q1.element());
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Head of queue is:" + q1.element());
		
		try {
			q1.add(40);
		} catch (Exception e) {
			System.out.println("Tried add too many items to the queue.");
		}
		
		for(Integer value: q1) {
			System.out.println("Queue value: " + value);
			
			
		}
		System.out.println("removed from queue: " + q1.remove());
		System.out.println("removed from queue: " + q1.remove());
		System.out.println("removed from queue: " + q1.remove());

		System.out.println("removed from queue: " + q1.remove());
		
		try {
			System.out.println("removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items from queue ");
			// TODO: handle exception
		}
		
		//////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		
		for(Integer value: q2) {
			System.out.println("Queue value: " + value);
			
			
		}
		
	}

}
