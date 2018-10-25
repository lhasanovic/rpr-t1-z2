package ba.unsa.etf.rpr.tutorijal1;

import java.util.Scanner;

public class Main {

    static int sumaCifara(int num){
        // provjeravamo 0 < num

        int sum = 0;
        while(num != 0){
            sum+=num%10;
            num/=10;
        }

        return sum;
    }


    public static void main(String[] args) {
	// interakciju sa korisnikom

        int n = 0;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Upisite n: ");
        n = ulaz.nextInt();
        if(n < 1) System.out.println("Broj manji od 1.");
        else{
            for(int i = 1; i <= n; i++){
                if(i % sumaCifara(i) == 0) {
                    System.out.println("\nBroj " + i + " je djeljiv.");
                }
            }
        }


    }
}
