/* 演習14-02
 * ロボット型ペットクラスRobotPetを拡張する。インターフェースSkinnableを実装してきせかえできるように
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_14_02;

import java.util.Scanner;

public class PetTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//RobotPetクラスのインスタンスを作成
		RobotPet r2d2 = new RobotPet("R2D2", "ルーク");
		//作ったインスタンスについて情報を表示する
		r2d2.introduce();

		//変更したいスキンの色の入力を促す
		System.out.print("スキンを変更します。0…黒/1…赤/2…緑/3…青/4…ヒョウ柄/5…変化なし：");
		//変更したい色を入力
		int nSkin = stdIn.nextInt();
		//入力された色でメソッドchangeSkinをよんで色変更
		r2d2.changeSkin(nSkin);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
