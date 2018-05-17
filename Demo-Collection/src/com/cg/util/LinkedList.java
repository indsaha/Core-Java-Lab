package com.cg.util;

public class LinkedList {

	// TODO Create an inner class Node

	class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

	}

//	TODO Inside LinkedList class, add a member variable which points to first Node
	private Node head, last;

	public boolean add(int data){
		
//		TODO	Create a new Node and set the data
		Node nn = this.new Node(data);
		
//		TODO Check if LinkedList is empty
		
		if(head == null){
			head = last = nn;
		}else{
			last.next = nn;
			last = nn;
		}
		
		return true;
	}

//	TODO	Add a method to display a list

	public void display(){
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
			
		
	}
	







}
