package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.BuyItemDTO;
import com.internousdev.template.util.DBConnector;

public class BuyItemDAO {

	public BuyItemDTO getBuyItemInfo(){
	//BuyItemDTOが戻り値のgetBuyItemInfoメソッドを定義

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		BuyItemDTO buyItemDTO=new BuyItemDTO();
	//データベースに接続する準備とbuyItemDTOのオブジェクト作る
	//下でbuyItemDTOに値のセットをしてリターンで戻す


		String sql="SELECT id,item_name,item_price FROM item_info_transaction";
		//SELECTでitem_info_transactionからid.item_name.itempriceを抽出する


		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();

			if(rs.next()){
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
				}
		}catch(Exception e){
			e.printStackTrace();
	}
	return buyItemDTO;
	}

}
