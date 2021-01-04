public class Condicional {
    public static void main(String[] args) {
        var condicao = false;

        if (condicao) {
            System.out.println("A condição é verdadeira");
        }else {
            System.out.println("A condição é falsa");
        }

        if (condicao) {
            System.out.println("Uma linha...");
            
            var ternario = condicao ? "é verdadeira" : "é falsa";

            System.out.println(ternario);
        }

    }
}
