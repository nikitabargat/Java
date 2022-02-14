import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class orderOfPeopleHeigths {
    
    static ArrayList<Integer> order(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i=0; i<A.size(); i++){
            results.add(-1);
        }
        
        //using TreeMap to sort the key by ascending order
        TreeMap<Integer, Integer> sortedHeights = new TreeMap<Integer, Integer>();
        for(int i=0; i<A.size(); i++){
            sortedHeights.put(A.get(i), B.get(i));
        }
        
        for(int height : sortedHeights.keySet()){
            int inFront = sortedHeights.get(height);
            int pos = 0;
            int i = 0;
            while(inFront > pos || results.get(i) != -1){
                if(results.get(i) == -1 || results.get(i) > height){
                    pos++;
                }
                i++;
            }
            results.set(i, height);
        }
        
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        ArrayList<Integer> A = new ArrayList<>();
        for(int i = 0; i<n; i++){
            A.add(sc.nextInt());
        }

        ArrayList<Integer> B = new ArrayList<>();
        for(int i = 0; i<n; i++){
            B.add(sc.nextInt());
        }

        System.out.println(order(A, B));
        sc.close();
    }
}
