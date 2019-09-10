package com.doubleLinkedList;

public class DoubleLinkedList {
	
	Node head;
	Node tail;
	
	
// adds an elements to the list	
	public void add(int data) {
		
		Node n = new Node(data);
		
		Node temp =head;
		
		if(head ==null) {
			
			n.previous = null;
			
			head =n;
			
			tail = head;
			
		}
		else {
			
			tail.next =n;
			
			n.previous = tail;
			
			tail = tail.next;
		}
		
	}
	// prints all elements of the list
	
	public void printElements() {
		
		if(head == null) return;
		
		Node temp = head;
		
		while(temp!=null) {
			
			System.out.println(temp.data);
			
			temp = temp.next;
		}
		
		
		
	}
	
	//removes an element for the list
	
	public void remove() {
		
		if(head == null) return;
		
		Node temp = head;
		
       if(head.next == null) {
			
			head = null;
		}
		
		else {
		
		while(temp.next.next!=null) {
			
			temp = temp.next;
		}
		
		tail = temp;
		
		temp.next.previous = null;
				
		temp.next = null;
		
		
		
	}
	}
	
	public static void main(String args[]) {
		
		DoubleLinkedList list = new DoubleLinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove();
		list.add(5);
		list.printElements();
		
	}

}
