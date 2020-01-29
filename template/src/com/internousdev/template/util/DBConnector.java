package com.internousdev.template.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {

	//JDBCドライバー名
		private static String driverName ="com.mysql.jdbc.Driver";
	//データベース接続URL
		private static String url="jdbc:mysql://localhost/template";
	//データベース接続ユーザー名
	private static String user ="root";
	// データベース接続パスワード
	private static String password ="mysql";



	public Connection getConnection(){//接続状態にする
	Connection con = null;
	//状態を初期化している、この2つの文は接続しかしないクラス。



	try{
	Class.forName(driverName);
	con =DriverManager.getConnection(url,user,password);
	//例外が発生しそうな処理(ここではconへの代入処理)


	}catch(ClassNotFoundException e){ //
	e.printStackTrace();

	//ClassNotFound...は"例外クラス"、e は例外クラスの変数
	//e.printStackTraceはeの例外をプリント表記するという指示
	//"printStackTrace()"は例外処理のメソッドこのほかにも様々,業務では必須

	}catch (SQLException e){
	e.printStackTrace();

	}
return con;//Mysqlに接続できたか情報を渡す
}
}
