import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;

public final class emperador {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();
        while(!(input = bf.readLine()).equals("0")){
            int size = Integer.parseInt(input);
            String[] values = bf.readLine().split(" ");

            int comb = 0;
            for (int i = 0; i < (size - 1); i++) {
                int valuei = Integer.parseInt(values[i]);
                for (int j = i + 1; j < values.length; j++) {
                    int valuej = Integer.parseInt(values[j]);
                    comb += valuei * valuej;
                }
            }
            sb.append(String.format("%d\n", comb));
        }
        System.out.print(sb.toString());
    }
}