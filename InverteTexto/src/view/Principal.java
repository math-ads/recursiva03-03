package view;

import javax.swing.JOptionPane;

import controller.InverteTexto;

public class Principal {

public static void main(String[] args) {
    

	String textoA;
	String textoB= "";
	textoA= JOptionPane.showInputDialog("Digite o texto");
	
	
 InverteTexto inverteTexto = new InverteTexto();
	int tamanho = textoA.length(); 
 String resp = inverteTexto.otxet(textoA, textoB, tamanho);
 System.out.println(resp);
}
}
