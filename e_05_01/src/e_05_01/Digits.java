/* 演習05-01
 * 10進数整数を読み込んでその値を8進数と16進数で表示するプログラムの作成
 * 作成日：6月29日
 * 作成者：成田修之
 */
package e_05_01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] arg) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//8進数16進数に直したい10進数整数を入力
		System.out.print("10進数整数：");
		//変換したい10進数整数を入力
		int nInput = stdIn.nextInt();

		//入力された10進数整数を8進数に直して表示
		System.out.printf("8進数では%oです\n", nInput);
		//入力された10進数整数を16進数に直して表示
		System.out.printf("16進数では%xです\n", nInput);

		//標準出力ストリームをクローズ
		stdIn.close();
	}
}
