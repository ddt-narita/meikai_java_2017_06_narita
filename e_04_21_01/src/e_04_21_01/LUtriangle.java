/* 演習04-21-01
 * 左上直角三角形を表示する
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_21_01;

import java.util.Scanner;

public class LUtriangle {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//何段の左上直角三角形を表示するか入力を促す表示
		System.out.print("何段表示しますか：");
		//何段表示するか入力
		int nTriangle = stdIn.nextInt();

		//段数分繰り返す
		for(int i = 0; i < nTriangle; i++) {
			//i段目に段数引くi個表示されるように繰り返す
			for(int j = nTriangle - i; j > 0; j--) {
				//アスタリスクを表示する
				System.out.print('*');
			}
			//一行ごとに改行する
			System.out.println();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
