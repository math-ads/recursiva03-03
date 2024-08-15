package controller;

public class InverteTexto {



	public InverteTexto() {
		super();}
	
	public String otxet(String textoC, String textoD, int tamanhovet ) {
		
		
		if(tamanhovet==0) {
	/*
	 * limitado ao tamanho da string para nao estourar o index
	 */
		    return(textoD );}
		else {
		
		textoD = textoD.concat(textoC.substring(tamanhovet -1, tamanhovet));
	 /*
	  * o tamanho diminui para que outra letra seja lida e levada em conta no substring
	  */
		 return otxet( textoC, textoD, tamanhovet-1);
		}
		   
		
	}}
	