/* 演習04-13
 * 1からnまでの和を求めるプログラムをfor文で実現するように書き換え
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_13;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//1からいくつの値までの和を求めたいか入力を促す
		System.out.print("nの値：");
		//いくつまでの和を求めたいか入力
		int nInput = stdIn.nextInt();

		//積を求めるための変数
		int nProduct = 0;
		//入力された値分繰り返す
		for(int i = 1; i <= nInput; i++) {
			//1から順に入力された値まで加算していく
			nProduct += i;
		}

		//1から入力された値までの和を表示する
		System.out.println("1から" + nInput + "までの積は" + nProduct + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
