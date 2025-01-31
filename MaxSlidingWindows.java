import java.util.*;

public class MaxSlidingWindows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] input_vals = sc.nextLine().split(" ");

        int nums[] = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(input_vals[i]);
        }

        int window_max_sum = 0;
        int window_sum = 0;

        for(int i = 0; i < k; i++){
            window_sum +=  nums[i];
        }

        window_max_sum = window_sum;

        for(int i = 1; i < n - k + 1; i++){
            //System.out.println(window_max_sum);
            window_sum = window_sum - nums[i - 1] + nums[i + k - 1];
            window_max_sum = Math.max(window_max_sum, window_sum);
        }

        System.out.println(window_max_sum);
    }
}