package miosi.prg.n07.es04;

import miosi.prg.n06.es01.Circle;

public class ScalableCircle extends Circle implements Scalable {
    public void scale(double factor) {
        setRadius(getRadius() * factor);
    }
}