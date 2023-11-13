import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input full name =");
        String _p = reader.readLine();
        final int s_ = _p.length();
        int u = 0;
        if (s_ % 3 == 1) {
            u = s_ * 4;
        } else if (s_ % 4 == 2) {
            u = s_ * 5;
            for (int p = 0; p < _p.length(); p++) ;
            System.out.println("Selamat mengerjakan");

        }

        if (s_ % 2 == 0 && _p.length() > 10) {
            System.out.println(_p + "Semoga lulus");

        }
    }
}


