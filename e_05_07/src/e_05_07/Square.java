/* 演習05-07
 * 0.0から1.0まで0.001沖にその値とその値の2乗を表示するプログラムの作成
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_05_07;

public class Square {

	public static void main(String[] args) {
		//xとxの2乗を表示する
		System.out.printf("%7s %7s","x", "xの2乗");
		//区切りの改行
		System.out.println();
		
		//仕切りの出力
		for(int i = 0; i < 24; i++) {
			//仕切り-を表示
			System.out.print("-");
		}
		
		//区切りの改行
		System.out.println();
		
		//1000回繰り返す
		for(int i = 0; i <= 1000; i++) {
			//int型をfloat型にキャストして1000でわって0.001ずつ増えていく様子を表示
			float fInterval = (float)i / 1000;
			//その値とその値の2乗を表示
			System.out.printf("%8f %8f\n", fInterval, fInterval * fInterval);
		}
	}

}
