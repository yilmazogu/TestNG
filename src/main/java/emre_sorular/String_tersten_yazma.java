package emre_sorular;

import java.util.Arrays;
import java.util.Scanner;

public class String_tersten_yazma {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        String isim = "Oguzhan";
        String[] harfler = isim.split("");
        String terstenYazilan = "";
        System.out.println(Arrays.deepToString(harfler));

        for (int i = (harfler.length) - 1; i >= 0; i--) {
            terstenYazilan += harfler[i];

        }
        System.out.println(terstenYazilan);


    }
}
