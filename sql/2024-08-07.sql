select *from emp;
--사원들의 입사일에서 입사년도와 입사달을 출력하는 쿼리문
SELECT ENAME, SUBSTR(HIREDATE, 1, 2) as "년도", SUBSTR(HIREDATE, 4, 2) as "달", SUBSTR(HIREDATE, 7, 2) as "일"FROM EMP;

--80/12/17
SELECT ENAME, SUBSTR(HIREDATE, 1, 2) as "년도", SUBSTR(HIREDATE, 4, 2) as "달",
SUBSTR(HIREDATE, 7, 2) as "일" FROM EMP;

--9월에 입사한 사원을 출력하는 쿼리문
SELECT * from emp where SUBSTR(HIREDATE, 4, 2) = '09' ;

--LTRIM/RTRIM
select ltrim('               안녕하세요                ') from dual;
select rtrim('            안녕하세요            ') from dual;
select trim('               안녕하세요               ') from dual;

--날짜함수
select sysdate from dual; --현재날짜를 반환하는 함수이다 sysdate
select sysdate-1 from dual; 
select sysdate-1어제,  sysdate 오늘 ,sysdate+1as "내일"  from dual; 

--각 직원들이 근무한 개월 수를 구하는 쿼리문
select ename,sysdate,round( MONTHS_BETWEEN(sysdate, hiredate))근무개월수 from emp; --두 날짜 사이의 개월수를 구하는 함수이다.

--특정 개월 수를 더한 날짜를 구하는 함수이다.
select ename, hiredate,add_months(hiredate,4)from emp;

--오늘을 기준으로 가장 가까운 다음 수요일은 언제인지 알아보는 쿼리문
select sysdate, next_day(sysdate,'수요일')as "다음주 수요일"from dual;



-- 입사한 달의 마지막 날을 구하는 쿼리문
 SELECT hiredate, last_day(hiredate) FROM EMP; 
 
 --이번달 마지막날
 select last_day(sysdate)from dual;
 
 --22/02월달 마지막날
  select last_day('22/02/01')from dual;
  
  --형변환(날짜형 혹은 숫자형을 문자형으로 변환하는 함수 to_char)
  -- 현재 날짜를 문자형으로 변환하여 출력하는 쿼리문
 select sysdate, to_char(sysdate,'YYYY-MM-DD HH24:MI:SS')from dual; --hhmiss 시분초
 select hiredate, to_char(hiredate,'YYYY-MM-DD day')from emp;
  
--각 지역별 통화 기호를 앞에 붙이고 천 단위마다 콤마를 붙여서 출력하는 쿼리문(예: ￦1,230,000)
select ename,sal,to_char(sal,'L999,999')from emp;

--문자형을 날짜형으로 변환하는 함수
--to_date
select ename, hiredate from emp where hiredate=to_date (19810220,'YYYYMMDD');

--올해 며칠이 지났는지 현재 날짜에서 2016/01/01을 뺀 결과를 출력하는 쿼리문
select round (sysdate-to_date('2016/01/01','YYYY/MM/DD'))from dual;

--TO_NUMBER  빼기(-)연산을 구하는 쿼리문
select to_number('20,000','99,999')- to_number('10,000','99,999')from dual;

--NVL함수 =null value;
--연봉계산을 하는 쿼리문
select ename,sal,comm,(sal*12+comm)as"연봉",sal*12+nvl(comm,0)as"연봉2" from emp; 
select ename,sal,comm,sal*12+nvl(comm,0)as"연봉" from emp; 
--between
--sal 2000~5000사이
select *from emp where sal>2000 and sal<5000;
select*from emp where sal between 2000 and 5000;

--사원중 82년도에 입사한 사원은?
select*from emp where hiredate >='82/01/01'and hiredate <='82/12/31';
select*from emp where hiredate between '82/01/01' and'82/12/31';



--1981년 2월20일~1981년5월1일에 입사한 사원의 이름,직업, 입사입을 출력하라
select*from emp where hiredate between '1981/02/20' and'81/05/01';                     --          . / -날짜에 3개 다가능

--in
select *from emp where sal=800 or sal=1600 or sal=950;
select *from emp where sal in(800,1600 ,950);

--10번부서 또는 20번 부서 또는 30번 부서에 속하는 사원은?
select *from emp where deptno in(10,20 ,30);



--10번 및 30번 부서에 속하는 모든 사원의 이름과 부서 번호를 출력하되,
--이름을 알파벳순으로 정렬하여 출력하라.

select ename, deptno from emp where  deptno in(10,30) order by ename;


