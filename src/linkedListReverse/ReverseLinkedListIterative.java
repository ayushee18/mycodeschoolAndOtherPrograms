package linkedListReverse;

public class ReverseLinkedListIterative {
	
	public LinkedList.Node reverseLinkedListIterative(LinkedList.Node currentNode) {
		
		LinkedList.Node previousNode = null;
		LinkedList.Node nextNode;
		while(currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public static void main(String[] args) {
		ReverseLinkedListIterative reverseLinkedListIterative = new ReverseLinkedListIterative();
		LinkedList list = new LinkedList();
		LinkedList.Node head = new LinkedList.Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new LinkedList.Node(6));
		list.addToTheLast(new LinkedList.Node(7));
		list.addToTheLast(new LinkedList.Node(8));
		list.addToTheLast(new LinkedList.Node(9));
		System.out.println("Before reversing");
		list.printList(head);
		LinkedList.Node reverseHead = reverseLinkedListIterative.reverseLinkedListIterative(head);
		System.out.println();
		System.out.println("After Reversing");
		list.printList(reverseHead);
	}

}
