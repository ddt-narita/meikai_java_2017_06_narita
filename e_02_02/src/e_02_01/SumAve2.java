/* 演習02-02
 * 3つのint型変数に値を代入して合計と平均を求める
 * 作成日：6月27日
 * 作成者：成田修之
 */


package e_02_01;

//合計と平均を求めるクラス
public class SumAve2 {

	//メインメソッド
	public static void main(String[] args) {
		int x;		//合計と平均を求める整数型変数xを宣言
		int y;		//合計と平均を求める整数型変数yを宣言
		int z;		//合計と平均を求める整数型変数zを宣言

		x = 43;		//変数xに合計と平均を求めたい値を代入
		y = 92;		//変数yに合計と平均を求めたい値を代入
		z = 56;		//変数zに合計と平均を求めたい値を代入

		//xに代入された値を表示
		System.out.println("xの値は" + x + "です。");
		//yに代入された値を表示
		System.out.println("yの値は" + y + "です。");
		//zに代入された値を表示
		System.out.println("zの値は" + z + "です。");
		//代入された3つの整数の合計を表示
		System.out.println("合計は" + (x + y + z) + "です。");
		//3つの整数の平均を表示
		System.out.println("平均は" + (x + y + z) / 3 + "です。");
	}

}
