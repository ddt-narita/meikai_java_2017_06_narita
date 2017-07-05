/* 演習09-01
 * 人間クラスの配列を生成するプログラムの作成
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_09_01;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		//何人の配列を作るかを入力
		System.out.print("何人ですか：");
		int nHumanNumber = stdIn.nextInt();
		//入力された数分の配列を取る
		Human[] humanArrayA = new Human[nHumanNumber];

		//配列の要素数分だけ繰り返す
		for(int i = 0; i < nHumanNumber; i++) {
			//何人目についての情報かを表示
			System.out.println(i + 1 + "人目");
			//名前の入力
			System.out.print("名前：");
			String name = stdIn.next();
			//身長の入力
			System.out.print("身長：");
			int nHeight = stdIn.nextInt();
			//体重の入力
			System.out.print("体重：");
			int nWeight = stdIn.nextInt();

			//入力された情報で配列の各要素にHumanクラスのオブジェクトを作成
			humanArrayA[i] = new Human(name, nHeight, nWeight);
		}
		System.out.println("配列A");
		//配列の要素数分繰り返す
		for(int i = 0; i < humanArrayA.length; i++) {
			//メソッドdisplayAllで各要素の情報を表示
			humanArrayA[i].displayAll();
		}
		//配列Aについて情報を表示した後改行を行う
		System.out.println();

		//Humanクラスの配列を初期化によって生成
		Human[] humanArrayB = {
				new Human("成田", 176, 67),
				new Human("田中", 170, 59),
				new Human("中野", 181, 74),
		};

		//配列Bについての情報であることを明示
		System.out.println("配列B");
		//要素数分繰り返す
		for(int i = 0; i < humanArrayB.length; i++) {
			//メソッドdisprayAllで各要素の情報を表示
			humanArrayB[i].displayAll();
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
