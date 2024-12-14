import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static utility.Tools.*;
public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        int tempo;
        Scanner sc = new Scanner(System.in);
        /*try{
            Pilota p1 = new Pilota("messi", "marchetto", "Islanda");
            System.out.println(p1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            Cronometro cr = new Cronometro();
            tempo = rn.nextInt(0,99) + 1;
            cr.setStartTime();
            Wait(tempo);
            cr.setEndTime();
            cr.calcolaIntTimer();
            System.out.println(cr.getTempoGiro());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/

        try {
            ArrayList<Scuderia> scuderia = new ArrayList<>();
            Pilota p1 = new Pilota("Lionel", "Messi", "Argentina");
            Scuderia sc1 = new Scuderia("Ferrari", p1, 2);
            scuderia.add(sc1);
            Pilota p2 = new Pilota("Andrea", "Diprè", "Sudan");
            Scuderia sc2 = new Scuderia("McLaren", p2, 2);
            scuderia.add(sc2);
            Pilota p3 = new Pilota("Lo", "Xiuderone", "Italia");
            Scuderia sc3 = new Scuderia("Haas", p3, 2);
            scuderia.add(sc3);
            scuderia.forEach(s-> System.out.println(s.toString()));

            Cronometro cr = new Cronometro();
            for(int i=0; i<3; i++){
                int num = rn.nextInt(1, 5) +1;
                cr.setStartTime();
                Wait(num);
                cr.setEndTime();
                scuderia.get(i).setTempoGiro(cr.getTempoGiro());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}