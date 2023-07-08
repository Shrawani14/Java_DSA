import java.util.*;

public class NDeque {

	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<>();
		d.addFirst(1);
		d.addFirst(2);
		d.addLast(5);
		d.addLast(6);
		
	
		
		System.out.println(d);
		System.out.println("first = "+d.getFirst());
		System.out.println("last = "+d.getLast());
		
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
	}

}
