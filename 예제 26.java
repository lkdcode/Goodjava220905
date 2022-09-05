import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, result = 0;
		char ch;

		System.out.printf("첫번째 수를 입력하세요 : ");
		a = scan.nextInt();

		System.out.printf("계산할 연산자를 입력하세요 : ");
		ch = scan.next().charAt(0);

		System.out.printf("두번째 수를 입력하세요 : ");
		b = scan.nextInt();

		try {
			switch (ch) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '*':
				if (a == 0 || b == 0)
					throw new Exception("0으로 곱하면 어차피 0입니다 .");
				result = a * b;
				break;

			case '/':
				if (b == 0)
					throw new Exception("0으로 나누면 안 됩니다.");
				result = a / b;
				break;
			}
			if (result < 0)
				throw new Exception("결과가 음수네요. ㅠㅠ");

			System.out.printf("결과 값 ==> %d\n", result);
		} catch (Exception e) {
			System.out.printf("발생 오류 ==> ");
			System.out.println(e.getMessage());
		}
	}
}