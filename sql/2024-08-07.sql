select *from emp;
--������� �Ի��Ͽ��� �Ի�⵵�� �Ի���� ����ϴ� ������
SELECT ENAME, SUBSTR(HIREDATE, 1, 2) as "�⵵", SUBSTR(HIREDATE, 4, 2) as "��", SUBSTR(HIREDATE, 7, 2) as "��"FROM EMP;

--80/12/17
SELECT ENAME, SUBSTR(HIREDATE, 1, 2) as "�⵵", SUBSTR(HIREDATE, 4, 2) as "��",
SUBSTR(HIREDATE, 7, 2) as "��" FROM EMP;

--9���� �Ի��� ����� ����ϴ� ������
SELECT * from emp where SUBSTR(HIREDATE, 4, 2) = '09' ;

--LTRIM/RTRIM
select ltrim('               �ȳ��ϼ���                ') from dual;
select rtrim('            �ȳ��ϼ���            ') from dual;
select trim('               �ȳ��ϼ���               ') from dual;

--��¥�Լ�
select sysdate from dual; --���糯¥�� ��ȯ�ϴ� �Լ��̴� sysdate
select sysdate-1 from dual; 
select sysdate-1����,  sysdate ���� ,sysdate+1as "����"  from dual; 

--�� �������� �ٹ��� ���� ���� ���ϴ� ������
select ename,sysdate,round( MONTHS_BETWEEN(sysdate, hiredate))�ٹ������� from emp; --�� ��¥ ������ �������� ���ϴ� �Լ��̴�.

--Ư�� ���� ���� ���� ��¥�� ���ϴ� �Լ��̴�.
select ename, hiredate,add_months(hiredate,4)from emp;

--������ �������� ���� ����� ���� �������� �������� �˾ƺ��� ������
select sysdate, next_day(sysdate,'������')as "������ ������"from dual;



-- �Ի��� ���� ������ ���� ���ϴ� ������
 SELECT hiredate, last_day(hiredate) FROM EMP; 
 
 --�̹��� ��������
 select last_day(sysdate)from dual;
 
 --22/02���� ��������
  select last_day('22/02/01')from dual;
  
  --����ȯ(��¥�� Ȥ�� �������� ���������� ��ȯ�ϴ� �Լ� to_char)
  -- ���� ��¥�� ���������� ��ȯ�Ͽ� ����ϴ� ������
 select sysdate, to_char(sysdate,'YYYY-MM-DD HH24:MI:SS')from dual; --hhmiss �ú���
 select hiredate, to_char(hiredate,'YYYY-MM-DD day')from emp;
  
--�� ������ ��ȭ ��ȣ�� �տ� ���̰� õ �������� �޸��� �ٿ��� ����ϴ� ������(��: ��1,230,000)
select ename,sal,to_char(sal,'L999,999')from emp;

--�������� ��¥������ ��ȯ�ϴ� �Լ�
--to_date
select ename, hiredate from emp where hiredate=to_date (19810220,'YYYYMMDD');

--���� ��ĥ�� �������� ���� ��¥���� 2016/01/01�� �� ����� ����ϴ� ������
select round (sysdate-to_date('2016/01/01','YYYY/MM/DD'))from dual;

--TO_NUMBER  ����(-)������ ���ϴ� ������
select to_number('20,000','99,999')- to_number('10,000','99,999')from dual;

--NVL�Լ� =null value;
--��������� �ϴ� ������
select ename,sal,comm,(sal*12+comm)as"����",sal*12+nvl(comm,0)as"����2" from emp; 
select ename,sal,comm,sal*12+nvl(comm,0)as"����" from emp; 
--between
--sal 2000~5000����
select *from emp where sal>2000 and sal<5000;
select*from emp where sal between 2000 and 5000;

--����� 82�⵵�� �Ի��� �����?
select*from emp where hiredate >='82/01/01'and hiredate <='82/12/31';
select*from emp where hiredate between '82/01/01' and'82/12/31';



--1981�� 2��20��~1981��5��1�Ͽ� �Ի��� ����� �̸�,����, �Ի����� ����϶�
select*from emp where hiredate between '1981/02/20' and'81/05/01';                     --          . / -��¥�� 3�� �ٰ���

--in
select *from emp where sal=800 or sal=1600 or sal=950;
select *from emp where sal in(800,1600 ,950);

--10���μ� �Ǵ� 20�� �μ� �Ǵ� 30�� �μ��� ���ϴ� �����?
select *from emp where deptno in(10,20 ,30);



--10�� �� 30�� �μ��� ���ϴ� ��� ����� �̸��� �μ� ��ȣ�� ����ϵ�,
--�̸��� ���ĺ������� �����Ͽ� ����϶�.

select ename, deptno from emp where  deptno in(10,30) order by ename;


