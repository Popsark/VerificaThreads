import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Semaforo sem = new Semaforo(2);
        Spogliatoio sp = new Spogliatoio(sem);
        ArrayList<Pilota> board= new ArrayList();

        Pilota pil1 = new Pilota("Roberto", sp);
        Pilota pil2 = new Pilota("Armaldo", sp);
        Pilota pil3 = new Pilota("Veronica", sp);
        Pilota pil4 = new Pilota("Franco", sp);
        Pilota pil5 = new Pilota("Volo", sp);
        Pilota pil6 = new Pilota("Rufus", sp);
        Pilota pil7 = new Pilota("Vrettok", sp);
        Pilota pil8 = new Pilota("Jolyne", sp);

        pil1.start();
        pil2.start();
        pil3.start();
        pil4.start();
        pil5.start();
        pil6.start();
        pil7.start();
        pil8.start();

        pil1.join();
        pil2.join();
        pil3.join();
        pil4.join();
        pil5.join();
        pil6.join();
        pil7.join();
        pil8.join();


        board.add(pil1);
        board.add(pil2);
        board.add(pil3);
        board.add(pil4);
        board.add(pil5);
        board.add(pil6);
        board.add(pil7);
        board.add(pil8);
        Collections.sort(board);

    
        System.out.println("La classifica è: "+"\n");
        for(int i=0; i< board.size();i++){
        System.out.println((i+1)+" "+board.get(i).nome+ "\n");
        }

    }
}
