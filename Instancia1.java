public class Instancia1 {
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";

        final Cachorro viralatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viralatas.zoologia);
    }
}
