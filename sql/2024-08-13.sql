select *from emp;
select *from dept;

create table emp02 as select * from emp;
select *from emp02;

--���̺��� ��� �ο츦 �����ϴ� TRUNCATE TABLE

truncate table emp02; --�ȿ� ���� ������

-- ���̺���� �����ϴ� RENAME
rename emp02 to test;
select * from  test;

desc user_tables;

select * from user_tables;

-- ���� ������ �����(SCOTT)�� ������ ���̺��� �̸��� �˷��ִ� TABLE_NAME �÷��� ������ Ȯ��
select table_name from user_tables;

--table 
create table dept02 as select * from dept;
select * from dept02;

truncate table dept02;

--INSERT
insert into dept02( deptno,dname,loc) values(10,'ACCOUNTING','NEW YORK');
insert into dept02( deptno,dname,loc) values(20,'RESEARCH','DALLAS');
insert into dept02 values(30,'RESEARCH','DALLAS');

desc dept02;
insert into dept02 values('RESEARCH',30,'DALLAS'); --���������� ����
insert into dept02 values(40,'RESEARCH','DALLAS');

drop table emp01;

create table emp01 as select * from emp;
select * from emp01; 

--��� ����� �μ���ȣ�� 30�� ���� ������ Ȯ���ϴ� ������
update emp01 set deptno=30;

--����� �޿��� 10% �λ��Ű�� UPDATE���� ����� ������

update emp01 set sal=sal*1.1;

--��� �Ի����� ���÷� �����ϴ� ������

update emp01 set hiredate=sysdate;

-- �μ� ��ȣ�� 10���� ����� �μ� ��ȣ�� 40������ �����ϰ� Ȯ���ϴ� ������

update emp01 set deptno=40 where deptno=10;

--JOB �÷����� MANAGER�� ���, �޿��� 10% �λ��ϴ� ������

update emp01 set sal=sal*1.1 where job='MANAGER';

--1982�⿡ �Ի��� ����� �Ի����� ���÷� �����ϴ� ������

update emp01 set hiredate=sysdate where substr(hiredate, 1,2)='82';

--���̺��� 2�� �̻��� �÷����� �����Ϸ��� SET���� �޸�(,)�� �߰��ϰ� �÷�=�÷����� �߰� ���

--SMITH ����� �Ի� ��¥�� ���÷�, �޿��� 50����, Ŀ�̼��� 4000���� �����ϴ� ������
update emp01 set hiredate=sysdate, sal=50, comm=4000  where ename='SMITH';

-- DELETE ��ɹ�
drop table dept01;
create table dept01 as select * from dept;

select * from dept01;

--������ DEPT01 �μ� ���̺��� ��� �����͸� �����ϴ� ������
delete from dept01;

rollback; --�������� ������

-- 10�� �μ��� ������ �� �μ� ���̺��� Ȯ���ϴ� ������
delete from dept01 where deptno=30;

-- �μ����� SALES�� �μ��� emp01���� �����Ͻÿ�
delete from emp01 where deptno=(select deptno from dept where dname='SALES');


