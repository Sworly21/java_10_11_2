package hu.petrik.javaautok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Auto> autoLista = new ArrayList<>();

        Porsche p1 = new Porsche(220);
        Porsche p2 = new Porsche(250);
        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();

        autoLista.add(p1);
        autoLista.add(p2);
        autoLista.add(t1);
        autoLista.add(t2);
        autoLista.add(t3);

        for (Auto a : autoLista){
            System.out.println(a.getSebesseg());
            a.gyorsul();
            System.out.println(a.getSebesseg());
            System.out.println();
        }
        System.out.println(Leggyorsabb(autoLista).getSebesseg());
    }
    private static Auto Leggyorsabb(List<Auto> lista){
        Auto tempAuto = lista.get(0);
        for (Auto a : lista){
            if (a.getSebesseg() > tempAuto.getSebesseg()){
                tempAuto = a;
            }
        }
        return tempAuto;
    }
}
