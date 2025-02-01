import java.util.*;

public class Main{    
	class Stack{    	
		int capacity;
        int top;
        int[] array;  
	}    
	Stack createStack(int capacity){    	
		Stack s = new Stack();
        s.capacity = capacity;
        s.array = new int[capacity];
        s.top = -1;
        return s;
	}
	
	static boolean isFull(Stack stack){    	
		return stack.top == stack.capacity - 1;
	}
	
	static boolean isEmpty(Stack stack){
		return stack.top == -1;
	}

    static void push(Stack stack, int item){    	
        if(isFull(stack)){
            return;
        }

        stack.top++;
        stack.array[stack.top] = item;
    }
    
    static int pop(Stack stack){
        if(isEmpty(stack)){
            return Integer.MIN_VALUE;
        }
        stack.top--;
        return stack.array[stack.top + 1];
    }
    
    // static void move_disc(Stack source, Stack destination, char s, char d){
    //     int p1= pop(source);
    //     int p2 = pop(destination);
    //     if (p1== Integer.MIN_VALUE){
    //         push(source, p2);
    //         System.out.println("Move the disk "+p2+ " from " +d+ " to "+s);
    //     }    
    //     else if (p2 == Integer.MIN_VALUE){    		
    //         push(destination, p1);
    //         System.out.println("Move the disk "+p1+ " from "+s+" to "+d);
    //     }
    //     else if (p1 > p2){
    //         push(source, p1);
    //         push(source, p2);
    //         System.out.println("Move the disk "+p2+" from "+d+" to "+s);    }
    //     else{
    //         push(destination, p2);
    //         push(destination, p1);
    //     System.out.println("Move the disk "+p1+ " from " +s+ " to "+d);
    //     }
    // }
        
    static void move_disc(Stack source, Stack destination, char s, char d){
        int p1 = pop(source);
        int p2 = pop(destination);

        if(p1 == Integer.MIN_VALUE){
            push(source, p2);
            System.out.println("Move disc " + p2 + " from " + d + " to " + s);
        }

        else if(p2 == Integer.MIN_VALUE){
            push(destination, p1);
            System.out.println("Move disc " + p1 + " from " + s + " to " + d);
        }

        else if(p1 > p2){
            push(source, p1);
            push(source, p2);
            //System.out.println("Move disc " + p1 + " from " + s + " to " + d);
            System.out.println("Move disc " + p2 + " from " + d + " to " + s);
        }

        else{
            push(destination, p2);
            push(destination, p1);
            System.out.println("Move disc " + p1 + " from " + s + " to " + d);
            //System.out.println("Move disc " + p2 + " from " + s + " to " + d);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_discs = sc.nextInt();
    
        Stack source, destination, auxillary;
        int total_num_of_moves = (int)Math.pow(2, num_of_discs) - 1;

        Main obj = new Main();
        source = obj.createStack(num_of_discs);
        destination = obj.createStack(num_of_discs);
        auxillary = obj.createStack(num_of_discs);

        for(int i = num_of_discs; i >= 1; i--){
            obj.push(source, i);
        }

        char s = 'S'; char d = 'D'; char a = 'A';

        if(num_of_discs % 2 == 0){
            char temp = d;
            d = a;
            a = temp;
        }

        for(int i = 1; i <= total_num_of_moves; i++){
            if(i % 3 == 1){
                obj.move_disc(source, destination, s, d);
            }
            if(i % 3 == 2){
                obj.move_disc(source, auxillary, s, a);
            }
            if(i % 3 == 0){
                obj.move_disc(auxillary, destination, a, d);
            }
        }

    }
}