package miosi.prg.n07.es04;

import miosi.prg.n06.es01.Square;

public class ScalableSquare extends Square implements Scalable {
    public void scale(double factor) {
        setSide(getSide() * factor);
    }
}