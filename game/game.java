import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;

public final class game {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();

        while(!(input = bf.readLine()).equals("0")){
            int n = Integer.parseInt(input);
            int div = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if(n%i == 0){
                    if(n/i == i) div++;
                    else div+=2;
                }
            }
            System.out.println(div);
        }
        System.out.print(sb.toString());
    }
}