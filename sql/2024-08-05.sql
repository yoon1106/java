select * from emp;
select * from dept;

--
select ename,job from emp;
select loc from dept;

--ex)사원테이블에서 (emp) 급여 3000 이상인 사원을 출력
select * from emp where sal>=3000;

--부서번호가 20인 사원에 관한 정보만 출력
select * from emp where deptno=20;

--부서번호가 20이 아닌 사원에 관한 정보만 출력
select * from emp where deptno<>20;
select * from emp where deptno!=20;
select * from emp where deptno^=20;

--이름이 킹인 사람의 사번(empno) ,이름, 급여를 출력하는 쿼리문
select empno,ename,sal from emp where ename='KING';

desc emp;

--1982년 1월1일 이후에 입사한 사원을 출력하는 쿼리문
select empno,ename,sal from emp where hiredate>='1982/01/01';
select empno,ename,sal from emp where hiredate>='1982.01.01';

--부서번호가10번이고 job이 매니저인 사원은?
select *from emp where deptno=10 and job='MANAGER';

--부서번호가10번 또는 job이 매니저인 사원은?
select *from emp where deptno=10 or job='MANAGER';

--부서번호가 10번이 아닌사원?
select *from emp where deptno!=10 ;



