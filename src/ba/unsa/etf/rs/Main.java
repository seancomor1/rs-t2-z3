package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite recenicu: ");
        String recenica = s.nextLine();
        String najduza = "";
        for (String rijec: recenica.split(" ")) {
            if(rijec.length() > najduza.length() ){
                najduza = rijec;
            }
        }

        String recenica2 = "";
        for (String rijec: recenica.split(" ")){
            if(rijec.equals(najduza)){
                rijec = rijec.toUpperCase();
            }
            recenica2 += rijec +" ";
        }
        System.out.println(recenica2);
    }
}