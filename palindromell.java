package assignments;

import java.util.Scanner;

public class palindromeLL {
	Node head;
	public static class Node{
		int data;
		Node next;
		Node(int d) {
			data=d;
			next=null;
		}
	}
	public static palindromeLL insert(palindromeLL li,int d) {
		Node newNode=new Node(d);
		if(li.head==null) {
			li.head=newNode;
		}
		else {
			Node temp=li.head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;

		}
		return li;
	}
	public static void checkp(palindromeLL li) {
		int a=0;
		int b=0;
		int c=1;
		Node temp=li.head;
		while(temp!=null) {
			a=a*10+temp.data;
			b=b+temp.data*c;
			c=c*10;
			temp=temp.next;
		}
		if(a==b) {
			System.out.println("List is Palindrome");
		}
		else {
			System.out.println("List is not Palindrome");
		}
	}
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		palindromeLL li=new palindromeLL();
		System.out.println("Enter the Size of list");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			int d=sc.nextInt();
			insert(li,d);
		}
		checkp(li);
	}
}
