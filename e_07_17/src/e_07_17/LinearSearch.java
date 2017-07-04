/* 演習07-17
 * 配列の最も末尾側に位置する要素を見つけるメソッドの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_17;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();

		//配列の要素数の入力を促す
		System.out.println("配列の要素数：");
		//要素数を入力する
		int nArrayNumber = stdIn.nextInt();

		//入力された要素数の配列をとる
		int[] nArray = new int[nArrayNumber];

		//要素数分繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素に0から9のランダムな値を代入する
			nArray[i] = rand.nextInt(10);
		}

		//要素数分だけ繰り返して全要素を表示
		for(int i = 0; i < nArrayNumber; i++) {
			//配列の全要素を表示
			System.out.println("nArray[" + i + "] = " + nArray[i]);
		}

		//入力された配列から探したい値を入力する
		System.out.print("探したい値：");
		//探したい値を入力
		int nKey = stdIn.nextInt();

		//メソッドlinearSearchRを使って最も末尾側の探したい値がどこかを表示
		System.out.println("その値が出てくる最も末尾側の要素はnArray[" + linearSearchR(nArray,nKey) + "]です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//探したい値が出てくる最も末尾側の要素を返却するメソッド
	static int linearSearchR(int[] a, int key) {
		//返却する探したい値の添え字
		int nArraySub = 0;
		//探すのに使う配列の要素数分だけ末尾側から繰り返す
		for(int i = a.length; i > 0; i++) {
			//もしその要素が探している値と同値なら
			if(a[i] == key) {
				//その時の添え字を格納して
				nArraySub = i;
				//ループを抜ける
				break;
			}
		}

		//探している要素の添え字を返却する
		return nArraySub;
	}

}
