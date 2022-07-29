import java.util.ArrayList;
import java.util.Scanner;

public class JustifiedText {

    static ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        ArrayList<String> lines = new ArrayList<>();

        int index = 0;
        while (index < A.size()) {
            int count = A.get(index).length();
            int last = index + 1;
            while (last < A.size()) {
                if (A.get(last).length() + count + 1 > B) break;
                count += A.get(last).length() + 1;
                last++;
            }

            StringBuilder builder = new StringBuilder("");
            int diff = last - index - 1;
            if (last == A.size() || diff == 0) {
                for (int i = index; i < last; i++) {
                    builder.append(A.get(i)).append(" ");
                }
                builder.deleteCharAt(builder.length() - 1);
                for (int i = builder.length(); i < B; i++) {
                    builder.append(" ");
                }
            } else {
                int spaces = (B - count) / diff;
                int r = (B - count) % diff;
                for (int i = index; i < last; i++) {
                    builder.append(A.get(i));
                    if (i < last - 1) {
                        for (int j = 0; j <= spaces + (i - index < r ? 1 : 0); j++) {
                            builder.append(" ");
                        }
                    }
                }
            }
            lines.add(builder.toString());
            index = last;
        }
        return lines;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> A= new ArrayList<>();
        for(int i = 0; i < n; i++) {
            A.add(sc.next());
        }
        int B = sc.nextInt();

        System.out.println(fullJustify(A, B));

        sc.close();
    }
}
