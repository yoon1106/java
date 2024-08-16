select *from emp;
select *from dept

--사원번호, 사원명, 직급, 부서번호 4개의 컬럼으로 구성된 EMP01 테이블을 NOT NULL 제약조건을 설정하지 않고 생성하는 경우

drop table emp05;

create table emp05(
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)

);

desc emp05;
drop table emp06;

create table emp06(
    empno number(4) constraint emp06_empno_pk  primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)

);

desc emp;

select *from emp;
select *from dept;

insert into emp(empno,ename,deptno) values (8000,'홍길동',50);
insert into emp(empno,ename,deptno) values (8000,'홍길동',40);

--외래키지정
drop table emp07;

create table emp07(
    empno number(4)   primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2) constraint emp07_deptno_fk references dept(deptno)-- FOREIGN KEY  지정

);

insert into emp07(empno,ename,deptno) values (8000,'홍길동',80); --deptno는10~40만 가능
insert into emp07(empno,ename,deptno) values (8001,'홍길동',null);
insert into emp07(empno,ename,deptno) values (8002,'홍길동',10);


select *from emp07;


create user scott2  identified by tiger;









