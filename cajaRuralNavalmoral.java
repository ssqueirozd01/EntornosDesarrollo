package unidad1.ejercicios;

import java.util.Scanner;

public class cajaRuralNavalmoral {

	static final String MONEDA = "";
	
	public static void main (String[] args) {
	
	
	Scanner lector = new Scanner(System.in);
	double tipoInteres = 0;
	double saldoInicial = 0;
	double saldoAcumulado = 0;
	double saldoAcumulado_1Anho = 0;
	double saldoAcumulado_2Anho = 0;
	double saldoAcumulado_3Anho = 0;
	
	
	System.out.println("Tipo de interés(%):");
	tipoInteres=lector.nextDouble();
	System.out.println("Saldo inicial:");
	saldoInicial=lector.nextDouble();
	

	
	saldoAcumulado_1Anho = saldoInicial * (1+tipoInteres/100);
	saldoAcumulado_2Anho = saldoAcumulado_1Anho * (1+tipoInteres/100);
	saldoAcumulado_3Anho = saldoAcumulado_2Anho * (1+tipoInteres/100);
	
	System.out.println("Saldo inicial" + saldoInicial+MONEDA);
	System.out.printf("Saldo acumulado 1º año:%.2f"+MONEDA+"\n",saldoAcumulado_1Anho);
	System.out.printf("Saldo acumulado 2º año:%.2f"+MONEDA+"\n",saldoAcumulado_2Anho);
	System.out.printf("Saldo acumulado 3º año:%.2f"+MONEDA+"\n",saldoAcumulado_3Anho);
	lector.close();
	
   }
 }
