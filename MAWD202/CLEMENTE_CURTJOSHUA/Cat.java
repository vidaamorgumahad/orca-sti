package cat;

public class Cat {
    public static String catType  = "";
    public static int    cuteness = 0;

    public Cat () {this.catType = "Unknown"; this.cuteness = 0;}
    public Cat (String t, int cute) {this.catType = t; this.cuteness = cute;}

    public int getCuteness() {return this.cuteness;}
}
