/* 演習08-01
 * 名前身長体重などをメンバとして持つ人間クラスの作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_08_01;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		//名前の入力を促す
		System.out.print("名前：");
		//名前を入力
		String strName = stdIn.next();
		//身長の入力を促す
		System.out.print("身長：");
		//身長を促す
		int nHeight = stdIn.nextInt();
		//体重の入力を促す
		System.out.print("体重：");
		//体重を入力
		int nWeight = stdIn.nextInt();

		//入力された名前身長体重でクラスHuman型のオブジェクトを生成する
		Human yourData = new Human(strName, nHeight, nWeight);

		//終了に相当する値が入力され、break文によってループを抜けるまで繰り返す
		for(;true;) {
			//何を行うか入力を促す表示
			System.out.println("何を表示しますか");
			//行うことに相当する値を表示
			System.out.print("1…名前/2…身長/3…体重/4…標準体重/5…全情報を表示/0…終了：");
			//何を行うかを入力する
			int nHandle = stdIn.nextInt();
			//入力された値が0で終了であるとき
			if(nHandle == 0) {
				//ループを抜け終了する
				break;
			}

			//入力された値によって分岐する
			switch(nHandle) {
			//インスタンスメソッドgetNameを使って名前を表示
			case 1: System.out.println("名前は" + yourData.getName()   + "です。"); break;
			//インスタンスメソッドgetHeightを使って身長を表示
			case 2: System.out.println("身長は" + yourData.getHeight() + "です。"); break;
			//インスタンスメソッドgetWeightを使って体重を表示
			case 3: System.out.println("体重は" + yourData.getWeight() + "です。"); break;
			//インスタンスメソッドgetStdHeightを使ってyourDataオブジェクトの身長での標準体重を表示
			case 4: System.out.println("あなたの身長での標準体重は" + yourData.getStdHeight() + "です。"); break;
			//インスタンスメソッドdisplayAllを使ってオブジェクトyourDataの全情報を表示
			case 5: yourData.displayAll();
			}
		}
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
