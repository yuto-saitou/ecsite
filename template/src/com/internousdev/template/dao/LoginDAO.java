package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {
	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		LoginDTO loginDTO=new LoginDTO();
		String sql="SELECT*FROM login_user_transaction where login_id=? AND login_pass=?";
		//sql文をsql変数に代入している

		try{
			PreparedStatement ps =con.prepareStatement(sql);
			//prepareStatementにsqlを入れてconでデータベース接続

			ps.setString(1,loginUserId);//psの1つ目の?にjspから入力されたIDをセットしている
			ps.setString(2,loginPassword);//

			ResultSet rs =ps.executeQuery();
			//executeQueryセレクト文を実行している

			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));
				//rs.getString("login_id")でデータベースの値を呼び出している
				//loginDTO.setLoginIdでDTOに値をセットしている

				if(rs.getString("login_id")!=null){//rsから呼び出したidがnullでない時
					loginDTO.setLoginFlg(true);//DTOのloginFlgにturueを入れる
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return loginDTO;
		//以上を実行した時アクションクラスにloginDTOを戻す
		//loginDTOはセットされたそれぞれの値とloginFlgのtrue
	}

}
