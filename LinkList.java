import java.util.*;

public class LinkList{
	private Link head;
	
	public LinkList(){
		head = null;
	}

	public void insertFirst(int id, double dd){
		Link newLink = new Link(id,dd);
		newLink.next = head;
		head = newLink;
		}

	public void insertAfter(int item, int id, double dd){
		if(head == null){
			System.out.println("Cannot");
			return;
		}
		head = find(item);
		Link newlink = new Link(id,dd);
		newlink.next = head.next;
		head.next = newlink;
	}

	public Link find(int item){
		Link current = head;
		while (current.iData != item){

			if(current.next == null){
				return null;
			}

			else{
				current = current.next;	
			}
		}
		return head;
	}

	public Link deleteLast(){
		if(head == null || head.next == null){
			return null;
		}

		Link temp = head;
		while(temp.next.next != null){
			temp = temp.next;
		}
		Link last = temp;
		temp.next = null;
		return last;
	}

	public void displayLink(int iData, double dData){
		System.out.print("{" + iData + "," + dData + "}");
	}

	public void displayList(){
		Link current = head;

		while(current != null){
			displayLink(current.iData, current.dData);
			current = current.next;
		}
	}

	public boolean isEmpty(){
		return (head == null);
	}
	

	public static void main (String[] args){
		LinkList theList = new LinkList();
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Input the number of Links");
		int numOfLinks = keyboard.nextInt();

		int i = 0, num1, key;
		double num2;
		while (i < numOfLinks){
			System.out.println("Enter the first vailue of the new link: ");
			num1 = keyboard.nextInt();

			System.out.println("Enter the second vailue of the new link: ");
			num2 = keyboard.nextDouble();

			theList.insertFirst(num1,num2);
			i++;
		}
		theList.displayList();
		System.out.println("");

		System.out.println("---------------------------");
		System.out.println("Enter the link you want to find:");
		key = keyboard.nextInt();
		Link f = theList.find(key);
		if(f != null){
			System.out.println("Found link with key " + f.iData + " and value " + f.dData);
		}
		else{
			System.out.println("Can't find link");
		}
		System.out.println("--------------------------");
		if(!theList.isEmpty()){
			System.out.println("Delete the last link:");
			Link d = theList.deleteLast();
			if(d != null){
				System.out.println("Deleted link with key " + d.iData);
			}

			else{
				System.out.println("Can't delete link");
			}
			theList.displayList();
			System.out.println("");
		}
		System.out.println("--------------------------");
		System.out.println("Enter the link you want to insert a new link after:");
		key = keyboard.nextInt();
		System.out.println("Enter the first value of the new link: ");
		num1 = keyboard.nextInt();
		System.out.println("Enter the second value of the new link: ");
		num2 = keyboard.nextDouble();

		theList.insertAfter(key, num1, num2);
		theList.displayList();
	}
}