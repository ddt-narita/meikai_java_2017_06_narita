/* 演習15-06
 * コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示するプログラム
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_06;

public class Circle {

	public static void main(String[] args) {

		//円周率の定数
		final double PI = 3.14;

		//円の半径にコマンドライン引数で受け取った数値の文字列をdouble型の値に直して代入
		double dblRadius = Double.parseDouble(args[0]);

		//円の円周の長さを求める
		double dblCircumference = 2 * PI * dblRadius;
		//円の面積を求める
		double dblCirclArea = PI * dblRadius * dblRadius;

		//求めた円周の長さを表示
		System.out.printf("円周の長さ：%1.2f\n",dblCircumference);
		//求めた円の面積を表示
		System.out.printf("円の面積：%1.2f\n", dblCirclArea);

	}

}
