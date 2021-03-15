public class StackAsLinkedList { 
  
    StackNode root; 
    int length;
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
	    this.data = data;
        }
	
	public StackNode getNext(){
	     return next;
	}
	    
	public void setNext(StackNode data){
	    next = data;
	}
	
	public int getData(){
	    return data;
	}
	
	public int setData(int data){
	    this.data = data;
	}
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
	 return (length == 0);  
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
	StackNode newval = new StackNode(data);
	newwal.setNext(root);
	root = newval;
	length++;    
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if(isEmpty()){
	    return 0;
	}
	StackNode popval = root;
	root = root.next;
	length--;
	return root.val;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
	if(isEmpty()){
	    System.out.println("notEmpty");
	}
	   return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
