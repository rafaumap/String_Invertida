package controller;

public class StringInvertida {

	public StringInvertida() {
		super();
	}
	
	public String inverter(String string, int index) {
		if (index == 0) {
			return "";
		} else { 
			return string.substring(index - 1, index) + inverter(string, index - 1);
		}
	}
}

/*
	1 - A condição de parada é quando o índice da string é igual à 0;
	2 - Para construir a string invertida, é necessário obter um caractere por vez a partir do fim da cadeia.
	Para conquistar isso usando String.substring, é necessário obter a penúltima posição e a última em cada iteração, 
	ex: "casa".substring(2,3) => a.
	Se decrementarmos o index a cada iteração, podemos empilhar até que cheguemos ao index 0, onde concatenaremos 
	um caractere nulo.
*/