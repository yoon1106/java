select * from emp;
select * from dept;

--
select ename,job from emp;
select loc from dept;

--ex)������̺��� (emp) �޿� 3000 �̻��� ����� ���
select * from emp where sal>=3000;

--�μ���ȣ�� 20�� ����� ���� ������ ���
select * from emp where deptno=20;

--�μ���ȣ�� 20�� �ƴ� ����� ���� ������ ���
select * from emp where deptno<>20;
select * from emp where deptno!=20;
select * from emp where deptno^=20;

--�̸��� ŷ�� ����� ���(empno) ,�̸�, �޿��� ����ϴ� ������
select empno,ename,sal from emp where ename='KING';

desc emp;

--1982�� 1��1�� ���Ŀ� �Ի��� ����� ����ϴ� ������
select empno,ename,sal from emp where hiredate>='1982/01/01';
select empno,ename,sal from emp where hiredate>='1982.01.01';

--�μ���ȣ��10���̰� job�� �Ŵ����� �����?
select *from emp where deptno=10 and job='MANAGER';

--�μ���ȣ��10�� �Ǵ� job�� �Ŵ����� �����?
select *from emp where deptno=10 or job='MANAGER';

--�μ���ȣ�� 10���� �ƴѻ��?
select *from emp where deptno!=10 ;



