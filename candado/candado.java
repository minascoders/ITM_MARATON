import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public final class candado {
    public static void main(String[] args) throws IOException {
        String road;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line; i++) {
            String[] a = bf.readLine().split(" ");
            String[] b = bf.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                StringBuilder sb2 = new StringBuilder();
                int destino = Integer.parseInt(b[j].toLowerCase(), 16);
                int partida = Integer.parseInt(a[j].toLowerCase(), 16);

                int dif = destino - partida;

                partida = dif >= 8 || (dif >= -8 && dif < 0) ? destino : partida;

                int steps = dif >= -8 && dif <= 8 ? Math.abs(dif) : 16 - Math.abs(dif);

                for (int index = partida; index <= partida + steps; index++) {
                    sb2.append(Integer.toHexString(index % 16));
                }

                road = dif >= 8 || (dif >= -8 && dif < 0)
                        ? sb2.reverse().toString().toUpperCase()
                        : sb2.toString().toUpperCase();

                sb.append(road).append("\n");
            }
        }
        System.out.print(sb);
    }
}