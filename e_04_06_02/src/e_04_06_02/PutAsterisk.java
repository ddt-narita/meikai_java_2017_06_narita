/* 演習04-06-02
 * 読み込んだ値が1未満であれば開業しないようにlist4-7とlist4-8を書き換え list4-8ver.
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_06_02;

import java.util.Scanner;

public class PutAsterisk {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//表示するアスタリスクの個数の入力を促す
		System.out.print("何個*を表示しますか：");
		//アスタリスクの個数を入力する
		int nInput = stdIn.nextInt();

		//カウントに使う変数を0で初期化
		int i = 1;

		//入力された値までカウントの変数がカウントするまで繰り返す
		while(i <= nInput) {
			//アスタリスクを表示することを入力された数だけ繰り返す
			System.out.print('*');
			//カウントのために一連の処理が終わったらインクリメントする
			i++;
		}

		//入力された値が1未満でなければ改行文字を出力する
		if(nInput >= 1) {
			//改行文字の出力
			System.out.println();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
