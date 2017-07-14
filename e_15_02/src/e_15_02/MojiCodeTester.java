/* 演習15-02
 * 文字列を読みこんでその全文字の文字コードを表示するプログラムの作成
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_02;

import java.util.Scanner;

public class MojiCodeTester {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//文字列の入力を促す
		System.out.print("文字列：");
		//文字列を入力する
		String strMojiretu = stdIn.next();

		//入力された文字列の長さ分だけ繰り返す
		for(int i = 0; i < strMojiretu.length(); i++) {
			//文字列の全文字の文字コードを表示する
			System.out.print(strMojiretu.codePointAt(i) + " ");
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
