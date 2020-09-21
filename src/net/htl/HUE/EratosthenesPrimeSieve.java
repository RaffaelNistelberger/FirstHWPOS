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
public class EratosthenesPrimeSieve implements PrimeSieve {

    private int graenze;

    public EratosthenesPrimeSieve(int i) {
        graenze = i;
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = 2; i < p; i++) {
            int a = p % i;
            if (a == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 1; i <= graenze; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
}
