import java.util.*;

public class LoopDetection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] nodes_val = new int[n];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            nodes_val[i] = sc.nextInt();
        }

        int i = 0;

        for(i = 0; i < n; i++){

            if(map.containsKey(nodes_val[i])){
                System.out.println("Loop detected");
                break;
            }

            map.put(nodes_val[i], nodes_val[i]);
        }
        
        if( i == n){
            System.out.println("Loop not detected");
        }
    }
}