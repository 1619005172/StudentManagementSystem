package com.szc.ks;
//删除学生

import com.szc.db.BaseDao;

import java.util.Scanner;

public class delStudent {
    public int del_Student() {
        String id;
        String sql = "delete from db_student where id=?";//sql语句，匹配参数？
        Scanner sc = new Scanner(System.in);//获取输入值
        BaseDao dao = new BaseDao();//数据库操作对象
        id = sc.next();
        return dao.update(sql, id);//返回行号
    }
}
