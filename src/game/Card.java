package game;

/**
 * カード
 */
public class Card {

	/**
	 * 絵柄
	 */
	public int pic;

	/**
	 * 番号
	 */
	public int num;

	/**
	 * 絵柄文字列
	 */
	public String picStr;

	/**
	 * 番号文字列
	 */
	public String numStr;

	/**
	 * のこすステータスか
	 */
	public boolean status_hold = false;

	/**
	 * カード出力
	 */
	public void printCard() {
		System.out.print(this.picStr);
		System.out.print(this.num);
	}

	/**
	 * ステータスを出力する
	 *
	 * @return
	 */
	public void printStatus() {
		if (this.status_hold) {
			System.out.print("[残す]");
		}
		System.out.print("[配る]");
	}

	/**
	 * ステータスを変更する
	 */
	public void changeStatus() {
		this.status_hold = !this.status_hold;
	}

}
