public class Principal {
    public static void main(String[] args) {
        System.out.println("Iniciando lista vazia");
        Lista l = new Lista();
        l.mostrar();

        System.out.println("Insere ultimo");
        l.insereUltimo(10);
        l.insereUltimo(20);
        l.insereUltimo(30);
        l.mostrar();

        System.out.println("\nInserrir primeiro");
        l.inserePrimeiro(50);
        l.mostrar();

        System.out.println("\nRemove o nó 20");
        No noNovo = l.noPosicao(20);
        l.remove(noNovo);
        l.mostrar();
        System.out.println("\nRemove o nó 10");
        No noNovo2 = l.noPosicao(10);
        l.remove(noNovo2);
        l.mostrar();

        System.out.println("\nInsere depois do nó 30");
        No noNovo3 = l.noPosicao(30);
        l.insereDepois(noNovo3, 100);
        l.mostrar();
        System.out.println("\nInsere depois do nó 100");
        No noNovo4 = l.noPosicao(100);
        l.insereDepois(noNovo4, 101);
        l.mostrar();

        System.out.println("\nRemove o ultimo");
        l.removeUltimo();
        l.mostrar();

        System.out.println("\nRemove o primeiro");
        l.removePrimeiro();
        l.mostrar();
    }
}
