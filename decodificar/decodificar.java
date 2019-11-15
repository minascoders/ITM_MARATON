import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;

public final class decodificar {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        String titular;
        String mensaje;
        for (int i = 0; i < q; i++) {
            titular = bf.readLine().toLowerCase().replaceAll("\\s+","");
            mensaje = bf.readLine().toLowerCase().replaceAll("\\s+","");

            String current = titular;

            String output = "";

            for (int j = 0; j < mensaje.length(); j++) {
                char c = mensaje.charAt(j);
                int index = current.indexOf(c);
                if(index == -1){
                    output = "NO\n";
                    break;
                }else {
                    current = current.substring(index);
                }
            }

            if(output.equals("")){
                output = "SI\n";
            }
            sb.append(output);
        }
        System.out.print(sb);
    }
}