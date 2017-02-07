package br.com.threads.pool;

public class GerenciadorDeTransacao {

    public void begin() {

        System.out.println(Thread.currentThread().getName() + " Começando a transação");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
