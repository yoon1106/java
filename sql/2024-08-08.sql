select *from emp;
--DECODE(SWITCH CASE���� ���� ����̴�.)
--����� �μ� ��ȣ�� �̸����� �����ϴ� ������
select deptno, decode(deptno,10,'A','20','B','default')as "�μ��̸�" from emp; --10���̸� a 20���̸� b ����Ʈ�� �ٵ���Ʈ�γ���

select ename,deptno, decode(deptno, 10, 'ACCOUNTING',20, 'RESEARCH',30,'SALES',40,'OPERATIONS')as dename from emp;

--���ǿ� ���� ���� �ٸ� ó���� ������ CASE �Լ�
select ename,deptno,
    case when deptno=10 then 'ACCPUNTING'
        when deptno=20 then 'RESEARCH'
            when deptno=30 then 'SALES'
               when deptno=40 then 'OPERATIONS'
     end as �μ��̸�
from emp;

-- �׷� �Լ�
--�ϳ� �̻��� ���� �׷����� ���� �����ϸ� �ϳ��� �������Ÿ���� �Լ��̴�
--������� �� �޿��� ���ϴ� ������

select sum(sal)from emp; --�ϳ��� ����� sum

select deptno,sal, round(sal)from emp; --���� round


-- Ŀ�̼�(comm) �Ѿ��� ���ϴ� ������
--�׷��Լ��� �ٸ� �����ڿʹ� �޸� �ش� �÷����� null�����ϰ� ���
select sum(COMM)from emp;

--�޿� ����� ���ϴ� ������
select avg(sal) from emp;

--���� ���� �޿�, ���� ���� �޿�
select max(sal), min(sal) from emp;

--��ü �����
--���̺��� ������ �����ϴ� ���� ������ ��ȯ�ϴ� �Լ��̴� count�Լ��� null�� ���������ʴ´�
select count(*) from emp;

--������̺��� ����� �߿��� Ŀ�̼��� ���� ����� ���� ���ϴ� ������
select count(comm) from emp;

--������
select count(distinct job)as ������ from emp;

-- ��� ���̺��� �μ� ��ȣ�� �׷� ���� ������
select deptno from emp group by deptno;

-- �Ҽ� �μ��� ��� �޿��� ���ϴ� ������ --�׷�����ǰ�� �ݵ�� �Լ��� �׷��Լ��� �;���ek
select deptno,avg(sal) from emp group by deptno;

--�ҼӺμ��� �޿� �ִ밪�� ���ϴ� ������
select deptno, max(sal) from emp group by deptno;

--�Ҽ� �μ��� �޿� �Ѿװ� ��� �޿��� ���ϴ� ������
select deptno,sum(sal)as �Ѿ�,avg(sal) as ��� from emp group by deptno;
--group by���� ����������� �÷��� select���� ����������Ѵ�

--�ҼӺμ��� �ִ�޿��� �ּұ޿��� ���ϴ� ������


select deptno,max(sal)as �ִ�޿�,min(sal) as �ּұ޿� from emp group by deptno;

--�μ��� ����� ���� Ŀ�̼��� �޴� ����� ���� ����ϴ� ������
select deptno, count(*),count(comm)from emp group by deptno;

--�׷� ������ �μ��� ��� �޿��� 2000 �̻��� �μ��� ��ȣ�� �μ��� ��� �޿��� ����ϴ� ������
select deptno, avg(sal)from emp group by deptno having avg(sal)>=2000;

--�μ��� �ִ밪�� �ּҰ��� ���ϵ�, �ִ� �޿��� 2900 �̻��� �μ��� ����ϴ� ������
select deptno,max(sal)as �ִ�޿�,min(sal) as �ּұ޿� from emp group by deptno having max(sal)>2900;

select*from emp where hiredate >='82/01/01';

show user;
