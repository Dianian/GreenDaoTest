# GreenDaoTest
GreenDao的简单使用

greendao中的注解
-@Entity 定义实体
-@nameInDb 在数据库中的名字，如不写则为实体中类名
-@indexes 索引
-@createInDb 是否创建表，默认为true,false时不创建
-@schema 指定架构名称为实体
-@active 无论是更新生成都刷新
-@Id
-@NotNull 不为null
-@Unique 唯一约束
-@ToMany 一对多
-@OrderBy 排序
-@ToOne 一对一
-@Transient 不存储在数据库中
-@generated 由greendao产生的构造函数或方法

