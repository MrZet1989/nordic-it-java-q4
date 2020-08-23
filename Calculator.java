package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char oper;
		
		do {

			System.out.println("Выбирите нужную операцию и нажмите Enter: ");
			System.out.println("1.Сложение: +");
			System.out.println("2.Вычетание: -");
			System.out.println("3.Умножение: *");
			System.out.println("4.Деление: /");
			System.out.println("5.Возведение в степень: ^");

			oper = in.next().charAt(0);

			if (oper != '^') {

				System.out.println("Введите первое число и нажмите Enter: ");
				var a = in.nextInt();

				System.out.println("Введите второе число и нажмите Enter: ");
				var b = in.nextInt();

				var res = 0;
				switch (oper) {
				case '+': {
					res = a + b;
					break;
				}
				case '-': {
					res = a - b;
					break;
				}
				case '*': {
					res = a * b;
					break;
				}
				case '/': {
					res = a / b;
					break;
				}
				}

				System.out.println("Результат: " + res);

			} else if (oper == '^') {

				System.out.println("Введите число возводимое в степень и нажмите Enter: ");
				var c = in.nextInt();

				System.out.println("Введите степень числа и нажмите Enter: ");
				var d = in.nextInt();
				var resStep = 1;

				for (var i = 1; i <= d; i++) {
					resStep *= c;
				}

				System.out.println("Число " + c + " в степени " + d + " равна = " + resStep);

			} else {
				System.out.println("Программа завершена");
				
			}
		} while (oper == 0);
	}
}
