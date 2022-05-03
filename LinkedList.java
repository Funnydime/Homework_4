import java.util.*;
import java.util.Scanner;

public class Link{
	private int iData;
	private double dData;
	private Link next;
}

public Link(int id, double dd){
	iData = id;
	dData = dd;
}

public class LinkedList{
	private Link head;
	public LinkedList(){
		head = null;
	}
	public void insertFirst(int id, double dd){
		Link newLink = new Link(id,dd);
		newLink.next = head;
		head = newLink;
		}
	}

	public  void insertAfter(int id, double dd){
		Link newLink = new Link(id,dd);
		newLink.next = head;
	}

	public find(int item){
		Link current = head;
		while (current.iData != item)}{
			if(current.next == null){
				return null;
			}
			else{
				current = current.next;	
			}
		}
		return current;
	}

	public void deleteLast(){
		Link current = head;
		while (current.next != null){
			current = current.next;
		}
	}

	public void displayLink(){
		System.out.print("{" + iData + "," + dData + "}";)
	}

	public void displayList(){
		Link current = head;

		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}

	public boolean isEmpty(){
		return (head == null);
	}
	

	public main method (Strg Args[]){
	}
}
