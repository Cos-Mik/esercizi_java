package miosi.prg.n07.es03;

import java.util.Random;

public class Moneta implements Drawable<Integer> {
    private Random r;

    public Moneta() {
        r = new Random();
    }

    public Integer draw() {
        return r.nextInt(6) + 1;
    }
}