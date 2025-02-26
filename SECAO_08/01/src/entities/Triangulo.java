package entities;

public class Triangulo {
    public double lado01;
    public double lado02;
    public double lado03;

    public double areaTriangulo(){
        double p = (lado01 + lado01 + lado03)/2;
        return Math.sqrt(p *(p - lado01) * (p - lado02) * (p- lado03));
    }
}
