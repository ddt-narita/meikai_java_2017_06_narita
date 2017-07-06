/* 演習10-03
 * 2値3値配列の最小値や最大値を求めるメソッドを集めたユーティリティクラスを作成する
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_10_03;

public class MinMax {

	//2値の最小値を求めるメソッド
	public static int min(int a, int b) {
		//2つの引数のうち小さいほうを返却
		return a < b ? a : b;
	}

	//3値の最小値を求めるメソッド
	public static int min(int a, int b, int c) {
		//返却する最小値をaで初期化
		int min = a;
		//bがその時点での最小値より小さいとき
		if(b < min) {
			//最小値をbに更新
			min = b;
		}
		//cがその時点での最小値より小さいとき
		if(c < min) {
			//最小値をcに更新
			min = c;
		}
		//最終的な最小値を返却する
		return min;
	}

	//配列の全要素のうち最小の値を返却するメソッド
	public static int min(int[] a) {
		//返却に使う最大値を先頭要素で初期化
		int min = a[0];
		//配列の要素数分だけ繰り返す
		for(int i = 0; i < a.length; i++) {
			//各要素がその時点での最小値より小さいとき
			if(a[i] < min) {
				//最小値をその要素の値に更新する
				min = a[i];
			}
		}
		//最終的な最小値を返却
		return min;
	}

	//2値のうち最大値を返却するメソッド
	public static int max(int a, int b) {
		//aとbの大きいほうを返却するメソッド
		return a > b ? a : b;
	}

	//3値のうち最大値を返却するメソッド
	public static int max(int a, int b, int c) {
		//返却に使う最大値をaで初期化
		int max = a;
		//bが最大値より大きいとき
		if(b > max) {
			//最大値をbに更新
			max = b;
		}
		//cが最大値より大きいとき
		if(c > max) {
			//最大値をcに更新
			max = c;
		}
		//最終的な最大値を返却する
		return max;
	}

	//配列の全要素中の最大値を返却するメソッド
	public static int max(int[] a) {
		//返却する最大値をとりあえず先頭の要素で初期化
		int max = a[0];
		//配列の要素数分だけ繰り返す
		for(int i = 0; i < a.length; i++) {
			//その時の要素がその時点での最大値より大きいとき
			if(a[i] > max) {
				//最大値をその要素で更新
				max = a[i];
			}
		}
		//最終的な最大値を返却
		return max;
	}

}
