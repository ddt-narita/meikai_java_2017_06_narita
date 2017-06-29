/* 演習04-17
 * 読み込んだ値の約数をすべて表示してその個数を最後に表示する
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_17;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		
		//約数とその個数を求めたい値の入力を促す
		System.out.print("整数値：");
		//求めたい値を入力
		int nInput = stdIn.nextInt();
		//約数の個数を数えるための変数
		int nCount = 0;
		
		//入力された値まで繰り返して約数を探す
		for(int i = 1; i <= nInput; i++) {
			//割り切れる時（その数が入力された値の約数であるとき）
			if(nInput % i == 0) {
				//その約数の値を表示する
				System.out.println(i);
				//約数があったのでその個数を数える変数を1増やす
				nCount++;
			}
		}
		
		//約数をすべて表示できたら求めたその個数を表示する
		System.out.print("約数の個数は" + nCount + "個です。");
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
