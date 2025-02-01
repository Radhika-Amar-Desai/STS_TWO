import java.util.*;

class Stack {
    int array[];
    int top;
    int capacity;

    public void InitializeStack(int capacity){
        this.capacity = capacity;
        this.top = -1;
        this.array = new int[capacity];
    }

    public boolean isFull(){
        return this.top == this.capacity - 1;
    }

    public void push( int item){
        if (this.isFull()) {
            return;
        }
        this.top++;
        this.array[this.top] = item;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public int pop(){
        if (this.isEmpty()){
            return -1;
        }
        this.top--;
        return this.array[this.top + 1];
    }
}

public class TOH {
    public static void move_disc(Stack source, Stack destination, char s, char d){
        int p1 = source.pop();
        int p2 = destination.pop();

        if(p1 == -1){
            source.push(p2);
            System.out.println("Move disc " + p2 + " from " + d + " to " + s);
        }
        else if(p2 == -1){
            destination.push(p1);
            System.out.println("Move disc " + p1 + " from " + s + " to " + d);
        }
        else if(p1 > p2){
            source.push(p1);
            source.push(p2);
            System.out.println("Move disc " + p2 + " from " + d + " to " + s);
        }
        else{
            destination.push(p2);
            destination.push(p1);
            System.out.println("Move disc " + p1 + " from " + s + " to " + d);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_of_discs = sc.nextInt();

        Stack source = new Stack();
        Stack destination = new Stack();
        Stack aux = new Stack();

        source.InitializeStack(num_of_discs);
        destination.InitializeStack(num_of_discs);
        aux.InitializeStack(num_of_discs);

        for(int i = num_of_discs; i >= 1; i--){
            source.push(i);
        }

        char s = 'S'; char a = 'A'; char d = 'D';

        if(num_of_discs % 2 == 0){
            char temp = d;
            d = a;
            a = temp;
        }

        for(int i = 1; i <= Math.pow(2, num_of_discs) - 1; i++ ){
            if(i % 3 == 1){
                move_disc(source, destination, s, d);
            }
            if(i % 3 == 2){
                move_disc(source, aux, s, a);
            }
            if(i % 3 == 0){
                move_disc(aux, destination, a, d);
            }
        }
    }
}
