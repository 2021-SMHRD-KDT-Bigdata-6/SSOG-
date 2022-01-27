create table test (
	num number(10)
);

select * from FoodReview;
select * from IngredientReview;
insert into IngredientReview (purchaseseq, reviewcontent, reviewdate, reviewscore, crawlfoodname) values('29','웅2',sysdate, 3,'웅2');
select * from IngredientReview where reviewcontent = '웅2';
delete from IngredientReview where reviewcontent = '웅2';
select * from IngredientReview where reviewcontent = 'test';
delete from IngredientReview where reviewcontent = 'test';

select * from IngredientReview where crawlfoodname = '갈비';

select * from nutrition where ingrename = (select * from (select ingrename from nutrition where ingrename like '%계란%' group by ingrename ORDER BY DBMS_RANDOM.RANDOM) where rownum  < 2 );

select * from cmt;
delete from cmt where writer = 'test';

insert into BOARD values(BOARD_SEQ.nextval,'HappyCook','test','test','1.jpg','resources/img/1.jpg','내용',sysdate);

insert into BOARD values(BOARD_SEQ.nextval,'HappyCook','test','test','47031c4b-7780-4278-ab1b-cd002bcd7064_pich.png','resources/files/47031c4b-7780-4278-ab1b-cd002bcd7064_pich.png','내용',sysdate);

insert into BOARD values(BOARD_SEQ.nextval,'HappyCook','오늘의 요리','요리왕','image_1.jpg','resources/files/image_1.jpg','오늘 저녁 만들어봄 ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'HappyCook','단호박으로 만든 요리','찐천재','image_2.jpg','resources/files/image_2.jpg','달달한 단호박으로 만든 스프!',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'HappyCook','구운닭!!','치킨러버','image_3.jpg','resources/files/image_3.jpg','오늘 저녁 만들어봄 ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'HappyCook','감자를 먹어보자','사과맛','image_4.jpg','resources/files/image_4.jpg','오늘 저녁 만들어봄 ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'HappyCook','파티요리로 추천!','요리천재','image_5.jpg','resources/files/image_5.jpg','오늘 저녁 만들어봄 ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'HappyCook','오늘 저녁은 미트볼스파게티!','금손레시피','image_6.jpg','resources/files/image_6.jpg','오늘 저녁 만들어봄 ',sysdate);


select * from board where boardCate='HappyCook' order by w_day desc;


delete from board where writer = 'test';
delete from board where filename = '6db8dc03-f4a0-49eb-99f1-78ccdee00680_pich.png';

delete from board where boardcate = 'PoisonCook';
insert into BOARD values(BOARD_SEQ.nextval,'PoisonCook','고구마 맛탕이 있었는데요.. 없습니다','woong','image_6_6.jpg','resources/files/image_6_6.jpg','오늘 저녁 만들어봄 ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'PoisonCook','카스테라 만들어봄','dan','image_5_5.jpg','resources/files/image_5_5.jpg','엄마한테 혼날 듯..ㅎㅎ ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'PoisonCook','계란 후라이는 쉽다며','치킨러버','image_4_4.jpg','resources/files/image_4_4.jpg','... ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'PoisonCook','곰돌아.. 죽지마..','요리왕','image_3_3.jpg','resources/files/image_3_3.jpg','곰돌아.. 미안해.. ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'PoisonCook','오늘은 뭘 먹지..','sleep','image_2_2.jpg','resources/files/image_2_2.jpg','깜빡 졸았나.. ',sysdate);
insert into BOARD values(BOARD_SEQ.nextval,'PoisonCook','불맛나는 스파게티 ㅎㅎ','쿠쿠르핑퐁','image_1_1.jpg','resources/files/image_1_1.jpg','오늘 저녁도 굶어야되나요 ㅠㅠ ',sysdate);


select * from board where boardCate='PoisonCook' order by w_day desc;

select * from t_member;

select * from board;

select count(*) from board where boardcate = 'HappyCook';
select count('HappyCook') from board;

select * from (
	select ROWNUM NUM1, n. * from(
		select * from board where boardCate='HappyCook' order by w_day desc
	) n
) 
where num1 between 1 and 10;

select * from food;

select fdName,fdcategori from food where fdcategori like '%밥';
select fdName,fdcategori from food where fdcategori like '%죽';
select count(*) from food where fdcategori like '%밥';
select count(*) from food where fdcategori like '%밥%';
select fdName from food where fdcategori ='밥';

select fdcategori from food group by fdcategori;

select fdName,fdcategori from food where fdcategori like '%면류%';

select ingreName from FoodIngredient where mainSub = 'main' and fdName = '잔치국수';
select ingreName,mainsub from FoodIngredient where fdName ='잔치국수';
select count(mainsub) from FoodIngredient where mainsub = 'main' group by fdName;

select * from foodingredient where fdName = '잔치국수' and mainSub = 'main';

select * from foodrecipe;

select * from foodrecipe where fdName = '잔치국수' order by recipeOrder;

select * from foodrecipe where fdName = '생선초밥' order by recipeOrder;

select recipeimg from foodrecipe;

select * from cmt where bno=79 order by comment_time desc
delete from cmt where writer = 'test';