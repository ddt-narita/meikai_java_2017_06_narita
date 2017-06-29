/* 演習04-09
 * 整数値nを読み込んで1からnまでの積を求める
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_09;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//いくつまでの積を求めたいか値を入力
		System.out.print("nの値：");
		//いくつまで求めたいかキーボードから入力
		int nInput = stdIn.nextInt();

		//カウントするための変数
		int i = 1;
		//積を入力していくための変数。積なので１で初期化
		int nProduct = 1;
		//いくつまで求めるか入力された回数分繰り返す
		while(i <= nInput) {
			//各値をかけて代入
			nProduct *= i;
			//インクリメントして次の値へ
			i++;
		}

		//求めて出てきた積を表示する
		System.out.println("1から" + nInput + "までの積は" + nProduct + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
