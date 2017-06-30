/* 演習06-07
 * 探索するキー値と同じ値が複数あった時に最も末尾側の要素を見つけるプログラムの作成
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_07;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		//ランダムな値を生成するクラスのインスタンスを生成する
		Random rand = new Random();
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//配列の要素数
		final int nArrayNumber = 8;
		//要素数分の配列を確保
		int [] nArray = new int[nArrayNumber];

		//配列の要素数分繰り返す
		for(int j = 0; j < nArrayNumber; j++) {
			//各配列の要素に0から9のランダムな値を入力
			nArray[j] = rand.nextInt(10);
		}

		//配列の全要素の値を表示することを明示
		System.out.print("配列nArrayの全要素の値\n{");

		//配列の要素数分繰り返す
		for(int j = 0; j < nArrayNumber; j++) {
			//配列の各要素と空白を表示
			System.out.print(nArray[j] + " ");
		}
		//締めのかっこを表示
		System.out.println("}");

		//配列の中から探したい要素の入力を促す
		System.out.print("探す数値：");
		//探したい値を入力
		int nKey = stdIn.nextInt();

		//ループのカウントと探し出した値の位置をの情報を持つ変数
		int i;
		//配列の末尾側から添え字が0以下になるまで繰り返す
		for(i = nArrayNumber - 1; i > 0; i--) {
			//探していた値と一致したとき
			if(nArray[i] == nKey) {
				//ループを抜ける
				break;
			}
		}

		//ループを抜けたときの配列の添え字の値が0以上（探したい値が配列中にあった時）
		if(i > 0 ) {
			//探していた値があったこととその値の位置を表示する
			System.out.println("それはnArray[" + i + "]にあります。");
		//ループを抜けたときの配列の添え字が0（探していた値が見つからなかったとき）
		} else {
			//探していた値がなかったことを表示
			System.out.println("それはありません。");
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
