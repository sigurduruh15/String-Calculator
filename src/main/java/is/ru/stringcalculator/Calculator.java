package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){
			String [] number = text.split(",");
			return Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
		}
		else
			return 1;
	}
}