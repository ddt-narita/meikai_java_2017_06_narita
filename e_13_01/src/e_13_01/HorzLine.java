package e_13_01;

public class HorzLine extends AbstLine{

	//コンストラクタ
	public HorzLine(int length) {
		//親クラスのコンストラクタで初期化
		super(length);
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//図形情報を文字列表現で返却する
		return "HorzLine(length:" + getLength() + ")";
	}

	//図形を描画するメソッド
	public void draw() {
		//直線の長さ分だけ繰り返す
		for(int i = 1; i <= getLength(); i++) {
			//横線を表示する
			System.out.print('-');
		}
		//表示し終えたら改行する
		System.out.println();
	}


}
