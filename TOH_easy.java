
public class TOH_easy {
    static void towerOfHanoi(int num_of_discs, char from_rod, char to_rod, char aux_rod){
        if(num_of_discs == 0){
            return;
        }
        towerOfHanoi(num_of_discs - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disc " + num_of_discs + " from " + from_rod + " to " + to_rod);
        towerOfHanoi(num_of_discs - 1, aux_rod, to_rod, from_rod);
    }

    // Driver code
    public static void main(String args[])
    {
        int N = 3;

        // A, B and C are names of rods
        towerOfHanoi(N, 'S', 'D', 'A');
    }
}
