package miosi.prg.n07.es04;

import miosi.prg.n06.es01.Rectangle;

public class ScalableRectangle extends Rectangle implements Scalable {
    public void scale(double factor) {
        setWidth(getWidth() * factor);
        setHeight(getHeight() * factor);
    }
}