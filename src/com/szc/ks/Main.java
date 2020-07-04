package com.szc.ks;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static int db_login;

    public static void main(String[] args) {
//        int i = 0;
        String choiceString;//输入缓存
        Scanner sc = new Scanner(System.in);//创建输入对象
        getStudent get = new getStudent();//创建获取数据对象
        LoginTest ln = new LoginTest();//创建登录对象
        addStudent add = new addStudent();//创建数据库添加对象
        delStudent del = new delStudent();
        modStudent up = new modStudent();
        //管理员登录
        try {
            db_login = ln.login();//调用登录方法
        } catch (SQLException e) {//异常抛出
            e.printStackTrace();
        }
        //登录成功执行操作
        if (db_login != 0)//确认登陆成功
        {
            while (true)//循环执行程序
            {
                //简单的菜单
                System.out.println("学生信息管理系统");
                System.out.println("1.查看所有学生");
                System.out.println("2.添加学生");
                System.out.println("3.删除学生");
                System.out.println("4.修改学生");
                System.out.println("5.退出系统");
                choiceString = sc.next();//检测输入
                switch (choiceString) {//根据输入进行选择
                    case "1":
                        System.out.println("id" + "\t" + "姓名" + "\t" + "年龄" +
                                "\t" + "学号" + "\t" + "\t" + "家庭住址");
                        try {
                            get.get_Student();//调用获取数据方法
                        } catch (SQLException e) {//异常抛出
                            e.printStackTrace();
                        }
                        break;
                    case "2":
                        System.out.println("请输入学生信息，姓名，年龄，家庭住址，学号");
                        int add_i;
                        //                            add.addStudent();//调用添加数据库方法
                        add_i = add.add_Student();
                        if (add_i != 0)//根据方法返回值判断是否写入成功
                        {
                            System.out.println("写入数据成功");
                        } else {
                            System.out.println("出现错误，写入失败");
                        }
                        break;
                    case "3":
                        System.out.println("请输入要删除学生id");
                        int del_i;
                        del_i = del.del_Student();
                        if (del_i != 0) {
                            System.out.println("删除成功");
                        } else {
                            System.out.println("删除失败");
                        }
                        break;
                    case "4":
                        System.out.println("请输入所需更新人员id与人员信息");
                        up.up_Student();//调用修改数据方法
                        break;
                    case "5":
                        System.out.println("退出成功，谢谢使用");
                        System.exit(0);//结束循环
                }
            }
        }
    }
}
