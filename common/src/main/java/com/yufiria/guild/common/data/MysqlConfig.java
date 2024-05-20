package com.yufiria.guild.common.data;

public class MysqlConfig {

    //HikariCP配置
    public static String driverClass = "com.mysql.cj.jdbc.Driver";
    public static Integer connectionTimeout;
    public static Integer minIdle;
    public static Integer maxPoolSize;
    public static Integer maxLifeTime;
    public static Boolean autoCommit;
    //Mysql配置
    public static String url;
    public static String username;
    public static String password;

}
