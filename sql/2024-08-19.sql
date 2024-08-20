select *from emp;
select *from dept;

--27>��� ����� �̸�,����,�μ��̸�,�޿� �� ����� ����϶�.

SELECT E.ENAME, E.JOB, D.DNAME, E.SAL, S.GRADE
FROM EMP E, DEPT D, SALGRADE S
WHERE E.DEPTNO=D.DEPTNO
AND E.SAL BETWEEN S.LOSAL AND S.HISAL;

--28> Smith���� �ʰ� �Ի��� ����� �̸� �� �Ի����� ����϶�.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE > (SELECT HIREDATE
FROM EMP
WHERE ENAME='SMITH');

--31> �� �������� �޿� ������.�ְ��,�Ѿ� �� ��վ��� ����϶�.
SELECT JOB, MAX(SAL), MIN(SAL), SUM(SAL), AVG(SAL)
FROM EMP
GROUP BY JOB;

--32> ������ ������ ��� ���� ������ ���� ����϶�.
SELECT JOB, COUNT(JOB)
FROM EMP
GROUP BY JOB;

--33 > �������� ���� ����ϵ�, ������ ��ȣ�� �ߺ����� �ʰ��϶�.
-- �÷����� Number of Manager �� �����Ͽ� ����϶�.
SELECT COUNT(DISTINCT(MGR)) AS "Number of Manager"
FROM EMP;

-- 34> �ְ� �޿��� ���� �޿��� ������ ����϶�.
SELECT MAX(SAL) - MIN(SAL) FROM EMP;
