* �޸����ݿ���ַ�����
��mysql.ini��������£����߸���
```
[mysqld]
character-set-server=utf8mb4

[mysql]
default-character-set=utf8mb4

[client]
default-character-set=utf8mb4
```
* �������ݿ����
```
ALTER DATABASE ���ݿ��� CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```
* �����������ݿ������б���ַ������������
```
SELECT
CONCAT('alter table ',a.TABLE_NAME,' convert to character set utf8mb4 collate utf8mb4_bin;')
FROM
(SELECT b.TABLE_NAME FROM information_schema.`TABLES` b WHERE b.TABLE_SCHEMA = '���ݿ���')a;
```
**ע��concat���ǰ��Ŀո���ʡ�ԣ���ѯ֮��ѽ������ճ��֮��ȫ��ִ��**