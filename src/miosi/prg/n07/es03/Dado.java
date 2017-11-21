package miosi.prg.n07.es03;

import java.util.Random;

public class Dado implements Drawable<Dado.Faccia> {
    private Random r;

    public Dado() {
        r = new Random();
    }

    public enum Faccia {
        TESTA, CROCE
    }

    public Faccia draw() {
        return Faccia.values()[r.nextInt(2)];
    }
}