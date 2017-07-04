/* 演習07-27
 * 2つのint型整数、3つのint型整数、配列aの最小値を求める多重定義されたメソッド群の作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_27;

import java.util.Random;
import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();

		int nNumberA = rand.nextInt(10);				//整数Aに0から9のランダムな値を代入
		System.out.println("整数A：" + nNumberA);		//整数Aの値を表示
		int nNumberB = rand.nextInt(10);				//整数Bに0から9のランダムな値を代入
		System.out.println("整数B：" + nNumberB);		//整数Bの値を表示
		int nNumberC = rand.nextInt(10);				//整数Cに0から9のランダムな値を代入
		System.out.println("整数C：" + nNumberC);		//整数Cの値を表示

		//配列の要素数の入力を促す
		System.out.print("配列の要素数：");
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
			System.out.printf("nArray[%2d] = " + nArray[i] + "\n",i);
		}

		//オーバーロードされたメソッドminを使って2つの整数値の最小値を表示
		System.out.println("整数Aと整数Bの最小値は" + min(nNumberA, nNumberB) + "です。");
		//オーバーロードされたメソッドminを使って3つの整数値の最小値を表示
		System.out.println("整数Aと整数Bと整数Cの最小値は" + min(nNumberA, nNumberB,nNumberC) + "です。");
		//オーバーロードされたメソッドminを使って配列の要素の中の最小値を表示
		System.out.println("配列Aの最小値は" + min(nArray) + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();

	}

	//2つの引数の最小（小さいほう）値を返却するメソッド
	static int min(int a, int b) {
		//aのほうが小さいならa、bのほうが小さいならbを返却する
		return a < b ? a : b;
	}

	//3つの引数の最小値を返却するメソッド
	static int min(int a, int b, int c) {
		//返却する最小の値をとりあえず最初はaで初期化
		int min = a;
		//bが現在の最小値より小さいとき
		if(b < min) {
			//最小値をbに更新
			min = b;
		}
		//cが現在の最小値より小さいとき
		if(c < min) {
			//最小値をcに更新
			min = c;
		}
		//最終的な最小値を返却する
		return min;
	}

	//配列の要素の中の最小値を返却するメソッド
	static int min(int[] a) {
		//返却する最小の値をとりあえず先頭の要素で初期化
		int min = a[0];
		//引数の配列の要素数分だけ繰り返す
		for(int i = 0; i < a.length; i++) {
			//要素中に現在の最小値より小さい値があるなら
			if(a[i] < min) {
				//最小値をその値に更新
				min = a[i];
			}
		}
		//最終的な最小値を返却
		return min;
	}
}
