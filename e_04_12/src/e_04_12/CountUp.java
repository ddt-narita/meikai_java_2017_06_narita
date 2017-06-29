/* 演習04-12
 * 0からカウントアップしていくプログラムの作成
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_12;

import java.util.Scanner;

public class CountUp {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//いくつまでカウントアップしたいか入力をうながす
		System.out.print("整数値：");
		//カウントアップしたい値を入力
		int nInput = stdIn.nextInt();

		//入力された値分繰り返す
		for(int i = 0; i <= nInput; i++) {
			//0からインクリメントしてカウントアップしていくiを表示する
			System.out.println(i);
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
