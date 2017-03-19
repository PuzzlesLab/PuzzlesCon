
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

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
        StringTokenizer st;
        HashMap<String, Integer> h = new HashMap();
        int testcase = Integer.parseInt(br.readLine());
        String[] arr = new String[testcase];
        for (int i = 0; i < testcase; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            arr[i] = st.nextToken();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i], 0);
        }
        for (int i = 0; i < arr.length; i++) {
            if (h.containsKey(arr[i])) {
                h.replace(arr[i], h.get(arr[i]) + 1);
            }
        }
        Object[] keys = h.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.println(key.toString() + " " + h.get(key));
        }
    }
}
