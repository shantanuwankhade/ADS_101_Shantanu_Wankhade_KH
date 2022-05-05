class LinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	void append(int ndata){
		Node new_node= new Node(ndata);
		Node n=head;
		if(head==null){
			new_node.prev=null;
			head = new_node;
			return;
		}
		while(n.next!=null){
			n=n.next;
		}
		n.next = new_node;
		new_node.prev = n;
	}
	
	void display(){
		Node n=head;
		Node p=null;
		while(n!=null){
			p=n;                  //
			n=n.next;
		}
		
		while(p!=null){
			System.out.println(p.data);
			p=p.prev;
		}
	}
	
	public static void main(String args[]){
		LinkedList L = new LinkedList();
		L.append(1);
		L.append(2);
		L.append(3);
		L.append(4);
		L.append(5);
		L.display();
	}
}