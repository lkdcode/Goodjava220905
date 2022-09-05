import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		int i, k;

		PrintWriter pw = new PrintWriter("c:/temp/gugu.txt");			// 파일에 쓰기 위해 PrintWriter 인스턴스 준비
		String str = "";

		for (i = 2; i <= 9; i++)						//맨 위에 단의 제목을 출력하기 위해 str 변수에 누적
			str += " #제" + i + "단#";

		pw.println(str);								//str의 내용을 파일에 쓴다.
		pw.println();									//빈칸 출력
		str = "";

		for (i = 1; i <= 9; i++) {
			for (k = 2; k <= 9; k++) {
				str += String.format("%2dX%2d=%2d", k, i, k * i);		//String.format() 메소드는 형식에 맞춘 문자열을 만든다.
			}
			pw.println(str);
			str = "";
		}
		pw.close();
	}
}