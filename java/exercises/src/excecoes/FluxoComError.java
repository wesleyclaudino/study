package excecoes;

public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        try {
        	metodo2();
        } catch(ArithmeticException | NullPointerException | UncheckedException ex) {
        	ex.printStackTrace();
        	String msg = ex.getMessage();
        	System.out.println(msg);
        }
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        metodo2();
        System.out.println("Fim do metodo2");
    }
}