package no.hiof.tmwasbra;

public class Main {

    public static void main(String[] args) {
	    Rektangel etRektangel = new Rektangel(5, 6);
        Kvadrat kvadratet = new Kvadrat(5);
        Sirkel enSirkel = new Sirkel(8);

        //Første timer
        System.out.println(etRektangel.toString());
        System.out.println("Rektanglet har arealet: " + etRektangel.areal());
        System.out.println(enSirkel.toString());
        System.out.println("Sirkelen har arealet: " + enSirkel.areal());
        System.out.println(kvadratet.toString());

        System.out.println("****HVILKEN ER STØRST? REKTANKEL ELLER SIRKEL?****");

        if (erStorre(etRektangel, enSirkel)){
            System.out.println("Rektanglet størst");
        }
        else {
            System.out.println("Sirkelen er størst");
        }

        Figur[] figurer = new Figur[3]; // var [5]
        figurer[0] = etRektangel;
        figurer[1] = enSirkel;
        figurer[2] = kvadratet;
        //figurer[3] = null
        //figurer[4] = null

        System.out.println("\n ************** utskrift fra array - figurer **************");

        /*for (int i = 0; i < figurer.length; i++) {
            Figur enFigur = figurer[i];
            System.out.println(enFigur.areal());
        }*/

        for (Figur enFigur : figurer) {
            System.out.println("Areal: " + enFigur.areal());

            if(enFigur instanceof Sirkel) {
                Sirkel sirkelen = (Sirkel)enFigur;
                System.out.println("Diameter: " + sirkelen.getDiameter());
            }
        }




    }

    public static boolean erStorre(Figur figur1, Figur figur2) {
        return figur1.areal() > figur2.areal();
    }
}
