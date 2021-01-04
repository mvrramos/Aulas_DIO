public class Acesso1 {
    public static void main(String[] args) {
        final Acesso2 pitbull = new Acesso2();
        pitbull.zoologia = "Bipede";

        final Acesso2 viralatas = new Acesso2();

        System.out.println(pitbull.zoologia);
        System.out.println(viralatas.zoologia);
    }
}
