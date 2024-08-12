select *from emp;
--DECODE(SWITCH CASE문과 같은 기능이다.)
--사원의 부서 번호를 이름으로 설정하는 쿼리문
select deptno, decode(deptno,10,'A','20','B','default')as "부서이름" from emp; --10번이면 a 20번이면 b 디폴트면 다디폴트로나옴

select ename,deptno, decode(deptno, 10, 'ACCOUNTING',20, 'RESEARCH',30,'SALES',40,'OPERATIONS')as dename from emp;

--조건에 따라 서로 다른 처리가 가능한 CASE 함수
select ename,deptno,
    case when deptno=10 then 'ACCPUNTING'
        when deptno=20 then 'RESEARCH'
            when deptno=30 then 'SALES'
               when deptno=40 then 'OPERATIONS'
     end as 부서이름
from emp;

-- 그룹 함수
--하나 이상의 행을 그룹으로 묶어 연산하며 하나의 결과를나타내는 함수이다
--사원들의 총 급여를 구하는 쿼리문

select sum(sal)from emp; --하나의 결과물 sum

select deptno,sal, round(sal)from emp; --각각 round


-- 커미션(comm) 총액을 구하는 쿼리문
--그룹함수는 다른 연산자와는 달리 해당 컬럼값이 null제외하고 계산
select sum(COMM)from emp;

--급여 평균을 구하는 쿼리문
select avg(sal) from emp;

--가장 높은 급여, 가장 낮은 급여
select max(sal), min(sal) from emp;

--전체 사원수
--테이블에서 조건을 만족하는 행의 개수를 반환하는 함수이다 count함수는 null값 포함하지않는다
select count(*) from emp;

--사원테이블의 사원들 중에서 커미션을 받은 사원의 수를 구하는 쿼리문
select count(comm) from emp;

--업무수
select count(distinct job)as 업무수 from emp;

-- 사원 테이블을 부서 번호로 그룹 짓는 쿼리문
select deptno from emp group by deptno;

-- 소속 부서별 평균 급여를 구하는 쿼리문 --그룹바이의경우 반드시 함수도 그룹함수가 와야한ek
select deptno,avg(sal) from emp group by deptno;

--소속부서별 급여 최대값을 구하는 쿼리문
select deptno, max(sal) from emp group by deptno;

--소속 부서별 급여 총액과 평균 급여를 구하는 쿼리문
select deptno,sum(sal)as 총액,avg(sal) as 평균 from emp group by deptno;
--group by절에 명시하지않은 컬럼을 select절에 사용하지못한다

--소속부서별 최대급여와 최소급여를 구하는 쿼리문


select deptno,max(sal)as 최대급여,min(sal) as 최소급여 from emp group by deptno;

--부서별 사원의 수와 커미션을 받는 사원의 수를 계산하는 쿼리문
select deptno, count(*),count(comm)from emp group by deptno;

--그룹 지어진 부서별 평균 급여가 2000 이상인 부서의 번호와 부서별 평균 급여를 출력하는 쿼리문
select deptno, avg(sal)from emp group by deptno having avg(sal)>=2000;

--부서의 최대값과 최소값을 구하되, 최대 급여가 2900 이상인 부서만 출력하는 쿼리문
select deptno,max(sal)as 최대급여,min(sal) as 최소급여 from emp group by deptno having max(sal)>2900;

select*from emp where hiredate >='82/01/01';

show user;
