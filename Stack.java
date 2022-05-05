class Stack{
	
	int arr[];
	int len;
	//int max;
	int top1;
	int top2;
	
	Stack(int l){
		len=l;
		arr = new int[l];
		//max = arr.length();
		top1= -1;
		top2= (len-1);
	}
	
	boolean isEmpty(){
		return(top== -1);
	}
	
	boolean isFull(){
		return(top>=(len-1));
	}
	
	
	
	void push1(int x){
		if(isFull){
			System.out.println("Stack overflow");
		}
		arr[top1--]=x;
	}
	
	
	void push2(int x){
		if(isFull){
			System.out.println("Stack overflow");
		}
		arr[top2++]=x;
	}
	
	
	
	void pop1(){
		if(isEmpty){
			System.out.println("Stack Underflow");
		}
			arr[top1--];
		}
		
	void pop2(){
	if(isEmpty){
     		System.out.println("Stack Underflow");
		}
			arr[top2--];
		}
		
		
		
	public static void main(String args[]){
		Stack S = new Stack();
		S.push1(5);
		S.push2(10);
		S.push2(15);
		S.push1(11);
		S.push2(7);
		S.push2(40);
		
		System.out.println("Popped element from stack1 is"+S.pop1());
		System.out.println("Popped element from stack2 is"+S.pop2());
	}
	
	
	
	
}