import java.util.*;

public class SegregateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> l = new ArrayList<Integer>();

        List<Integer> even_l = new ArrayList<Integer>();
        List<Integer> odd_l = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            l.add(sc.nextInt());
        }

        for(int num: l){
            if(num % 2 == 0){
                even_l.add(num);
            }
            else {
                odd_l.add(num);
            }
        }

        for(int num: even_l) {
            System.out.print(Integer.toString(num) + " ");
        }

        for(int num : odd_l){
            System.out.print(Integer.toString(num) + " ");
        }
    }
}