--이름이 F로 시작하는 사람을 찾는 쿼리문
--와일드 카드(위치에 상관없는)
select*from emp where ename Like 'F%';

--위치에 상관없이 이름중에 A가 들어있는 사람을 찾는 쿼리문
select*from emp where ename Like '%A%';

--이름이 N으로 끝나는 사람을 찾는 쿼리문
select*from emp where ename Like '%N';

--이름의 두번째 글자가 A인 사원을 찾는 쿼리문
--_는 단 한문자에 대해서만 와일드 카드 역할
select*from emp where ename Like '_A%';

--이름에 A를 포함하지 않는 사람만 검색하는 쿼리문
select*from emp where ename not Like '%A%';

-- 커미션(COMM)을 받지 못하는 사원을 검색하는 쿼리문
select*from emp where comm is null;

-- 커미션(COMM)을 받은 사원을 검색하는 쿼리문
select*from emp where comm is not null;

--정렬 order by절
-- 사원들의 급여를 오름차순으로 정렬하는 쿼리문 (오름차순 asc)
select*from emp order by sal asc;
-- 사원들의 급여를 내림차순으로 정렬하는 쿼리문 (내림차순desc)
select*from emp order by sal desc;

-- 가장 최근에 입사한 사원부터 출력하는 쿼리문
select*from emp order by hiredate desc;

--부서번호가 20번인 사원을 월급순으로 출력하는 쿼리문
select*from emp where deptno=20  order by sal asc;

--문자정렬시 사전순
select*from emp order by ename;
--역순
select*from emp order by ename desc;

--comm이 not null인 사원들을 comm순으로 나오게 하시오
select*from emp where comm is not null order by comm;

--DISTINCT
--사원들이 소속되어 있는 부서의 번호를 출력하는 쿼리문(중복제거)
select DISTINCT deptno from emp; 

select DISTINCT job from emp; 

--별칭(alians) as 는 생략가능

select ename as 이름 from emp;
select ename  "employee name" from emp;

select ename, sal,(sal+(sal*0.1))as"보너스" from emp;

--DUAL :한행 결과를 출력하기위해
--26*32
select 26*32 from dual;
select sysdate from dual; --sysdate 오늘날짜

--10에 대한 절대값을 구하는 쿼리문
select -10,ABS(-10)from dual;

--특정 자릿수에서 반올림하는 함수
--34.5678 반올림하는 쿼리문 round!!!!!!!!
select 34.5678, round(34.5678) from dual;
select 34.5678, round(34.5678,2) from dual;  --콤마하면 소수점 특정위치까지 나온다

--문법(함수, 컬럼이름, 테이블이름) 대소문자 안가림
--안에있는 데이터들은 대문자

--floor은 소수점 아래를 버리는 함수이다
select 34.5678, floor(34.5678) from dual; 

--나누기 연산을 한 후 나머지를 결과로 되돌려주는 함수이다
select mod(27,2)from dual; --mod가 나머지
select  mod(27,2), mod(27,5)from dual;

--문자처리함수
--대문자로 변환 upper
select upper('abcd')from dual;

--소문자로 변환 lower
select lower('ABCD')from dual;

--이니셜만 대문자로 변환하는 함수 initcap
select initcap('abcd')from dual;
select initcap('ABCD')from dual;

--문자 길이를 구하는 함수
SELECT LENGTH('Oracle'), LENGTH('오라클') FROM DUAL;

--SUBSTR
--오라클에서 인덱스는 0이 아닌 1부터 시작한다.
select substr('안녕하세요 메롱님',4,5)from dual;

SELECT ENAME, SUBSTR(HIREDATE, 1, 2) as "년도", SUBSTR(HIREDATE, 4, 2) as "달" FROM EMP;

select ename as "사원이름" from emp;
