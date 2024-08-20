select *from emp;
select *from dept;

--27>모든 사원의 이름,직업,부서이름,급여 및 등급을 출력하라.

SELECT E.ENAME, E.JOB, D.DNAME, E.SAL, S.GRADE
FROM EMP E, DEPT D, SALGRADE S
WHERE E.DEPTNO=D.DEPTNO
AND E.SAL BETWEEN S.LOSAL AND S.HISAL;

--28> Smith보다 늦게 입사한 사원의 이름 및 입사일을 출력하라.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE > (SELECT HIREDATE
FROM EMP
WHERE ENAME='SMITH');

--31> 각 직업별로 급여 최저액.최고액,총액 및 평균액을 출력하라.
SELECT JOB, MAX(SAL), MIN(SAL), SUM(SAL), AVG(SAL)
FROM EMP
GROUP BY JOB;

--32> 직업이 동일한 사람 수를 직업과 같이 출력하라.
SELECT JOB, COUNT(JOB)
FROM EMP
GROUP BY JOB;

--33 > 관리자의 수를 출력하되, 관리자 번호가 중복되지 않게하라.
-- 컬럼명을 Number of Manager 로 지정하여 출력하라.
SELECT COUNT(DISTINCT(MGR)) AS "Number of Manager"
FROM EMP;

-- 34> 최고 급여와 최저 급여의 차액을 출력하라.
SELECT MAX(SAL) - MIN(SAL) FROM EMP;
