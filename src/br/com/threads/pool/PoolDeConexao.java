package br.com.threads.pool;

public class PoolDeConexao {

    public String getConnection() {

        System.out.println(Thread.currentThread().getName() +" Emprestando conexão");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "connection";
    }
}
