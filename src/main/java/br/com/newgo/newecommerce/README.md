# NEW E-COMMERCE

## Descrição
Projeto simples de um sistema que processa os pedidos de um commerce usando threads e processamentos paralelos

## Objetivos
O objetivo principal é fazer a implementação dos métodos que utilizam Executors para se usar de threads no processamento de threads, garantir que os pedidos sejam finalizados da maneira correta após o processamento e controlar corretamente o número de threads no ExecutorService.
<br>
Aqui testaremos basicamente nossos conhecimentos em Threads e Módulos no Java, focando na certificação Java SE 17 exam 1Z0-829.

## Funcionalidades
- [x] Receber pedido
- [x] Processar pedido
- [x] Finalizar pedido
- [x] Usar threads para processar os pedidos de forma paralela

## Tecnologias
- Java 17
- Maven

## Compilação
Para compilar o projeto, basta executar os comandos abaixo:

```shell
javac -p mods -d NewEcommerceProcessing/target NewEcommerceProcessing/br/com/newgo/ecommerce/processing/*.java NewEcommerceProcessing/module-info.java

javac -p mods -d NewEcommerceService/target NewEcommerceService/br/com/newgo/ecommerce/service/*.java NewEcommerceService/module-info.java
```

## Empacotamento
Para empacotar os módulos criados, basta executar o comando abaixo:

```shell
jar -cvf mods/br.com.newgo.ecommerce.processing.jar -C NewEcommerceProcessing/target .

jar -cvf mods/br.com.newgo.ecommerce.service.jar -C NewEcommerceService/target .
```

## Execução
Para executar os módulos (o PedidoService que é o que tem alguma implementação a ser mostrada em console), basta executar os comandos abaixo:

```shell
java -p mods -m br.com.newgo.ecommerce.service/br.com.newgo.ecommerce.service.PedidoService
```


