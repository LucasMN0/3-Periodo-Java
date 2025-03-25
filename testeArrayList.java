package LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class testeArrayList{
    public static void main(String[] args){
        ArrayList <String> l1 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i<5;++i){
            System.out.println("Informe o "+(i+1)+"° nome: ");
            l1.add(sc.nextLine());
        }
        Collections.sort(l1);
        for (int i = 0;i<5;++i){
            System.out.println("O "+(i+1)+"° nome é: "+l1.get(i));
        }
        sc.close();
    }
}
