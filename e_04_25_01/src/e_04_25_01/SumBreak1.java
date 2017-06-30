/* 演習04-25-01
 * 合計だけではなく平均も求められるようにlist4-17とlist4-18を書き換え 04-18ver.
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_25_01;

import java.util.Scanner;

public class SumBreak1 {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//いくつの整数を加算するのか入力を促す変数
		System.out.print("整数を加算します\n何個加算しますか：");
		//何個加算するのか入力
		int nNumber = stdIn.nextInt();

		//合計を求める変数
		int nSum = 0;

		//平均を求めるために加算した数を数える変数
		int nCount = 0;

		//何個か入力された値分繰り返す。
		for(int i = 0; i < nNumber; i++) {

			//整数の入力と0で加算を終了することを明示
			System.out.print("整数（0で終了）：");
			//加算する値を入力
			int nInput = stdIn.nextInt();
			//入力された値が0の時
			if(nInput == 0) {
				//ループを抜ける
				break;
			}
			//入力された値が0ではないとき加算した値を求める変数に加算
			nSum += nInput;
			//平均を求めるための変数も1増やす
			nCount++;
		}

		//求めた合計と平均を表示
		System.out.println("合計は" + nSum + "平均は" + nSum / nCount + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
