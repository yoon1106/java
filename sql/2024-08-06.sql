--�̸��� F�� �����ϴ� ����� ã�� ������
--���ϵ� ī��(��ġ�� �������)
select*from emp where ename Like 'F%';

--��ġ�� ������� �̸��߿� A�� ����ִ� ����� ã�� ������
select*from emp where ename Like '%A%';

--�̸��� N���� ������ ����� ã�� ������
select*from emp where ename Like '%N';

--�̸��� �ι�° ���ڰ� A�� ����� ã�� ������
--_�� �� �ѹ��ڿ� ���ؼ��� ���ϵ� ī�� ����
select*from emp where ename Like '_A%';

--�̸��� A�� �������� �ʴ� ����� �˻��ϴ� ������
select*from emp where ename not Like '%A%';

-- Ŀ�̼�(COMM)�� ���� ���ϴ� ����� �˻��ϴ� ������
select*from emp where comm is null;

-- Ŀ�̼�(COMM)�� ���� ����� �˻��ϴ� ������
select*from emp where comm is not null;

--���� order by��
-- ������� �޿��� ������������ �����ϴ� ������ (�������� asc)
select*from emp order by sal asc;
-- ������� �޿��� ������������ �����ϴ� ������ (��������desc)
select*from emp order by sal desc;

-- ���� �ֱٿ� �Ի��� ������� ����ϴ� ������
select*from emp order by hiredate desc;

--�μ���ȣ�� 20���� ����� ���޼����� ����ϴ� ������
select*from emp where deptno=20  order by sal asc;

--�������Ľ� ������
select*from emp order by ename;
--����
select*from emp order by ename desc;

--comm�� not null�� ������� comm������ ������ �Ͻÿ�
select*from emp where comm is not null order by comm;

--DISTINCT
--������� �ҼӵǾ� �ִ� �μ��� ��ȣ�� ����ϴ� ������(�ߺ�����)
select DISTINCT deptno from emp; 

select DISTINCT job from emp; 

--��Ī(alians) as �� ��������

select ename as �̸� from emp;
select ename  "employee name" from emp;

select ename, sal,(sal+(sal*0.1))as"���ʽ�" from emp;

--DUAL :���� ����� ����ϱ�����
--26*32
select 26*32 from dual;
select sysdate from dual; --sysdate ���ó�¥

--10�� ���� ���밪�� ���ϴ� ������
select -10,ABS(-10)from dual;

--Ư�� �ڸ������� �ݿø��ϴ� �Լ�
--34.5678 �ݿø��ϴ� ������ round!!!!!!!!
select 34.5678, round(34.5678) from dual;
select 34.5678, round(34.5678,2) from dual;  --�޸��ϸ� �Ҽ��� Ư����ġ���� ���´�

--����(�Լ�, �÷��̸�, ���̺��̸�) ��ҹ��� �Ȱ���
--�ȿ��ִ� �����͵��� �빮��

--floor�� �Ҽ��� �Ʒ��� ������ �Լ��̴�
select 34.5678, floor(34.5678) from dual; 

--������ ������ �� �� �������� ����� �ǵ����ִ� �Լ��̴�
select mod(27,2)from dual; --mod�� ������
select  mod(27,2), mod(27,5)from dual;

--����ó���Լ�
--�빮�ڷ� ��ȯ upper
select upper('abcd')from dual;

--�ҹ��ڷ� ��ȯ lower
select lower('ABCD')from dual;

--�̴ϼȸ� �빮�ڷ� ��ȯ�ϴ� �Լ� initcap
select initcap('abcd')from dual;
select initcap('ABCD')from dual;

--���� ���̸� ���ϴ� �Լ�
SELECT LENGTH('Oracle'), LENGTH('����Ŭ') FROM DUAL;

--SUBSTR
--����Ŭ���� �ε����� 0�� �ƴ� 1���� �����Ѵ�.
select substr('�ȳ��ϼ��� �޷մ�',4,5)from dual;

SELECT ENAME, SUBSTR(HIREDATE, 1, 2) as "�⵵", SUBSTR(HIREDATE, 4, 2) as "��" FROM EMP;

select ename as "����̸�" from emp;
