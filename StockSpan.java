import java.util.*;

public class StockSpan {
    public static void main(String[] args){

        Stack mono_stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prices[] = new int[n];
        int span[] = new int[n];
        
        sc.nextLine();
        String input_values = sc.nextLine();
    
        int index = 0;

        for(String val: input_values.split(" ")){
            prices[index] = Integer.parseInt(val);
            index ++;
        }

        for(int i = 0; i < n; i++){
            while (!mono_stack.isEmpty() && prices[(int)mono_stack.peek()] <= prices[i]){
                mono_stack.pop();
            }

            span[i] = mono_stack.isEmpty() ? (i + 1) : (i - (int)mono_stack.peek());
            mono_stack.push(i);
        }

        for(int i = 0; i < n; i++){
            System.out.print(String.valueOf(span[i]) + " ");
        }
    }
}