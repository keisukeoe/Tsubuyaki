//つぶやきに関する情報を持つJavaBeans
package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	private String userName; //ユーザー名
	private String text; //つぶやき

	public Mutter() {} //デフォルトコンストラクタ
	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
	}
	public String getUserName() {
		return userName;
	}
	public String getText() {
		return text;
	}



}
