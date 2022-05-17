public class Pilota extends Thread implements Comparable<Pilota>{
    String nome;
    boolean tuta=false;
    boolean casco=false;
    Spogliatoio sp;
    int t = 0;
    
    public Pilota(String s, Spogliatoio spo){
        nome =  s;
        sp=spo;
    }

    public void run(){
        
        sp.usa(this);
        

        long start = System.nanoTime();
        try {
            Thread.sleep((long)(Math.random() * 1000));
        } catch (InterruptedException e) {
        }
        long end = System.nanoTime();
        sp.usa(this);
        
        t = (int) ((end-start)/1000000);

    }

    @Override
    public int compareTo(Pilota p){
        return this.t - p.t;
    }

   

    

}
