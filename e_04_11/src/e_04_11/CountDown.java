/* 演習04-11
 * 0までカウントダウンするテキストのプログラムをfor文で書き替え
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_11;

import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		
		//いくつからカウントダウンしたいか入力を促す
		System.out.print("整数値：");
		//カウントダウンしたい値を入力する
		int nInput = stdIn.nextInt();
		
		//入力された数が0になるまで繰り返す
		for(int i = nInput; i >= 0; i--) {
			//カウントダウンしていく値を表示
			System.out.println(i);
		}
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
