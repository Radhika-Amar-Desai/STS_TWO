import java.util.*;

public class StackPermutations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int s1[] = new int[n];
        int s2[] = new int[m];

        sc.nextLine();
        String[] input_val_one = sc.nextLine().split(" "); 
        // sc.nextLine();
        String[] input_val_two = sc.nextLine().split(" ");

        if(n != m){
            System.out.println("Invalid");
        }

        else{

        for(int i = 0; i < n; i++){
            s1[i] = Integer.parseInt(input_val_one[i]);
        }

        for(int i = 0; i < m; i++){
            s2[i] = Integer.parseInt(input_val_two[i]);
        }

        Stack s = new Stack<Integer>();
        int j = 0;

        for(int i = 0; i < n; i++){
            s.push(s1[i]);
            while(!s.isEmpty() && (int)s.peek() == s2[j]) {
                s.pop();
                j++;
            }
        }
        
        if(s.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }

        }

    }
}
