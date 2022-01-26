create table cmt(
    cno number(10),
    bno number(20),
    contents varchar2(200),
    writer varchar2(20),
    comment_time date
);

create sequence comment_seq
    increment by 1
    start with 1;
    