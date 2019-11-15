import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.DecimalFormat;

public final class notas {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("##.00");
        df.setRoundingMode(RoundingMode.UP);
        for (int i = 0; i < q; i++) {
            String input = bf.readLine();
            int size = input.length();
            double prom = 0;
            int notas = 0;
            int j = 0;
            while(j < size) {
                int nota = Character.getNumericValue(input.charAt(j));
                if(nota == 1 && j < size - 1){
                    int next = Character.getNumericValue(input.charAt(j + 1));
                    if(next == 0){
                        nota = 10;
                        j++;
                    }
                }
                prom += nota;
                if(nota != 0) notas++;
                j++;
            }
            prom = prom/notas;
            sb.append(String.format("%.2f\n", prom));
            // sb.append(df.format(prom));
            // sb.append("\n");
        }
        System.out.print(sb);
    }
}