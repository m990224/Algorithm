import java.util.Scanner;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] Arr = new int[N];

        for(int i=0; i<N; i++){
            Arr[i] = scanner.nextInt();
        }
        Arrays.sort(Arr);
        int M = scanner.nextInt();
        for(int i=0; i<M; i++){
            System.out.println(binarySearch(Arr,scanner.nextInt()));
        }
    }

    public static int binarySearch(int[] arr, int num){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2 ;
            if(num == arr[mid]){
                return 1;
            }
            else if(num < arr[mid]){
                right = mid -1;
            }
            else{
                left = mid +1 ;
            }
        }
        return 0;
    }
}
