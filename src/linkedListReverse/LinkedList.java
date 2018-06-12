package linkedListReverse;

public class LinkedList{
	 
private Node head;
	
	static class Node{
		private int value;
		Node next;
		Node(int value){
			this.value = value;
		}
		
		public int getValue() {
			return this.value;
		}
	}
 
	public void addToTheLast(Node node) {
		if(head == null)
			head = node;
		else {
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			
			temp.next = node;
		}
	}
 
 
	public void printList(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
	}
 
}