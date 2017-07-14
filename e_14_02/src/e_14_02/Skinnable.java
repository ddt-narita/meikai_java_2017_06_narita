/* 演習14-02
 * ロボット型ペットクラスRobotPetを拡張する。インターフェースSkinnableを実装してきせかえできるように
 * 作成日：7月14日
 * 作成者：成田修之
 */


package e_14_02;

//きせかえのインターフェース
public interface Skinnable {

	int BLACK = 0;		//黒の時の値
	int RED = 1;		//赤の時の値
	int GREEN = 2;		//緑の時の値
	int BLUE = 3;		//青の時の値
	int LEOPARD = 4;	//ヒョウ柄の時の値
	//きせかえするメソッド
	void changeSkin (int skin);

}
