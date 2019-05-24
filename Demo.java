class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}	
}
class Stack{
	Node top;
	public void push(int data){
		Node node=new Node(data);
		node.next=top;
		top=node;
	}
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public int size(){
		int count=0;
		Node temp=top;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	public void clear(){
		top=null;
	}
	public void printStack(){
		Node temp=top;
		System.out.print("[");
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println("\b\b]");
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.printStack();
		System.out.println("Size of the stack : "+s1.size());
		
		s1.pop();
		s1.printStack();
		System.out.println("Size of the stack : "+s1.size());
		
		s1.clear();
		System.out.println("Size of the stack : "+s1.size());
		
	}
}
