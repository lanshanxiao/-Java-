//��������Դ����
BasicDataSource ds = new BasicDataSourc();
//�������ӳ���������
ds.setDriverClassName("com.mysql.jdbc.Driver");
//�����������ݿ��URL
ds.setUrl("jdbc:mysql://localhost:3306/javaee");
//�����������ݿ���û���
ds.setUsername("root");
//�����������ݿ������
dssetPassword("pass");
//�������ӳصĳ�ʼ������
ds.setInitialSize(5);
//�������ӳ������ж��ٸ��������
ds.setMaxActive(20);
//�������ӳ���������2�����е�����
ds.setMinIdle(2);