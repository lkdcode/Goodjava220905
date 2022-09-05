import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new File("c:/temp/in.txt")); // 파일을 행 단위로 읽기 위해 스캐너 인스턴스 준비

		PrintWriter pw = new PrintWriter("c:/temp/out.txt"); // 파일을 행 단위로 쓰기 위해 스캐너 인스턴스 준비

		String str1, str2 = ""; // 읽어온 문자열은 str1에 저장하고 바뀐 순서는 str2에 저장한다.

		while (scan.hasNextLine()) {
			str1 = scan.nextLine();
			int size = str1.length();
			for (int i = size - 1; i >= 0; i--) {
				str2 += str1.charAt(i);
			}

			pw.println(str2);
			str2 = "";
		}

		scan.close();
		pw.close();
	}
}