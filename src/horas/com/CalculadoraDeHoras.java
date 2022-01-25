package horas.com;

import java.util.Scanner;

public class CalculadoraDeHoras {
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Inserir hora no formato (HH mm)");
    	System.out.print("Entrada: ");
    	int horaEntrada = (scanner.nextInt() * 60 + scanner.nextInt());
    	System.out.print("Almoço: ");
    	int horaAlmoco= (scanner.nextInt() * 60 + scanner.nextInt());
    	System.out.print("Volta: ");
    	int horaVolta = (scanner.nextInt() * 60 + scanner.nextInt());
    	System.out.print("Saída: ");
    	int horaSaida = (scanner.nextInt() * 60 + scanner.nextInt());
    	scanner.close();
    	
    	int duracao;
    	duracao = ((horaAlmoco - horaEntrada) + (horaSaida - horaVolta));
    	
    	int duracaoHoras = duracao / 60;
    	int duracaoMinutos = duracao % 60;
    	
    	System.out.printf("A jornada de trabalho durou %d hora(s) e %d minuto(s)!", duracaoHoras, duracaoMinutos);
    
    }
}