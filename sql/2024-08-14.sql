select *from emp;
select *from dept;

DROP TABLE DEPT01;
CREATE TABLE DEPT01 AS SELECT * FROM DEPT;

select * from dept01;

delete from dept01; 

rollback; --1�ð��̳� ������ ����

commit; --��������, Ŀ���ϸ� �ѹ�Ұ�

-- ������ ���Ἲ�� ���� ���� ���� 
-- �÷��� ���� �ִ°�
drop table students;

create table  students(
    id number(3) primary key,--unique not null=primary key
    num varchar2(20),  
    score number(3) not null,
    gender varchar2(10),
     constraint gender_check check(gender in('��','��')), 
    constraint score_ck check(score>=60)--  constraint ��������  score_ck :������
);
desc students;
insert into students values(100,'101',60,'��');
insert into students values(100,'101',50);
insert into students values(101,'101',100);

--insert into students values(null,'101',100);
insert into students values(100,null);
insert into students values(null,null);
commit;

select * from students;











