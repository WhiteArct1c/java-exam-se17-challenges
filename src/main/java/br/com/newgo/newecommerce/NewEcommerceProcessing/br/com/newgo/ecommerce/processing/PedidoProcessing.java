package br.com.newgo.ecommerce.processing;

public class PedidoProcessing {
   public void processarPedido(String pedido){
      System.out.println("Processando pedido: " + pedido);
      //Simular um tempo de processamento usando algo como Thread.sleep();
      try{
         Thread.sleep(2000);
      }catch(InterruptedException e){
         Thread.currentThread().interrupt();
         System.err.println("Erro ao processar pedido: " + e.getMessage());
      }
      System.out.println("Pedido processado com sucesso: " + pedido);
   }
}