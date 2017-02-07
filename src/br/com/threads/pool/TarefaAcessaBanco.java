package br.com.threads.pool;

public class TarefaAcessaBanco implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public TarefaAcessaBanco(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run(){
    	synchronized (pool) { 
    	    
    		System.out.println(Thread.currentThread().getName() + " Pegou a chave do pool");
    	    pool.getConnection();
    	    
    	    synchronized (tx) { 

    	        System.out.println(Thread.currentThread().getName() +" Pegou a chave da tx");
    	        tx.begin();

    	    }
    	}
    }
}
