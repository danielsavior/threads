package br.com.threads.lista;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        Lista lista = new Lista();

        //criando 10 thread e inicializando
        for(int i = 0; i<100; i++) {
            new Thread(new TarefaAdicionarElementos(lista, i)).start();
        }

        //dorme por 2s
        Thread.sleep(2000);

        //imprimindo a nossa lista
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.pegaElemento(i));
        }    
    }
}