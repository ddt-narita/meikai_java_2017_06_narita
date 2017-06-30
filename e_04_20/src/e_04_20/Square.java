/* 演習04-20
 * n段の正方形を表示するプログラム
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_20;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//正方形の一辺の長さの入力を促す。
		System.out.print("何段表示しますか：");
		//一辺の長さを入力
		int nSquare = stdIn.nextInt();

		//入力された長さ分だけ繰り返す
		for(int i = 0; i < nSquare; i++) {
			//正方形なので同じく入力された値分横の長さとして繰り返す
			for(int j = 0; j < nSquare; j++) {
				//アスタリスクを表示
				System.out.print('*');
			}
			//一行ごとに改行を行う
			System.out.println();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
