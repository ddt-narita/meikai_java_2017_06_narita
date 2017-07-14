/* 演習15-03
 * 文字列探索のプログラムを書き換えて一致するっ分が上下でそろうように表示する
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_03;

import java.util.Scanner;

public class StringSearch {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//文字列s1の入力を促す
		System.out.print("文字列s1：");
		//文字列s1に入力する
		String s1 = stdIn.next();
		//文字列s1中から探したい文字列の入力を促す
		System.out.print("文字列s2：");
		//文字列s2に入力する
		String s2 = stdIn.next();

		//文字列s1中にある文字列s2の位置を保管
		int idx = s1.indexOf(s2);
		//文字列s1中に文字列s2が見つからなくて-1が保管されているとき
		if(idx == -1) {
			//含まれていないことを表示
			System.out.println("s1中にs2は含まれません。");
		//含まれているとき
		} else {
			//文字列s1を表示
			System.out.println("s1：" + s1);
			//s2についてもこれから表示する
			System.out.print("s2：");
			//見つかった位置まで空白で埋める
			for(int i = 0; i < idx; i++) {
				System.out.print(" ");
			}
			//文字列s2を表示する
			System.out.println(s2);
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
