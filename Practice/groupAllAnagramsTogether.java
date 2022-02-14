import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class groupAllAnagramsTogether {

    static final int NumOfChars = 26;
    
    static class TrieNode{
        boolean isEnd;

        TrieNode child[] = new TrieNode[NumOfChars];

        LinkedList<Integer> head;

        // constructor
        public TrieNode(){
            isEnd = false;
            head = new LinkedList<>();
            for(int i = 0; i<NumOfChars; i++){
                child[i] = null;
            }
        }
    }

    static TrieNode insert(TrieNode root, String word, int index, int i){
        if(root == null) root = new TrieNode();

        if(i < word.length()){
            int index1 = word.charAt(i) - 'a';
            root.child[index1] = insert(root.child[index1], word, index, i+1);
        } else{          // If end of the word reached
            // Insert index of this word to end of index linked list
            if(root.isEnd == true) root.head.add(index);

            else {
                root.isEnd = true;
                root.head.add(index);
            }
        }

        return root;
    }

    static void printAnagrams(TrieNode root, String[] words){
        
        if(root == null) return;

        // If a lead node is reached, print all anagrams using the indexes stored in index linked list
        if(root.isEnd){
            // traverse the list
            for(Integer pCrawl: root.head)
                System.out.println(words[pCrawl]);
        }

        for (int i = 0; i < NumOfChars; ++i)
            printAnagrams(root.child[i], words);
    }
    
    // The main function that prints all anagrams together. wordArr[] is input sequence of words.
    static void Anagrams(String[] words){
        TrieNode root = null;

        for(int i= 0; i<words.length; i++){

            char[] buffer = words[i].toCharArray();

            Arrays.sort(buffer);

            root = insert(root, new String(buffer), i, 0);
        }

        printAnagrams(root, words);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of words :");
        int n = sc.nextInt();

        String words[] = new String[n];
        for(int i = 0; i<n ;i++){
            words[i] = sc.next();
        }

        Anagrams( words);

        sc.close();
    }
}
