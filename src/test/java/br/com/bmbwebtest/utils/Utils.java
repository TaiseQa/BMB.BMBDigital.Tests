package br.com.bmbwebtest.utils;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Utils {
	
	public static String getValorFormulario(String campoFormulario, List<Map<String, String>> formulario) {
		return formulario.stream().filter(campo -> campo.get("Campo").equals(campoFormulario)).findFirst().get()
				.get("Valor");
	}

	private static int randomiza(int n) {
		int ranNum = (int) (Math.random() * n);
		return ranNum;
	}

	private  static int mod(int dividendo, int divisor) {
		return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
	}
	
	public static String cnpj(boolean comPontos) {
		int n = 9;
		int n1 = randomiza(n);
		int n2 = randomiza(n);
		int n3 = randomiza(n);
		int n4 = randomiza(n);
		int n5 = randomiza(n);
		int n6 = randomiza(n);
		int n7 = randomiza(n);
		int n8 = randomiza(n);
		int n9 = 0; //randomiza(n);
		int n10 = 0; //randomiza(n);
		int n11 = 0; //randomiza(n);
		int n12 = 1; //randomiza(n);
		int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4 + n1 * 5;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4 + n2 * 5 + n1 * 6;

		d2 = 11 - (mod(d2, 11));

		if (d2 >= 10)
			d2 = 0;

		String retorno = null;

		if (comPontos)
			retorno = "" + n1 + n2 + "." + n3 + n4 + n5 + "." + n6 + n7 + n8 + "/" + n9 + n10 + n11 + n12 + "-" + d1 + d2;
		else
			retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + d1 + d2;

		return retorno;
	}
	
	public String rg(boolean comPontos) {
//		String  nDigResult;
		String numerosContatenados;
		String numeroGerado;
		Random numeroAleatorio = new Random();
		//numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);

		//Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3)  + String.valueOf(n4) +
				String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)  +
				String.valueOf(n9);
		numeroGerado = numerosContatenados;

        if (comPontos)
            numeroGerado = "" + n1 + n2 + "." + n3 + n4 + n5 + "." + n6 + n7 + n8 + "-" + n9;
        else
            numeroGerado = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;

		return numeroGerado;
	}
	
	@SuppressWarnings("deprecation")
	private static String calcDigVerif(String num) {
		Integer primDig, segDig;
		int soma = 0, peso = 10;
		for (int i = 0; i < num.length(); i++)
			soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
		if (soma % 11 == 0 | soma % 11 == 1)
			primDig = new Integer(0);
		else
			primDig = new Integer(11 - (soma % 11));
		soma = 0;
		peso = 11;
		for (int i = 0; i < num.length(); i++)
			soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
		soma += primDig.intValue() * 2;
		if (soma % 11 == 0 | soma % 11 == 1)
			segDig = new Integer(0);
		else
			segDig = new Integer(11 - (soma % 11));
		return primDig.toString() + segDig.toString();
	}

	@SuppressWarnings("deprecation")
	public static String geraCPF() {
		String iniciais = "";
		Integer numero;
		for (int i = 0; i < 9; i++) {
			numero = new Integer((int) (Math.random() * 10));
			iniciais += numero.toString();
		}
		return iniciais + calcDigVerif(iniciais);
	}

	public static boolean validaCPF(String cpf) {
		if (cpf.length() != 11)
			return false;
		String numDig = cpf.substring(0, 9);
		return calcDigVerif(numDig).equals(cpf.substring(9, 11));
	}

	public static void main(String args[]) {
		System.out.println(geraCPF());
		System.out.println(validaCPF(geraCPF()));
	}
	
	public String removeCaracteresEspeciais(String doc) {
		if (doc.contains(".")) {
			doc = doc.replace(".", "");
		}
		if (doc.contains("-")) {
			doc = doc.replace("-", "");
		}
		if (doc.contains("/")) {
			doc = doc.replace("/", "");
		}
		return doc;
	}
	
	public static String GerarDataHora() {
		return OffsetDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss"));
	}
	
	public static String GerarData() {
		return OffsetDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yy"));
	}
	
}
