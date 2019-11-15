import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;

public final class candado {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        HashMap<String,Integer> map = new HashMap<>();
        map.put("0", 0);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("A", 10);
        map.put("B", 11);
        map.put("C", 12);
        map.put("D", 13);
        map.put("E", 14);
        map.put("F", 15);

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(0, "0");
        map2.put(1, "1");
        map2.put(2, "2");
        map2.put(3, "3");
        map2.put(4, "4");
        map2.put(5, "5");
        map2.put(6, "6");
        map2.put(7, "7");
        map2.put(8, "8");
        map2.put(9, "9");
        map2.put(10, "A");
        map2.put(11, "B");
        map2.put(12, "C");
        map2.put(13, "D");
        map2.put(14, "E");
        map2.put(15, "F");


        for (int i = 0; i < q; i++) {
            String[] a = bf.readLine().split(" ");
            String[] b = bf.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int dif = map.get(a[j]) - map.get(b[j]);
                if(dif <= 8){

                } else {

                }
            }

           
        System.out.print(sb);
    }
}