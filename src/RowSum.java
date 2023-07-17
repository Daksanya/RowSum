import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int array[][]=new int[n][m];
        int sum;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                array[i][j]=scanner.nextInt();
            }

        }

        for (int i=0;i<n;i++){
            sum=0;
            for (int j=0;j<m;j++){
                sum+=array[i][j];
            }
            System.out.println(sum);
        }
    }
}
