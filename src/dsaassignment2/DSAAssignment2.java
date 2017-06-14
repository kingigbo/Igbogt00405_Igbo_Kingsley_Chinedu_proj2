/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaassignment2;

import static dsaassignment2.sort.sort;

/**
 *
 * @author king
 */
public class DSAAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] a = {"158", "124", "238",

                        "707", "608", "250", "888"};
        sort(a,3);
        for (String a1 : a) {
            System.out.println(a1);
        }
    }
    
}
