package linkedListReverse;

public class ReverseLinkedListRecursion {
	
	public LinkedList.Node recursiveReverse(LinkedList.Node head){
		if(head == null)
			return null;
		
		else if(head.next == null)
			return head;
		
		else {
			
			LinkedList.Node nextNode = head.next;
			head.next = null;
			LinkedList.Node rest = recursiveReverse(nextNode);
			nextNode.next = head;
			return rest;
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedListRecursion reverseLinkedListRecursion = new ReverseLinkedListRecursion();
		LinkedList list = new LinkedList();
		LinkedList.Node head = new LinkedList.Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new LinkedList.Node(6));
		list.addToTheLast(new LinkedList.Node(7));
		list.addToTheLast(new LinkedList.Node(8));
		list.addToTheLast(new LinkedList.Node(9));
		
		System.out.println("Before Reversing");
		list.printList(head);
		LinkedList.Node reverseList = reverseLinkedListRecursion.recursiveReverse(head);
		System.out.println();
		System.out.println("After Reversing");
		list.printList(reverseList);
	}

}
