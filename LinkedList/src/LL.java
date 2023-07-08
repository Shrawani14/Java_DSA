
public class LL {

	
	public static class Node{
		int data;
		Node next;
		
		//constructor
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	
	public void addFirst(int data){
		//1 - create new node
		Node newNode = new Node(data);
		size++;
		
		if(head == null){
			head = tail = newNode;
			return;
		}
		//2 - newNode next = head
		newNode.next = head;
		
		//3 - head = newNode
		head = newNode;
	}
	
	public void addLast(int data){
		
		
		//new node create
		Node newNode = new Node(data);
		size++;
		if(head == null){
			head = tail = null;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public void print(){
		if(head == null){
			System.out.println("LL is empty");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next; // update krdungi next ko
		}
		System.out.println("null");
	}
	
	public void add(int idx, int data){
		if(idx == 0){
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i = 0;
		while(i<idx-1){
			temp = temp.next;
			i++;
		}
		
		//i = idx-1; temp -> prev
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	//remove first
	public int removeFirst(){
		
		//special cases
		if(size == 0){
			System.out.println("LL is empty");
			return Integer.MAX_VALUE;
		}
		else if(size == 1){ //BOth head and tail are same
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}
	
	//remove last
	public int removeLast(){
		
		if(size == 0){
			System.out.println("LL is empty");
			return Integer.MAX_VALUE;
		}
		else if(size == 1){
			int val = head.data;
			size = 0;
			head = tail = null;
			return val;
		}
		Node prev = head;
		for(int i=0; i< size-2;i++){
			prev = prev.next;
		}
		int val = prev.next.data;
		prev.next = null;
		tail = prev;
		size--;
		return val;
	}
	
	
	//iterative search 
	
//	public int search(int key){
//		
//		Node temp = head;
//		int i = 0;
//		while(temp != null){
//			if(temp.data == key){
//				return i;
//			}
//			temp = temp.next;
//			i++;
//		}
//		//Key not found
//		return -1;
//	}
	
	public int helper(Node head , int key){
		//Base case
		if(head == null){
			return -1;
		}
		
		if(head.data == key){
			return 0;
		}
		int idx = helper(head.next,key);
		if(idx == -1){
			return -1;
		}
		return idx+1;
	}
	
	public int recSearch(int  key){
		return helper(head, key);
	}
	
	
	public void reverse(){
		Node prev = null;
		Node curr = tail =  head;
		Node next;
		
		while(curr!= null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		
	}
	
	
	public void deleteNthFromEnd(int n ){
		//calculate size
		int sz = 0;
		Node temp = head;
		while(temp!= null){
			temp = temp.next;
			sz++;
		}
		
		if(n == sz){
			head = head.next; //remove first
			return ;
		}
		int i = 1;
		int itofind = sz - n;
		Node prev = head ;
		while(i< itofind){
			prev = prev.next;
			i++;
		}
		prev.next = prev.next.next;
		return;
	}
	
	
	public Node findMid(Node head){
		Node slow = head;
		Node fast = head;
		
		while(fast!= null && fast.next != null){
			slow = slow.next; //+1
			fast = fast.next.next; //+2
			
		}
		return slow; // slow is my middle
	}
	
	public boolean pallindrome(){
		
		if(head == null || head.next == null){
			return true;
		}
		
		//step1 - find mid
		Node mid = findMid(head);
		
		//step2- reverse 2nd half
		 
		Node curr = mid;
		Node prev = null;
		Node next;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node right = prev;
		Node left = head;
		
		//step3- check if left half and right half
		while(right != null){
			if(left.data != right.data){
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
		
	}
	
	//Cycle in LL
	public static boolean isCycle(){ 
		Node slow = head;
		Node fast = head;
		
		while(fast!= null && fast.next!= null){
			slow = slow.next;
			fast = fast.next;
			if(slow == fast){
				return true; //cycle exists
			}
		}
		return false;
	}
	
	public static void removeCycle(){
		//detect cycle
		Node slow = head;
		Node fast = head;
		boolean cycle = false; // cycle dont exist
		while(fast!= null && fast.next!= null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow){
				cycle  = true;
				break;
			}
		}
		if(cycle == false){
			return;
		}
		//find meeting point
		slow = head;
		Node prev = null; // last node
		while(slow!= fast){
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		
		//remove cycle -> last.next = null
		prev.next = null;
	}
	
	
	public void zigzag(){
		//find mid
		Node slow = head;
		Node fast = head.next;
		
		while(fast!= null && fast.next != null){
			slow = slow.next; //+1
			fast = fast.next.next; //+2
			
		}
		Node midn = slow; // slow is my middle
	
		
		//reverse
		Node curr = midn.next;
		midn.next = null ;
		Node prev = null;
		Node next;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node right = prev;
		Node left = head;
		Node nextL , nextR;

		// alt merging
		while(left!= null && right != null){
			nextL = left.next;
			left.next = right;
			nextR = right.next;
			right.next = nextL;
			
			left = nextL;
			right = nextR;
		}
		
	}
	public static void main(String[] args) {
		
		LL ll = new LL(); // object
//		
//		ll.addFirst(1);
//		ll.addFirst(1);
//		ll.addLast(2);
//		ll.addLast(1);
//		ll.add(2, 3);
		
		
//		ll.print();
//		ll.removeFirst();
//		ll.print();
//		
//		ll.removeLast();
//		ll.print();
//		System.out.println(ll.recSearch(3));
//		System.out.println(ll.recSearch(10));
//		System.out.println(ll.size);
		
//		ll.reverse();
//		ll.print();
		
//		ll.deleteNthFromEnd(3);
//		ll.print();
//		ll.print();
//		System.out.println(ll.pallindrome());
		
//		head = new Node(1);
//		Node temp = new Node(2);
//		head.next = temp;
//		head.next.next = new Node(3);
//		head.next.next.next = temp;
//		//1->2->3->->1
//		System.out.println(isCycle());
//		
//		removeCycle();
//	ll.print();
//		System.out.println();
		
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		
		ll.print();
		ll.zigzag();
		ll.print();
	}

}
