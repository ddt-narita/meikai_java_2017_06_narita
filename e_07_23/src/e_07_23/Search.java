/* 演習07-23
 * 配列の要素の中で値がxである配列中の全要素の添え字を先頭から順に格納した配列を返却するメソッド
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_23;

import java.util.Random;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();

		//配列の要素数の入力を促す
		System.out.print("配列Aの要素数：");
		//要素数を入力する
		int nArrayNumberA = stdIn.nextInt();

		//入力された要素数の配列をとる
		int[] nArrayA = new int[nArrayNumberA];

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumberA; i++) {
			//各要素に0から9のランダムな値を代入する
			nArrayA[i] = rand.nextInt(10);
		}

		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayNumberA; i++) {
			//配列の全要素を表示
			System.out.printf("nArrayA[%2d] = " + nArrayA[i] + "\n",i);
		}
		//入力された配列から探したい値を入力する
		System.out.print("探したい値：");
		//探したい値を入力
		int nKey = stdIn.nextInt();

		//メソッドarraySrchIdxを使って配列Aから探したい値のある添え字を格納した配列を作成
		int[] nArrayAId = arraySrchIdx(nArrayA, nKey);

		//アがしている値が配列の添え字としてどこにあるかを表示
		System.out.print("その値は配列の添え字\n{");
		//添え字の配列の最後の要素を除いた要素数分だけ繰り返す
		for(int i = 0; i < nArrayAId.length - 1; i++) {
			//その添え字と区切りを表示
			System.out.print(nArrayAId[i] + ", ");
		}
		//最後の要素だけは添字とかっこの閉じを表示
		System.out.println(nArrayAId[nArrayAId.length - 1] + "}\nにあります。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//引数の配列から引数の値と同値の要素の添え字を格納した配列を返却するメソッド
	static int[] arraySrchIdx(int[] a, int x) {
		//引数の値と同値である要素の個数を数える変数
		int nArrayIdCount = 0;
		//引数の配列の要素数分だけ繰り返す
		for(int i = 0; i < a.length; i++) {
			//もし引数の値と同じ値なら
			if(a[i] == x) {
				//その値の個数を数える
				nArrayIdCount++;
			}
		}
		//数え上げた個数の長さの配列を取る
		int[] nArrayId = new int[nArrayIdCount];
		//数える変数を添字を数えるのに使うため配列を0でリセット
		nArrayIdCount = 0;
		//引数の配列の要素数分だけ繰り返す
		for(int i = 0; i < a.length; i++) {
			//引数の値と同じ要素があるなら
			if(a[i] == x) {
				//その要素の添え字を格納する
				nArrayId[nArrayIdCount++] = i;
			}
		}
		//添字を格納した配列の参照を返却する
		return nArrayId;
	}
}
