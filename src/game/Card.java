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
		System.out.print(getPrintNum());
	}

	/**
	 * 出力用の番号を取得する
	 *
	 * @return
	 */
	private String getPrintNum() {
		if (this.num >= 10) {
			return Integer.toString(this.num);
		}
		return "0" + Integer.toString(this.num);
	}

	/**
	 * ステータスを出力する
	 *
	 * @param i
	 *            選択番号
	 *
	 * @return
	 */
	public void printStatus(int i) {
		if (this.status_hold) {
			System.out.print("[" + i + "：●残す]");
		} else {
			System.out.print("[" + i + "：〇配る]");
		}
	}

	/**
	 * ステータスを変更する
	 */
	public void changeStatus() {
		this.status_hold = !this.status_hold;
	}

}
