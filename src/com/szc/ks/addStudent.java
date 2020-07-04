package com.szc.ks;
//添加学生

import com.szc.db.BaseDao;

import java.util.Scanner;

public class addStudent {
    //    private Date birthday;//记录时间，这功能先不用了
//    private String id;//数据库中id
    private String up_name;//姓名
    private String up_age;//年龄
    private String up_address;//家庭住址
    private String up_su_id;//学号

    public int add_Student() {
        Scanner sc = new Scanner(System.in);
        up_name = sc.next();//键盘获取值
        up_age = sc.next();
        up_address = sc.next();
        up_su_id = sc.next();
        BaseDao dao = new BaseDao();//数据库操作对象
        String sql = "INSERT INTO db_student (name,age,address,su_id)" +
                "" + "values(?,?,?,?)";//插入数据库语句
        return dao.update(sql,
                up_name, up_age, up_address, up_su_id);
    }
}
