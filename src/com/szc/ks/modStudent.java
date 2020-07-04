package com.szc.ks;

import com.szc.db.BaseDao;
import java.util.Scanner;

//修改学生信息
public class modStudent {

    Scanner sc = new Scanner(System.in);
    BaseDao dao = new BaseDao();//创建数据库操作对象
    //修改姓名方法
    //注释只详细打了一个，下面都类似
    public void up_name() {
        String id;
        String name;
        int up_i;//数据库操作判断验证
        String sql = "UPDATE db_student " + "SET name=? " + "where id=?";//sql语句（修改数据）
        System.out.println("请输入id");//输出信息
        id = sc.next();//获取所需值
        System.out.println("请输入修改信息");//输出信息
        name = sc.next();//获取所需值
        up_i = dao.update(sql,name,id);//传入数据
        if (up_i != 0)//通过返回值进行判断是否修改成功
        {
            System.out.println("修改成功");
        }
        else
        {
            System.out.println("修改失败");
        }
    }
    //修改年龄方法
    public void up_age() {
        String id;
        String age;
        int up_i;
        System.out.println();
        String sql = "UPDATE db_student " + "set age=? " + "where id=?";
        System.out.println("请输入id");
        id = sc.next();
        System.out.println("请输入修改信息");
        age = sc.next();
        up_i = dao.update(sql,age,id);
        if (up_i != 0)
        {
            System.out.println("修改成功");
        }
        else
        {
            System.out.println("修改失败");
        }
    }
    //修改学号方法
    public void up_su_id() {
        String id;
        String su_id;
        int up_i;
        System.out.println();
        String sql = "UPDATE db_student " + "set su_id=? " + "where id=?";
        System.out.println("请输入id");
        id = sc.next();
        System.out.println("请输入修改信息");
        su_id = sc.next();
        up_i = dao.update(sql,su_id,id);
        if (up_i != 0)
        {
            System.out.println("修改成功");
        }
        else
        {
            System.out.println("修改失败");
        }
    }
    //修改住址方法
    public void up_address() {
        String id;
        String address;
        int up_i;
        System.out.println();
        String sql = "UPDATE db_student " + "set address=? " + "where id=?";
        System.out.println("请输入id");
        id = sc.next();
        System.out.println("请输入修改信息");
        address = sc.next();
        up_i = dao.update(sql,address,id);
        if (up_i != 0)
        {
            System.out.println("修改成功");
        }
        else
        {
            System.out.println("修改失败");
        }
    }
    //修改一个人所有信息方法
    public void up_all() {
        String id;
        String name;
        String age;
        String address;
        String su_id;
        int up_i;
        System.out.println();
        String sql = "UPDATE db_student " + "set name=?,age=?,address=?,su_id=? " + "where id=?";
        System.out.println("请输入id");
        id = sc.next();
        System.out.println("请输入修改信息");
        name = sc.next();
        age = sc.next();
        address = sc.next();
        su_id = sc.next();
        up_i = dao.update(sql,name,age,address,su_id,id);
        if (up_i != 0)
        {
            System.out.println("修改成功");
        }
        else
        {
            System.out.println("修改失败");
        }
    }
    //菜单兼选择功能方法
    public void up_Student() {
        int i = 1;
        while(i == 1){
            String cs;//菜单选择定位项
            System.out.println("请选择所修修改项");
            System.out.println("1.修改名字");
            System.out.println("2.修改年龄");
            System.out.println("3.修改学号");
            System.out.println("4.修改住址");
            System.out.println("5.全部修改");
            System.out.println("6.返回上一级");
            cs = sc.next();//获取输入选择信息
            switch (cs){
                case "1":
                    up_name();
                    break;
                case "2":
                    up_age();
                    break;
                case "3":
                    up_address();
                    break;
                case "4":
                    up_su_id();
                    break;
                case "5":
                    up_all();
                    break;
                case "6":
                    i = 0;
            }
        }
    }
}
