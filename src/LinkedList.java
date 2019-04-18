
public class LinkedList {
 Node head;
	public void insert(int val){
		Node node = new Node();
		node.data = val;
		node.next = null;
				if(head == null)
					head=node;
				else
				{
					Node n=head;
					while(n.next!=null)
					{
						n = n.next;
					}
					n.next= node;
				}
	}
	public void insertAt(int val,int j) {
		Node n = head;
		
		Node insert = new Node();
		insert.data=val;
		insert.next=null;
		
		int i=1;
		while(i<=j) 
		{
			if(i==j)
			{
				Node dup = new Node();
				dup.data = n.data;
				dup.next=n.next;
				
				n.data = insert.data;
				n.next = dup;
				//insert.next= dup;
				break;
			}
			n=n.next;
			i++;
			
		}
		
		
	}
	public void insertAtStart(int val)
	{
		Node first = new Node();
		first.data=val;
		first.next = head;
		head = first;
	}
	
	public void show() {
		Node n = head;
		while(n.next!=null)
		{
			System.out.println("Val ="+ n.data);
			n=n.next;
		}
		System.out.println("Val ="+ n.data);
	}
}
