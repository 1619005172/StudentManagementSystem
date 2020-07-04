package com.szc.ks;

import com.szc.db.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class getStudent {

    public void get_Student() throws SQLException {
//      Date birthday;//记录时间
        String id;//数据库中id
        String name;//姓名
        String age;//年龄
        String address;//家庭住址
        String su_id;//学号
        BaseDao dao = new BaseDao();//创建数据库操作
        String sql = "select * from db_student";//MySQL语句，查询db_student表
        ResultSet rs = dao.query(sql);//传入数据
        while (rs.next()) {
            id = rs.getString("id");//获取id
            System.out.print(id + "\t");
            name = rs.getString("name");//获取姓名
            System.out.print(name + "\t");
            age = rs.getString("age");//获取年龄
            System.out.print(age + "\t");
            su_id = rs.getString("su_id");//获取学号
            System.out.print(su_id + "\t");
            address = rs.getString("address");//获取住址
            System.out.println(address + "\t");
        }
        rs.close();//关闭数据库连接
    }
}
