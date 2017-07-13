/* 演習12-01
 * 走行距離のフィールドとその値を調べるメソッドを追加した自動車クラスを自動車クラスCar第2版から派生して作成
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_12_01;

import java.util.Scanner;

public class CarTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//走行距離をメンバに持つ自動車クラスのインスタンスを作成
		CarMileage myCar = new CarMileage("mycar",4321,434, 150, 45, new Day(2017,5,14));
		//繰り返すかどうかの入力に使われる変数
		int nRetry = 1;

		//Yesが入力され続ける限り繰り返す
		for(; nRetry == 1; ) {
			//x方向の移動距離の入力を促す
			System.out.print("x方向の移動距離：");
			//移動距離を入力
			double xMove = stdIn.nextDouble();
			//y方向の移動距離の入力を促す
			System.out.print("y方向の移動距離：");
			//y方向の移動距離を入力
			double yMove = stdIn.nextDouble();

			//入力された2つの値で親クラスのメソッドmoveを呼び出して移動
			if(!myCar.move(xMove, yMove)) {
				//falseが返ってきて移動できなかったときはそのことを表示
				System.out.println("移動できませんでした。");
			}

			//続けるかどうかの入力を促す
			System.out.print("終了しますか？1…Yes/0…No");
			//Yes/Noに当たる数値の入力
			nRetry = stdIn.nextInt();
		}
		//移動をやめた後それまでに移動した総走行距離を表示
		System.out.println("総走行距離は" + myCar.GetMileage() + "kmです。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
