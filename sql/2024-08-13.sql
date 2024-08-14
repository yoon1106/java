select *from emp;
select *from dept;

create table emp02 as select * from emp;
select *from emp02;

--테이블의 모든 로우를 제거하는 TRUNCATE TABLE

truncate table emp02; --안에 내용 날릴때

-- 테이블명을 변경하는 RENAME
rename emp02 to test;
select * from  test;

desc user_tables;

select * from user_tables;

-- 현재 접속한 사용자(SCOTT)가 생성한 테이블의 이름을 알려주는 TABLE_NAME 컬럼의 내용을 확인
select table_name from user_tables;

--table 
create table dept02 as select * from dept;
select * from dept02;

truncate table dept02;

--INSERT
insert into dept02( deptno,dname,loc) values(10,'ACCOUNTING','NEW YORK');
insert into dept02( deptno,dname,loc) values(20,'RESEARCH','DALLAS');
insert into dept02 values(30,'RESEARCH','DALLAS');

desc dept02;
insert into dept02 values('RESEARCH',30,'DALLAS'); --순서오류로 오류
insert into dept02 values(40,'RESEARCH','DALLAS');

drop table emp01;

create table emp01 as select * from emp;
select * from emp01; 

--모든 사원의 부서번호를 30번 으로 수정후 확인하는 쿼리문
update emp01 set deptno=30;

--사원의 급여를 10% 인상시키는 UPDATE문을 만드는 쿼리문

update emp01 set sal=sal*1.1;

--모든 입사일을 오늘로 수정하는 쿼리문

update emp01 set hiredate=sysdate;

-- 부서 번호가 10번인 사원의 부서 번호를 40번으로 수정하고 확인하는 쿼리문

update emp01 set deptno=40 where deptno=10;

--JOB 컬럼값이 MANAGER인 경우, 급여를 10% 인상하는 쿼리문

update emp01 set sal=sal*1.1 where job='MANAGER';

--1982년에 입사한 사원의 입사일을 오늘로 수정하는 쿼리문

update emp01 set hiredate=sysdate where substr(hiredate, 1,2)='82';

--테이블에서 2개 이상의 컬럼값을 변경하려면 SET절에 콤마(,)를 추가하고 컬럼=컬럼값을 추가 기술

--SMITH 사원의 입사 날짜는 오늘로, 급여는 50으로, 커미션은 4000으로 수정하는 쿼리문
update emp01 set hiredate=sysdate, sal=50, comm=4000  where ename='SMITH';

-- DELETE 명령문
drop table dept01;
create table dept01 as select * from dept;

select * from dept01;

--생성한 DEPT01 부서 테이블의 모든 데이터를 삭제하는 쿼리문
delete from dept01;

rollback; --이전으로 돌리기

-- 10번 부서를 삭제한 후 부서 테이블을 확인하는 쿼리문
delete from dept01 where deptno=30;

-- 부서명이 SALES인 부서를 emp01에서 삭제하시오
delete from emp01 where deptno=(select deptno from dept where dname='SALES');


