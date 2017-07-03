/* 演習07-09
 * 正の整数値を読み込んでその値を返却する
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_09;

import java.util.Scanner;

public class ReadPlusInt {

	//クラス内なら使える標準出力ストリームのインスタンスを作成
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {

		//正の値の入力を促す表示
		System.out.println("正の値を入力してください");
		//メソッドreadPlusIntを使って入力された値に10足した値を格納する
		int nPlus10 = readPlusInt() + 10;

		//格納した10足された値を表示する
		System.out.print("入力された値に10足した数は" + nPlus10 + "です。");
	}

	static int readPlusInt() {

		//正の整数値を入力するための変数。for文に入るために-1で初期化
		int nInput = -1;
		//入力された値が0以下の限り繰り返す
		for(;nInput <= 0 ;) {
			//正の整数値の入力を促す
			System.out.print("正の整数値：");
			//正の整数値を入力する
			nInput = stdIn.nextInt();
		}

		//入力された0より大きい値を返却する
		return nInput;
	}

}
