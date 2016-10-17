public class ArrayStack { 
	
        private int size; 
        private String[] Stacks; 
        private int top=0; 
        
        public ArrayStack (int size){ 
        	
                Stacks = new String[size]; 
                System.out.println("Current stack size: " + size+"\n"); 
		        this.size = size;
		} 
        
        public void push(String stringValues){ 
        System.out.println("Trying to push on stack[" + top + "]...");
           if (!is_full()){ 
				Stacks[top]=stringValues; 
			    System.out.println( stringValues +" was successfully added.\n" );
				    this.top++; 
			} else {
				System.out.println("STORAGE IS FULL! ADD FAILED.\n"); 
			}
           
        }
        
    	public void showStack(){
    	
			for (int i = size-1; i >= 0;i--){
				System.out.println("stack["+i+"] = " + Stacks[i]);
			}
			
			System.out.println();
    	}
        
        public boolean is_full(){ 
                return (size==top);
        }
        
        public boolean is_empty(){
                return (top == 0);
        }
        
        public int pop(){ 
        	
			if(!is_empty()){ 
	                
		        String stringValues = Stacks[--top]; 
	            System.out.println("Trying to pop stack[" + top + "]...\n"+stringValues +" was successfully removed.\n"); 
	            Stacks[top] = null; 
	            return 0; 
	
			} 
				System.out.println("Trying to pop stack[" + top +"]...");
                System.out.println("STORAGE IS EMPTY! REMOVED FAILED.\n");
                return 0;

        }
        
        public void peek() {
    	    if (!is_empty()) {
    	      System.out.println("PEEK TOP = " + Stacks[top]);
    	      System.out.println();
    	    }
    	  }

        public static void main(String [] args){ 

                ArrayStack implement = new ArrayStack(10);
                
                implement.showStack();
                implement.push("Alfa"); 
                implement.push("Bravo"); 
                implement.push("Charlie");
                implement.push("Delta"); 
                implement.push("Echo"); 
                implement.push("Foxtrot");
                implement.push("Golf");
                implement.push("Hotel");
                implement.push("India");
                implement.push("Juliett");
                implement.showStack();
                implement.push("Kilo");
                implement.pop();
                implement.peek();
                implement.pop();
                implement.pop();
                implement.pop();
                implement.pop();
                implement.pop();
                implement.pop();
                implement.pop();
                implement.pop();
                implement.pop();
                implement.pop();
                implement.showStack();
                implement.pop();
                
        } 
} 
