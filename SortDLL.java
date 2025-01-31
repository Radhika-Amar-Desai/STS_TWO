import java.util.*;

public class SortDLL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> l = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            l.add(sc.nextInt());
        }

        Collections.sort(l);

        for(int index = 0; index < l.size() - 1; index ++){
            System.out.print(Integer.toString(l.get(index)) + " ");
        }

        System.out.print(Integer.toString(l.get(l.size() - 1)));
    }
}