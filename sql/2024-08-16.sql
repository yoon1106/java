select *from emp;
select *from dept

--�����ȣ, �����, ����, �μ���ȣ 4���� �÷����� ������ EMP01 ���̺��� NOT NULL ���������� �������� �ʰ� �����ϴ� ���

drop table emp05;

create table emp05(
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)

);

desc emp05;
drop table emp06;

create table emp06(
    empno number(4) constraint emp06_empno_pk  primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)

);

desc emp;

select *from emp;
select *from dept;

insert into emp(empno,ename,deptno) values (8000,'ȫ�浿',50);
insert into emp(empno,ename,deptno) values (8000,'ȫ�浿',40);

--�ܷ�Ű����
drop table emp07;

create table emp07(
    empno number(4)   primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2) constraint emp07_deptno_fk references dept(deptno)-- FOREIGN KEY  ����

);

insert into emp07(empno,ename,deptno) values (8000,'ȫ�浿',80); --deptno��10~40�� ����
insert into emp07(empno,ename,deptno) values (8001,'ȫ�浿',null);
insert into emp07(empno,ename,deptno) values (8002,'ȫ�浿',10);


select *from emp07;


create user scott2  identified by tiger;









