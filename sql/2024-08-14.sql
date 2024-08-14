select *from emp;
select *from dept;

DROP TABLE DEPT01;
CREATE TABLE DEPT01 AS SELECT * FROM DEPT;

select * from dept01;

delete from dept01; 

rollback; --1시간이내 복구만 가능

commit; --영구저장, 커밋하면 롤백불가

-- 데이터 무결성을 위한 제약 조건 
-- 컬럼에 조건 주는거
drop table students;

create table  students(
    id number(3) primary key,--unique not null=primary key
    num varchar2(20),  
    score number(3) not null,
    gender varchar2(10),
     constraint gender_check check(gender in('남','여')), 
    constraint score_ck check(score>=60)--  constraint 제약조건  score_ck :변수명
);
desc students;
insert into students values(100,'101',60,'남');
insert into students values(100,'101',50);
insert into students values(101,'101',100);

--insert into students values(null,'101',100);
insert into students values(100,null);
insert into students values(null,null);
commit;

select * from students;











