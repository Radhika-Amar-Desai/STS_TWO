import java.util.*;

class Stack_ {
    Stack s = new Stack<Integer>();
    Stack min_s = new Stack<Integer>();

    public void push(int val){
        this.s.push(val);
        if( !this.min_s.isEmpty() && (int)this.min_s.peek() > val){
            this.min_s.push(val);
        }

        if(this.min_s.isEmpty()) {
            this.min_s.push(val);
        }
    }

    public boolean isEmpty() {
        return this.s.isEmpty();
    }

    public int pop(){
        return (int)this.s.pop();
    }

    public int min() {
        return (int)this.min_s.peek();
    }

    public int peek(){
        return (int)this.s.peek();
    }

}

public class MinStack {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Stack_ s = new Stack_();

        for(int i = 0; i < n; i++){
            s.push(sc.nextInt());
        }

        System.out.println(s.min());
    }
}
