/* 演習06-05
 * 配列の要素数と、個々の要素の値を読み込んで各要素の値を表示するプログラムの作成
 * 作成日：6月303日
 * 作成者：成田修之
 */

package e_06_05;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		
		//配列の要素数の入力を促す
		System.out.print("要素数：");
		//要素数を入力
		int nArrayNumber = stdIn.nextInt();
		
		//要素数分の配列を生成
		int[] nArray = new int[nArrayNumber];
		
		//要素数分だけ繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//配列の各要素に値の入力を促す
			System.out.print("nArray[" + i + "] = ");
			//各要素に値を入力
			nArray[i] = stdIn.nextInt();
		}
		
		//入力された配列の要素を演習にそって表示する。始まりの配列の名前と先頭のかっこを表示
		System.out.print("nArray = {");
		//要素数分だけ繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//最後の要素かどうかで分岐
			switch(i == nArrayNumber - 1 ? 1 : 0) {
			//最後のではないとき要素の値とカンマを表示
			case 0: System.out.print(nArray[i] + ", "); break;
			//最後の値の時は要素の値と締めカッコを表示
			case 1: System.out.print(nArray[i] + "}"); break;
			}
		}
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
