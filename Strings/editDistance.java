import java.util.Scanner;

public class editDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int n=A.length();
        int m=B.length();
        int[][] t=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0){
                    t[i][j]=j;
                }
                if(j==0){
                    t[i][j]=i;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    t[i][j]=t[i-1][j-1];
                }
                else{
                    t[i][j]=1+Math.min(t[i-1][j-1],Math.min(t[i-1][j],t[i][j-1]));
                }
            }
        }
        
        System.out.println(t[n][m]);

        sc.close();
    }
}
