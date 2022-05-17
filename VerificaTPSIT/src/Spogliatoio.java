import java.util.ArrayList;

public class Spogliatoio{
    Semaforo sem;
    public static ArrayList<Pilota> scrBoard = new ArrayList();

    public Spogliatoio(Semaforo sem) {
        this.sem = sem;
    }

    public void usa(Pilota p){
        sem.p();
        p.tuta = true;
        p.casco=false;
        System.out.println("Nello spogliatoio è entrato/a: "+ p.nome);
        System.out.println(p.nome+ " ha iniziato a gareggiare");
        System.out.println(p.nome+ " ha finito a gareggiare");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("Dallo spogliatoio è uscito/a: "+ p.nome);
        p.tuta = true;
        p.casco=false;
        sem.v();
    }

    
}
