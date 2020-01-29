set names utf8;
set foreign_key_checks=0;
drop database if exists template;

create database if not exists template;
use template;

drop table if exists login_user_transaction;
/*もし同じ名前のテーブルが存在したら削除するという文*/

create table login_user_transaction(    /*テーブル作成*/
	id int not null primary key auto_increment,
		/*not null=必ず入力させる
		 *primary key=重複禁止
		 *auto_increment=このカラムは自動的に連番を繰り返す*/
	login_id varchar(16)unique,/*unique=重複禁止だが空欄でも可能*/
	login_pass varchar(16),
	user_name varchar(50),
	insert_date datetime,/*datetime=日付型,年月時間を表示する*/
	updated_date datetime/*datetime=日付型,年月時間を表示する*/
);




drop table if exists item_info_transaction;

create table item_info_transaction(
	id int not null primary key auto_increment,
	item_name varchar(30),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);



drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	delete_date datetime
);

INSERT INTO item_info_transaction(item_name,item_price,item_stock)
			VALUES("ノートBook",100,50);
/*item_info_transactionテーブルの(カラム名)に
 * VALUES(挿入するデータ)*/

INSERT INTO login_user_transaction(login_id,login_pass,user_name)
			VALUES("internous","internous01","test");


