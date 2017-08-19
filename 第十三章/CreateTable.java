//创建数据源对象
BasicDataSource ds = new BasicDataSourc();
//设置连接池所需驱动
ds.setDriverClassName("com.mysql.jdbc.Driver");
//设置连接数据库的URL
ds.setUrl("jdbc:mysql://localhost:3306/javaee");
//设置连接数据库的用户名
ds.setUsername("root");
//设置连接数据库的密码
dssetPassword("pass");
//设置连接池的初始连接数
ds.setInitialSize(5);
//设置连接池最多可有多少个活动连接数
ds.setMaxActive(20);
//设置连接池中最少有2个空闲的连接
ds.setMinIdle(2);