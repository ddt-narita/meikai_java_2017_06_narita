package e_07_08;


import java.util.Random;
import java.util.Scanner;


public class RandomA {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//これからやることと整数AとBの入力を促す
		System.out.println("入力された整数Aと整数Bの整数A以上整数B未満の乱数を生成します。");
		//小さいほうの整数Aの値の入力を促す
		System.out.print("整数A：");
		//小さいほうの値を入力
		int nInputA = stdIn.nextInt();
		//大きいほうの整数Bの値の入力を促す
		System.out.print("整数B：");
		//大きいほうの値を入力
		int nInputB = stdIn.nextInt();

		//メソッドrandomで入力された整数A以上整数B未満の乱数を表示する
		System.out.println(random(nInputA, nInputB));

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	static int random(int a, int b) {
		//ランダムな値を生成するクラスのインスタンスを生成
		Random rand = new Random();
		//引数Bから引数Aの差未満のランダムな値を生成
		int nLucky = rand.nextInt(b - a);
		//返却に使う変数にできたランダムな値と小さいほうの引数Aを足して引数A以下引数B未満のランダムな値にする
		int nReturn = nLucky + a;
		//もし引数Bの値が引数Aより小さいときは
		if(a > b) {
			//引数Aをそのまま返却するようにする
			nReturn = a;
		}

		//返却するランダムな値か引数Aの値を返却
		return nReturn;
	}


}
