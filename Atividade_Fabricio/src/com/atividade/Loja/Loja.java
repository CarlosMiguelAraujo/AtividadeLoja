package com.atividade.loja;
import java.util.Scanner;

  public class Loja extends Itens  {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
	  Vitrine vitrine = new Vitrine();
	  ItensDoCarrinho carrinho = new ItensDoCarrinho();	
	  int insert = 0;
	  int menuFormaPagamento = 0;
	  Double valorCarrinho = 70.0;
	  int quantidade = 0;
	
		
	while(true) {  
	  
	
	 System.out.println("1 - Ver vitrine" );
	  System.out.println("2 - Ver carrinho de compra" );
	   System.out.println("3 - Comprar item" );
	  System.out.println("4 - Realizar pagamento " );
	 System.out.println("5 - Acessar opções de administrador " );
	System.out.print(" Escolha uma das opções acima: " );
	insert = scan.nextInt();	
	
	 
	
	if(insert == 1) {
	 System.out.println(nome);
	}
	
	if(insert == 2) {
	 System.out.println("");
	}
	
	
	if (insert == 3) {
	System.out.println("Informe o código do produto: ");
	 System.out.println("Informe a quantidade desejada: ");
	  quantidade = scan.nextInt();
	
		
	}
     while(menuFormaPagamento < 1 || menuFormaPagamento > 2 ){
	 if( insert == 4 ){
		 
		 System.out.println("Qual a forma de pagamento?");
		  System.out.println("1- Cartão");
		  System.out.println("2- Dinheiro(À vista) ");
		  System.out.print("Por favor, escolha uma opção: ");
			menuFormaPagamento = scan.nextInt();
			    } 
			     }

	 if( menuFormaPagamento == 1){
		valorCarrinho = valorCarrinho * quantidade;	
		 System.out.println("O valor da compra é de: " + valorCarrinho);
			    } 

	 if( menuFormaPagamento == 2){
	   Double valorFinal = valorCarrinho * 0.10;
	   System.out.print("O valor da compra é de: " + valorFinal);
	   System.out.println("Sua compra foi realizada com Sucesso!");
			    }
	
	
	if(insert == 5) {
		
	}
	
		   
	}
	 }
	  }
