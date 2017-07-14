/* 演習15-07
 * コマンドライン引数に与えられたすべての数値を加算するプログラムのfor文を拡張for文で実現
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_07;

public class SumOfArgs {

	//
	public static void main(String[] args) {

		//合計を求めるための変数
		double sum = 0.0;
		//コマンドライン引数の配列を最後まで繰り返す
		for(String s : args) {
			//各要素の数値の文字列をdouble型に直して加算
			sum += Double.parseDouble(s);
		}
		//求めた合計を表示
		System.out.println("合計は" + sum + "です。");

	}

}
