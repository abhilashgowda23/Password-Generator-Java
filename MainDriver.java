package demo.password;

import java.util.Scanner;

public class MainDriver {

	public static final Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		Generator generator = new Generator(keyboard);
		generator.mainLoop();
		keyboard.close();
	}
}
