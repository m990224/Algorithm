import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        Set<String> set = new HashSet<>();
        int ans = 0;

        for(int i=0; i<N; i++){
            String str = scanner.nextLine();
            if(str.equals("ENTER")){
                ans += set.size();
                set.clear();
            }
            else{
                set.add(str);
            }
        }
        System.out.println(ans + set.size());
    }
}