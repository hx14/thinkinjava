* 修改数据库的字符集。
在mysql.ini中添加如下，或者覆盖
```
[mysqld]
character-set-server=utf8mb4

[mysql]
default-character-set=utf8mb4

[client]
default-character-set=utf8mb4
```
* 更改数据库编码
```
ALTER DATABASE 数据库名 CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```
* 更改整个数据库中所有表的字符集和排序规则
```
SELECT
CONCAT('alter table ',a.TABLE_NAME,' convert to character set utf8mb4 collate utf8mb4_bin;')
FROM
(SELECT b.TABLE_NAME FROM information_schema.`TABLES` b WHERE b.TABLE_SCHEMA = '数据库名')a;
```
**注意concat语句前后的空格不能省略，查询之后把结果复制粘贴之后全部执行**