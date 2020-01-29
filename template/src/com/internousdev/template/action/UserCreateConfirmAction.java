package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private Map<String,Object>session;
	private String errorMessage;

	public String execute(){
		String result=SUCCESS;//初期値にサクセスを代入

		if(!(loginUserId.equals(""))//equalsはString型の比較メソッド
			&&!(loginPassword.equals(""))//ここではloginUserIdやpassが("")空欄かどうかを比較している
			&&!(userName.equals(""))){
					session.put("loginUserId",loginUserId);
					session.put("loginPassword",loginPassword);
					session.put("userName",userName);
		}else{
			setErrorMessage("未入力の項目があります。");
				result=ERROR;
		}
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
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

	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;

	}
}
