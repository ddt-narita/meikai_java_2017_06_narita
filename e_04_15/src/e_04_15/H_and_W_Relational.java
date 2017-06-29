/* 演習04-15
 * 身長と標準体重の対応表を表示するプログラムの作成。表示する身長の範囲は入力から求める
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_15;

import java.util.Scanner;

public class H_and_W_Relational {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		int nStart;		//始まりの身長を入力するための変数
		int nEnd;			//終わりの身長を入力するための変数
		int nInterval;	//標準体重を表示する間隔を入力するための変数

		do{
			//始まりの身長の入力を促す表示
			System.out.print("何㎝から：");
			//キーボードから始まりの身長の値を入力
			nStart = stdIn.nextInt();
		//標準体重の計算式より100cm以下は意味がないので除外して不正な値が入力される限り繰り返す
		} while(nStart < 100 || nStart > 250);

		do{
			//終わりの身長の入力を促す
			System.out.print("何㎝まで：");
			//キーボードから終わりの身長を入力
			nEnd = stdIn.nextInt();
		//始まりの身長以下の身長が入力されるか不正な値が入力される限り繰り返す
		} while(nEnd <= nStart || nStart > 250);

		do {
			//標準体重を求める間隔の入力を促す表示
			System.out.print("何㎝ごと：");
			//キーボードから表示する間隔を入力
			nInterval = stdIn.nextInt();
		//始まりと終わりの身長差以上の値が入力される限り繰り返す
		}while(nInterval > (nEnd -nStart));

		//身長と標準体重といった表示する属性を表示
		System.out.println("身長 標準体重");

		//始まりの身長の値から入力された間隔分ずつ増やして終わりの身長の値以上になるまで繰り返す
		for(int i = nStart; i <= nEnd; i += nInterval) {
			//身長とそれに対応する標準体重を表示する
			System.out.println(i + "  " + ((i - 100) * 0.9));
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
