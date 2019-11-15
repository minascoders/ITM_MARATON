import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;

public final class inventario {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        map.put("0", "EEUU");
        map.put("50", "Inglaterra");
        map.put("380", "Bulgaria");
        map.put("539", "Irlanda");
        map.put("560", "Portugal");
        map.put("70", "Noruega");
        map.put("759", "Venezuela");
        map.put("850", "Cuba");
        map.put("890", "India");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();
        while(!(input = bf.readLine()).equals("0")){
            int size = input.length();
            int sum = 0;
            int v = Character.getNumericValue(input.charAt(size - 1));
            for(int i = 0; i < size - 1; i++){
                if (i % 2 == 0){
                    sum += Character.getNumericValue(input.charAt(size - 2 - i)) * 3;
                } else { 
                    sum += Character.getNumericValue(input.charAt(size - 2 - i));
                }
            }
            
            if((sum + v) % 10 == 0){
                String country = "";
                if(size == 13){
                    country = map.get(input.substring(0,1));
                    if(country == null) country = map.get(input.substring(0,2));
                    if(country == null) country = map.get(input.substring(0,3));
                    if(country == null) country = "Desconocido";
                }
                sb.append("SI");
                if(size == 13){
                    sb.append(" ");
                    sb.append(country);
                }
            } else sb.append("NO");
            sb.append("\n");

        }
        System.out.print(sb.toString());
    }
}