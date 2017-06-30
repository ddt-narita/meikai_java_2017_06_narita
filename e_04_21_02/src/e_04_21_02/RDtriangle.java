/* 演習04-21-02
 * 右下直角三角形を表示する
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_21_02;

import java.util.Scanner;

public class RDtriangle {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		
		//何段の右下直角三角形を表示するか入力を促す表示
		System.out.print("何段表示しますか：");
		//何段表示するか入力
		int nTriangle = stdIn.nextInt();
		
		//段数分繰り返す
		for(int i = 1; i <= nTriangle; i++) {
			//同じだけ繰り返す
			for(int j = 1; j <= nTriangle; j++) {
				//一辺の長さから段数引いた数開ける
				if(j <= nTriangle - i) {
					//空白を表示
					System.out.print(' ');
				//段数引いた分より大きいときアスタリスクを表示する
				} else {
					//アスタリスク表示
					System.out.print('*');
				}
			}
			//一行ごとに改行する
			System.out.println();
		}
		
		//標準出力ストリームをクローズ
		stdIn.close();
		
	}

}
