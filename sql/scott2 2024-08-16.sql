create user scott2 identified by tiger;

show user;

drop table emp01;

create table emp01(
    empno number(4) primary key,
    ename varchar2(10)
);

create sequence emp_seq start with 1 increment by 1 maxvalue 10000;

insert into emp01 values (emp_seq.nextval,'ȫ�浿');
insert into emp01 values (emp_seq.nextval,'ȫ�浿');

select * from emp01;

select  emp_seq.currval from dual;


