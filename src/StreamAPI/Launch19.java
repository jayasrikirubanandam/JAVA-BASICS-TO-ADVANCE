package StreamAPI;

import java.util.stream.Collectors;

public class Launch19 {

	public static void main(String[] args) {
		String s ="I am a  java developer";
		
		String newS = s.chars().filter(c-> !Character.isWhitespace(c))
				.mapToObj(c-> String.valueOf((char) c))
				.collect(Collectors.joining());
		

		System.out.println("Old String " + s + " New String " +newS);
	}

}
