package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Player {

	private String name;
	private Position position;
	private Date birthdate;
	private String nationality;
	private Double height;
	private Double weight;

	public Player(String name, Position position, Date birthdate, String nationality, Double height, Double weight) {
		this.name = name;
		this.position = position;
		this.birthdate = birthdate;
		this.nationality = nationality;
		this.height = height;
		this.weight = weight;
	}
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public int ageCalculation() {

		cal.setTime(this.birthdate);
		cal2.setTime(new Date());

		if (cal.get(Calendar.MONTH) > cal2.get(Calendar.MONTH)) {

			return cal2.get(Calendar.YEAR) - cal.get(Calendar.YEAR) - 1;

		}

		if (cal.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)) {

			if (cal.get(Calendar.DAY_OF_MONTH) > cal2.get(Calendar.DAY_OF_MONTH)) {
				return cal2.get(Calendar.YEAR) - cal.get(Calendar.YEAR) - 1;
			}
		}
		return cal2.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
	}

	public String timeToRetire() {

		cal.setTime(this.birthdate);
		cal2.setTime(new Date());

		if (this.position == Position.ATACANTE) {
			int ageCheck = 35 - ageCalculation();
			if (ageCheck > 0) {
				return "O jogador vai se aposentar em " + ageCheck + "anos";

			}

		}

		else if (this.position == Position.MEIO_CAMPO) {
			int ageCheck = 38 - ageCalculation();
			if (ageCheck > 0) {
				return "O jogador vai se aposentar em " + ageCheck + " anos";

			}

		}

		else if (this.position == Position.ZAGUEIRO) {
			int ageCheck = 40 - ageCalculation();
			if (ageCheck > 0) {
				return "O jogador vai se aposentar em " + ageCheck + "anos";

			}

		}
	
		return null;
		
	}

	public String toString() {

		return "Nome: " + this.name + " \n" + "Posição: " + this.position + " \n" + "Data de nascimento: "
				+ sdf.format(this.birthdate) + " \n" + "Altura: " + String.format("%.2f", this.height) + " \n" + "Peso: " + this.weight + " \n";

	}

}
