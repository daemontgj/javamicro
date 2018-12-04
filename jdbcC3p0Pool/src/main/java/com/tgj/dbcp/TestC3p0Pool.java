package com.tgj.dbcp;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class TestC3p0Pool {
	
	public static void main(String[] args) throws Exception {
		long begin = System.currentTimeMillis();
		//创建C3P0连接池
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		for(int i=1;i<=100;i++){
			Connection conn = dataSource.getConnection();
			if(conn!=null){
				System.out.println(i+":取得连接");
				conn.close();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("共用" + (end-begin)/1000+"秒");
	}

}
