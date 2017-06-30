/* 演習05-06
 * float型の変数を0.001ずつ増やしていく様子とint型をインクリメントした値を1000で割った値を横にならべて表示
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_05_06;

public class Increment {

	public static void main(String[] args) {

		//floatでのインクリメントとint型でのインクリメントを見分けるように表示
		System.out.printf("%7s %7s","float","int"+ "\n");

		//仕切りを表示する
		for(int i = 0; i < 24; i++) {
			//仕切りを出したい分だけ表示
			System.out.print('-');
		}

		//仕切りの後、改行する
		System.out.println();
		//int型でインクリメントするための変数
		int j = 0;
		//1000回繰り返す
		for(float i = 0.0F; i <= 1.0F && j <= 1000; i += 0.001F, j++) {
			//int型のインクリメントされた変数を1000でわる
			float fNumber = (float)(j) / 1000;
			//float型とint型の値を表示する
			System.out.printf("%8f   %8f\n",i,fNumber);
		}
	}

}
