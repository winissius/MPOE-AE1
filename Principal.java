public class Principal {
    public static void main(String[] args) {
        Lista l = new Lista();

        l.insereUltimo(10);
        l.insereUltimo(20);
        l.insereUltimo(30);

        l.inserePrimeiro(50);

        l.insereUltimo(5);

        l.mostrar();


        No noNovo = l.noPosicao(20);

        l.insereDepois(noNovo, 100);
        System.out.println("\nInsere depois");
        l.mostrar();

        /*l.removeUltimo();
        System.out.println();
        l.mostrar();
        System.out.println();
        l.removePrimeiro();
        l.mostrar();

        System.out.println();
        l.removePrimeiro();
        l.mostrar();

        System.out.println();
        l.removePrimeiro();
        l.mostrar();

        System.out.println();
        // l.removePrimeiro();
        l.removeUltimo();
        l.mostrar();*/



    }
}
