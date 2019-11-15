import java.io.InputStreamReader;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;

public final class magicos {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = bf.readLine()) != null) System.out.println(isPD(input) ? "POLIDIVISIBLE" : "NO POLIDIVISIBLE");
    }

    static boolean isPD(String rawValue) {
        int size = rawValue.length();
        long value = Long.parseLong(rawValue);
        if(size == 1) return true;
        else if(value % size == 0) return isPD(rawValue.substring(0, size - 1));
        else return false;
    }
}