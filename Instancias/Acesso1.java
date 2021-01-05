public class Acesso1 {
    public static void main(String[] args) {
        Acesso2 pitbull = new Acesso2();
        pitbull.zoologia = "Bípede";

        Acesso2 viraLatas = new Acesso2();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);
    }
}