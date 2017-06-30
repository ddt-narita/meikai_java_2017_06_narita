/* 演習04-25-01
 * 合計だけではなく平均も求められるようにlist4-17とlist4-18を書き換え 04-18ver.
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_25_02;

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
		int i;

		//何個か入力された値分繰り返す。
		for( i = 1; i < nNumber;) {

			//整数の入力と0で加算を終了することを明示
			System.out.print("整数：");
			//加算する値を入力
			int nInput = stdIn.nextInt();

			//それまでの合計と入力された値が1000を超える時
			if(nSum + nInput > 1000) {
				//1000を超えたことと最後の値に関しては加算しないことを明示
				System.out.println("合計が1000を超えました。\n最後の値は無視します。");
				//ループを抜ける
				break;
			}

			//1000を超えないとき加算した値を求める変数に加算
			nSum += nInput;
			//平均を求める変数を加算がされたときは1増やす
			i++;
		}

		//求めた合計と平均を表示
		System.out.println("合計は" + nSum + "平均は" + nSum / i + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();

	}

}
