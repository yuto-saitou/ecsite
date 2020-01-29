package com.internousdev.template.dto;

public class LoginDTO {
	private String loginId;
	private String loginPassword;//格納する型と変数を指定している
	private String userName;
	private boolean loginFlg =false;//booleanは真偽値のデータ型初期値にfalse


/*以下はgetterとsetterのメソッドを記入している
 *上のフィールドでpurivateを宣言している場合get.setが必須となる
 *DAOクラスでget○○やset○○と書いてある時はこのメソッドを呼び出している*/

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId=loginId;
	}


	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}


	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}


	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}
}
