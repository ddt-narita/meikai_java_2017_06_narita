/* 演習04-10
 * アスタリスクを表示するプログラムを入力された値が1未満であれば、改行文字を出力しないように改良
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_10;

import java.util.Scanner;

public class PutAsterisk {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//アスタリスクを何個表示させるのか入力を促す表示
		System.out.print("何個表示しますか：");
		//何個表示させるのか入力
		int nInput = stdIn.nextInt();

		//なんこ表示させるのか入力された値分繰り返す
		for(int i = 0; i < nInput; i++) {
			//アスタリスクを表示する
			System.out.print('*');
		}

		//何個表示したいか入力された値が1以上の時だけ（1個未満の時は表示しない）
		if(nInput >= 1) {
			//改行文字を出力
			System.out.println();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
