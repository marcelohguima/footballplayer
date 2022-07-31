package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Player;
import entities.Position;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Nome do jogador: ");
		String name = sc.nextLine();
		
		System.out.print("Posição do jogador: (ATACANTE, MEIO_CAMPO, ZAGUEIRO) ");
		Position position = Position.valueOf(sc.nextLine());
		
		System.out.print("Data de nascimento do jogador: ");
		Date birthdate = sdf.parse(sc.nextLine());
		
		System.out.print("Nacionalidade do jogador: ");
		String nationality = sc.nextLine();
		
		System.out.print("Altura do jogador: ");
		Double height = sc.nextDouble();
		
		System.out.println("Peso do jogador: ");
		Double weight = sc.nextDouble();
		
		Player player = new Player(name, position, birthdate, nationality, height, weight);
		
		System.out.println(player);
		System.out.println("A idade desse viado ai é: " + player.ageCalculation() + " anos");
		System.out.println(player.timeToRetire());
		
		
		
		
		sc.close();
	}
}
