select *from emp;
select *from dept;


--������� ��� �޿����� �� ���� �޿��� �޴� ����� �˻��ϴ� ������
select avg(sal) from emp; --��� �˾Ƴ���

select * from emp where sal>2077;
--��������
--�ϳ��� select  ���峻�� ���Ե� ���ϳ��� select ������ �ִ� �������̴�

select *
from emp
where sal>(select avg(sal)from emp); --�ѹ��� ���ϴ� ���

--SMITH �� �ٹ���
--��������
select ename,loc from emp, dept where emp.deptno=dept.deptno and emp.ename='SMITH';
--��������
select * from dept where deptno=(select deptno from emp where ename='SMITH');

--SMITH�� �޿��� �����ϰų� �޿��� �� ���� �޴� ����� �޿��� ����ϴ� ������
select * from emp  where sal>=(select sal from emp where ename ='SMITH');

--������ ����
--���� ���������� ����� �� �� �̻� ��µǴ� ���̴�.
--����� 2�� �̻� �������� �������� ���� ������ ����� ���� ������ �����ڿ� �Բ� ����ؾ� �Ѵ�!

-- ������ 3000�̻� �޴� ����� �Ҽӵ� �μ��� ������ �μ����� �ٹ��ϴ� ������� ������ ����ϴ� ������

select  deptno from emp where  sal>=3000;
select *from emp where deptno=20 or deptno=10;
select *from emp where deptno in(20,10);


select *from emp where deptno in (select deptno from emp where sal>=3000); --in�� or��

--smith���� �ʰ� �Ի��� ����� �̸� �� �Ի����� ����϶�

select ename,hiredate from emp where hiredate>(select hiredate from emp where ename='SMITH');

--smith�� ������ �μ��� ���� ��� ����� �̸� �� �Ի����� ����϶�
--�� ���̽��� �����϶�
select ename,hiredate from emp where deptno=(select deptno from emp where ename='SMITH')and ename != 'SMITH';

--�̸��� T�� ���� ����� ���� �μ����� �ٹ��ϴ� ��� ����� �����ȣ �� �̸��� ����϶�
select *from emp where ename like '%T%';
select *from emp where deptno in(20,30);

select empno, ename from emp where deptno in (select deptno from emp where ename like '%T%');

--DDL
create table emp01(
empno number(4), --0���� 9999����
ename varchar2(20), --�ƽ����� 20��, ������
--ename1 char(20), --������
sal number(7,2) --7�ڸ�0000000��ü�߿� �ڿ� 2���� �Ҽ��� �տ� 5�� ����
);

desc emp01;

commit;


select*from emp01;

--�÷��߰�
alter table emp01 add (job varchar2(9));
alter table emp01 modify(job varchar2(30));

alter table emp01 drop column job;

--table ����
drop table emp01;

desc emp01;



create table emp02 as select *from emp;

select *from emp02;
desc emp02; 

--�Ϻ��÷��� ����
create table emp03 as select empno, ename from emp;
desc emp03;
select *from emp03;


















