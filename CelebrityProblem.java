import java.util.*;

public class CelebrityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.next();
        }

        for (int i = 0; i < n; i++){
            String s = input[i];
            for(int j = 0; j < n; j++){
                mat[i][j] = s.charAt(j) - '0';
            }
        }

        for(int i = 0; i < n; i++){
            int target_sum = 0;
            for(int j = 0; j < n; j++){
                target_sum += mat[j][i];
            }

            if ( target_sum == n - 1 ){
                System.out.println(i);
                break;
            }
        }
    }    
}