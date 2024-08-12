select *from emp;
select *from dept;


--사원들의 평균 급여보다 더 많은 급여를 받는 사원을 검색하는 쿼리문
select avg(sal) from emp; --평균 알아내고

select * from emp where sal>2077;
--서브쿼리
--하나의 select  문장내에 포함된 또하나의 select 문장이 있는 쿼리문이다

select *
from emp
where sal>(select avg(sal)from emp); --한번에 구하는 방법

--SMITH 의 근무지
--조인으로
select ename,loc from emp, dept where emp.deptno=dept.deptno and emp.ename='SMITH';
--서브쿼리
select * from dept where deptno=(select deptno from emp where ename='SMITH');

--SMITH의 급여와 동일하거나 급여를 더 많이 받는 사원과 급여를 출력하는 쿼리문
select * from emp  where sal>=(select sal from emp where ename ='SMITH');

--다중행 쿼리
--서브 쿼리에서의 결과가 두 건 이상 출력되는 것이다.
--결과가 2개 이상 구해지는 쿼리문을 서브 쿼리로 기술할 때는 다중행 연산자와 함께 사용해야 한다!

-- 연봉을 3000이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원들의 정보를 출력하는 쿼리문

select  deptno from emp where  sal>=3000;
select *from emp where deptno=20 or deptno=10;
select *from emp where deptno in(20,10);


select *from emp where deptno in (select deptno from emp where sal>=3000); --in은 or뜻

--smith보다 늦게 입사한 사원의 이름 및 입사일을 출력하라

select ename,hiredate from emp where hiredate>(select hiredate from emp where ename='SMITH');

--smith와 동일한 부서에 속한 모든 사원의 이름 및 입사일을 출력하라
--단 스미스는 제외하라
select ename,hiredate from emp where deptno=(select deptno from emp where ename='SMITH')and ename != 'SMITH';

--이름에 T가 들어가는 사원이 속한 부서에서 근무하는 모든 사원의 사원번호 및 이름을 출력하라
select *from emp where ename like '%T%';
select *from emp where deptno in(20,30);

select empno, ename from emp where deptno in (select deptno from emp where ename like '%T%');

--DDL
create table emp01(
empno number(4), --0부터 9999까지
ename varchar2(20), --맥스값이 20개, 가변형
--ename1 char(20), --고정형
sal number(7,2) --7자리0000000전체중에 뒤에 2개는 소수점 앞에 5개 정수
);

desc emp01;

commit;


select*from emp01;

--컬럼추가
alter table emp01 add (job varchar2(9));
alter table emp01 modify(job varchar2(30));

alter table emp01 drop column job;

--table 삭제
drop table emp01;

desc emp01;



create table emp02 as select *from emp;

select *from emp02;
desc emp02; 

--일부컬럼만 복사
create table emp03 as select empno, ename from emp;
desc emp03;
select *from emp03;


















