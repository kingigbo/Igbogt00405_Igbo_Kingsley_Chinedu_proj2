/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaassignment2;

/**
 *
 * @author king
 */
public class sort {
    public static void sort(String [] a, int W){
        int R = 256; int N = a.length;
        //for each of the character from right to left
        for (int d = W - 1; d >= 0; d--) {
            int[] count = new int[R + 1];
            for (int i = 0; i < N; i++) {
                count[a[i].charAt(d) + 1]++;
            }
            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }
            String aux[] = new String[N];
            for (int i = 0; i < N; i++) {
                aux[count[a[i].charAt(d)]] = a[i];
                count[a[i].charAt(d)]++;
            }
            System.arraycopy(aux,0,a,0,N);
        }   
    }
}
