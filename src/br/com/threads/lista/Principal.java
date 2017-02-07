package br.com.threads.lista;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElementos(lista, i)).start();
        }

        new Thread(new TarefaImprimir(lista)).start();
    }
}