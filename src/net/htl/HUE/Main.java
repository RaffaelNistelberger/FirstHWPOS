/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htl.HUE;

/**
 *
 * @author raffa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(10);
        System.out.println(e.isPrime(10));
        e.printPrimes();

        e.searchAmount(10);

        System.out.println("NEW LINE");

        e.searchAmount(20);
    }

}
