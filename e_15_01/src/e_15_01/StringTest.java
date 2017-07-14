
/* 演習15-01
 * 文字列を読みこんでその文字列を逆順に表示sるプログラムの作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_01;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//文字列の入力を促す
		System.out.print("文字列：");
		//文字列を入力する
		String strMojiretu = "";
		strMojiretu = stdIn.next();

		//文字列の長さ分だけ繰り返す（逆順になるように長さでスタート）
		for(int i = strMojiretu.length() - 1; i >= 0;i--) {
			//文字列を逆順に表示していく
			System.out.print(strMojiretu.charAt(i));
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
