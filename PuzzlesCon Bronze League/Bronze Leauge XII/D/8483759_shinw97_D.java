
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lim
 */
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            System.out.println("f91(" + n + ") = " + f91(n));
            n = Integer.parseInt(br.readLine());
        }
    }

    public static int f91(int N) {
        if (N > 100) {
            return N - 10;
        } else {
            return f91(f91(N + 11));
        }
    }
}
