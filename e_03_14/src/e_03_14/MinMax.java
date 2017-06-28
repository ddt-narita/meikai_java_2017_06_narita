/* 演習03-14
 * 2つの整数値を読み込んで同じ値ならそのことを、そうでなければ最大値最小値を表示
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_03_14;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//整数Aに入力を促す
		System.out.print("整数A：");
		//判定したい値をキーボードから入力
		int nInputA = stdIn.nextInt();

		//整数Bに入力を促す
		System.out.print("整数B：");
		//判定したい値をキーボードから入力
		int nInputB = stdIn.nextInt();
		
		//入力された2つの値が同値の時
		if(nInputA == nInputB) {
			//同じ値であることを表示
			System.out.println("2つの値は同じです。");
		//同値ではないとき
		} else {
			//入力された2つの値の小さいほうを格納
			int nMin = nInputA < nInputB ? nInputA : nInputB;
			//入力された2つの値の大きいほうを格納
			int nMax = nInputA > nInputB ? nInputA : nInputB;
			
			//大きいほうの値を表示
			System.out.println("大きいほうの値は" + nMax + "です。");
			//小さいほうの値を表示
			System.out.println("小さいほうの値は" + nMin + "です。");
		}
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
