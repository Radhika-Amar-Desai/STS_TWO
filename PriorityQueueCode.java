import java.util.*;

public class PriorityQueueCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String input_values_str[] = sc.nextLine().split(" ");

        int input_values[] = new int[n];
        
        for(int i = 0; i < n; i++){
            input_values[i] = Integer.parseInt(input_values_str[i]);
        }


        PriorityQueue pq = new PriorityQueue<Integer>((a, b) -> b - a);

        for(int input_val: input_values) {
            pq.add(input_val);
        }

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());

    }
}