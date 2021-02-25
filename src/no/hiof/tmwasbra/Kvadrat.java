package no.hiof.tmwasbra;

public class Kvadrat extends Rektangel {
    private double side;

    public Kvadrat(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "kvadrat med side: " + side + " og arealet: " + areal() + " og omkretsen: " + omkrets();
    }
}
