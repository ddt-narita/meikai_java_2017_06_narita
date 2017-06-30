/* 演習05-03
 * 論理型変数にtrueやfalseを代入してその値を表示するプログラム
 * 作成日：6月30日
 * 作成者：成田修之
 */
package e_05_03;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//論理型変数の入力を促す
		System.out.print("論理型変数x：");
		//論理型変数に入力する
		boolean blnInput = stdIn.nextBoolean();

		//入力された論理型変数の値を表示
		System.out.println("入力された論理型変数は：" + blnInput);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
