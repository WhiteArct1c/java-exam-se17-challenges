package br.com.newgo.ecommerce.service;

import br.com.newgo.ecommerce.processing.PedidoProcessing;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PedidoService{
   //Essas threads devem ser usada para processamento de pedidos de forma paralela
   private ExecutorService executorService = Executors.newFixedThreadPool(5);

   public void receberPedido(String pedido){
      System.out.println("Recebendo pedido: " + pedido);

      executorService.submit(() -> {
         //chamar serviço de processamento
      });
   }

   public void finalizar(){
      executorService.shutdown();
   }

   public static void main(String[] args){
      PedidoService pedidoService = new PedidoService();
      pedidoService.receberPedido("Pedido 1");
      pedidoService.receberPedido("Pedido 2");
      pedidoService.receberPedido("Pedido 3");
      pedidoService.receberPedido("Pedido 4");
      pedidoService.receberPedido("Pedido 5");
      //finalizar corretamente o ExecutorService
   }
}