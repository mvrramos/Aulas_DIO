public class Instancia1 {
    public static void main(String[] args) {
        final Instancia2 pitbull = new Instancia2();
        pitbull.zoologia = "Bipede";

        final Instancia2 viralatas = new Instancia2();

        System.out.println(pitbull.zoologia);
        System.out.println(viralatas.zoologia);
    }
}
