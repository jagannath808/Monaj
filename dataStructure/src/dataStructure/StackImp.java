package dataStructure;

import java.util.Scanner;

class Stack {
	
	int  arr[];
	int size;
	int top=-1;
	public Stack(int Asize) {
		arr=new int[Asize];
		size=Asize;
	}
	/*...........................................................................................*/
	public void push(int n) {
		if(! isFull()){	
			arr[++top]=n;
			System.out.println("Insert Element  " + n + "  Successfull");
		}else{	
		System.out.println(n +" is not inserted.......Stack is Full......");
		}
	}	
	/*...........................................................................................*/
	public void pop() {
		if(!isEmpty()){
			
			System.out.println("Remove Element  "+arr[top]);
			top--;
		}else{
			System.out.println("........Stack is Empty........");	}		
	}
	/*...........................................................................................*/
	 boolean isFull() {
		if(size==top+1){
			return true;
		}
		return false;
	}
		/*...........................................................................................*/
	 boolean isEmpty(){
		 if(top==-1){
			 return true;
		 }else {
			return false;
		}
	 }
		/*...........................................................................................*/
	int peek(){
		if(top<0){
			return -1;
		}else{
		return arr[top];
		}
	}
	/*...........................................................................................*/
int top(){
	return 	top;
}

}

/*...........................................................................................*/

 public class StackImp{
	 
	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter stack Size");
		int n=sc.nextInt();
		Stack st= new Stack(n);
		String s;
		
		do{
		System.out.println("Enter your Choice \n 1.Push() \n 2.Pop() \n 3.Peek()");
		int ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("............Push() Opration........\n");
					System.out.println("Enetr Element");
						int ele = sc.nextInt();
							st.push(ele);
				break;
			case 2:
				System.out.println("............Pop Opration........\n");
					st.pop();
				break;
			case 3:
				System.out.println("............Peek() Opration........\n");
					System.out.println(st.peek());
				break;

			default:
				System.out.println("Enter worng Choice");
				break;
			}
			System.out.println("Enter Your Choice ....Continue For 'C' and Any Key for 'E'");
			s=sc.next();
		
	}while(s.equalsIgnoreCase("c"));
}	 
 }