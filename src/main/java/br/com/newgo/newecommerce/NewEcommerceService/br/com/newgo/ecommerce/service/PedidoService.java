package br.com.newgo.ecommerce.service;

import br.com.newgo.ecommerce.processing.PedidoProcessing;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PedidoService{
   //Essas threads devem ser usada para processamento de pedidos de forma paralela
   private ExecutorService executorService = Executors.newFixedThreadPool(5);
   private PedidoProcessing pedidoProcessing = new PedidoProcessing();

   public void receberPedido(String pedido){
      System.out.println("Recebendo pedido: " + pedido);

      executorService.submit(() -> {
         //chamar serviço de processamento
         pedidoProcessing.processarPedido(pedido);
      });
   }

   public void finalizar(){
      try{
         System.out.println("Finalizando processamento de pedidos...");
         executorService.shutdown();
         if(!executorService.awaitTermination(60, TimeUnit.SECONDS)){
            executorService.shutdownNow();
         }
      }catch(Exception e){
         System.err.println("Erro ao finalizar processamento de pedidos: " + e.getMessage());
         executorService.shutdownNow();
      }
   }

   public static void main(String[] args){
      PedidoService pedidoService = new PedidoService();
      pedidoService.receberPedido("Pedido 1");
      pedidoService.receberPedido("Pedido 2");
      pedidoService.receberPedido("Pedido 3");
      pedidoService.receberPedido("Pedido 4");
      pedidoService.receberPedido("Pedido 5");
      //finalizar corretamente o ExecutorService
      pedidoService.finalizar();
   }
}