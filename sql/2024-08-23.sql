CREATE TABLE MVC_BOARD (
    BID NUMBER(4) PRIMARY KEY,
    BNAME VARCHAR2(100),
    BTITLE VARCHAR2(1200),
    BHIT NUMBER(4),
    BGROUP NUMBER(4),
    BSTEP NUMBER(4),
    BINDENT NUMBER(4)
);

DESC MVC_BOARD;

CREATE SEQUENCE MVC_BOARD_SEQ;

SELECT MVC_BOARD_SEQ.CURRVAL FROM DUAL;

COMMIT;

insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) 
values (mvc_board_seq.nextval, 'test' , '테스트', '테스트', 0, mvc_board_seq.currval, 0, 0);

select * from mvc_board;
commit;