package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Datas {
	
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public static void main(String[] args) {
		localDate();
		localTime();
		localDateTime();
	}

	private static void localDate() {
		System.out.println("### LocalDate: ");
		LocalDate hoje = LocalDate.now();
		System.out.println("Hoje é dia " + DATE_FORMATTER.format(hoje));
		System.out.println("Semana que vem é " + DATE_FORMATTER.format(hoje.plusDays(7)));
		
		LocalDate aniversario30Anos = LocalDate.of(2025, Month.MAY, 31);
		long diasFaltantes30Anos = ChronoUnit.DAYS.between(hoje, aniversario30Anos);
		System.out.println("Faltam " + diasFaltantes30Anos + " dias para meu aniversário de 30 anos!");
	}
	
	private static void localTime() {
		System.out.println("### LocalTime: ");
		LocalTime agora = LocalTime.now();
		System.out.println("Agora são " + TIME_FORMATTER.format(agora));
	}
	
	private static void localDateTime() {
		System.out.println("### LocalDateTime: ");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("Agora é " + DATE_TIME_FORMATTER.format(agora));
		
		ZonedDateTime agoraTimeZone = ZonedDateTime.now();
		System.out.println("Agora, com time zone é " + DATE_TIME_FORMATTER.format(agoraTimeZone));
	}
	
}
