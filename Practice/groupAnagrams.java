import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class groupAnagrams {

    static void printAnagrams(String[] arr){

        HashMap<String ,List<String>> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){

            // Convert every word to char, sort and then re-convert to string
            char[] letters = arr[i].toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            // Calculate the hascode of string after sorting
            if(map.containsKey(newWord)){
                map.get(newWord).add(arr[i]);
            }else{
                List<String> words = new ArrayList<>();
                words.add(arr[i]);
                map.put(newWord ,words);
            }
        }

        // values having size> 1 are anagrams and size < 1 are non-anagrams
        for(String s : map.keySet()){
            List<String> values = map.get(s);
            if(values.size() > 1){
                System.out.println(values);
            } 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of words :");
        int n = sc.nextInt();

        String arr[] = new String[n];
        for(int i = 0; i<n ;i++){
            arr[i] = sc.next();
        }

        printAnagrams(arr);
        sc.close();
    }
}
