package BINUS;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan nomor handphone : ");
        String sNomor = sc.nextLine();

        int total = 0;
        int[] cNomor = new int[sNomor.length()];
        for(int i = 0; i < sNomor.length(); i++) {
            cNomor[i] = Integer.parseInt(Character.toString(sNomor.charAt(i)));
            total += cNomor[i];
        }
        System.out.println(total);
    }
}
