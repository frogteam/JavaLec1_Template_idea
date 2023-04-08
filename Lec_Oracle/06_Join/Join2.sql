-- 비등가 조인 (Non-Equi Join)

-- #6201) 연습  
-- gogak 테이블, gift 테이블을 join 하여  
-- 고객의 마일리지 포인트별로 받을수 있는 상품을 조회하여 
-- 고객의 '이름(gname)'과 포인트(point) 상품명(gname)을 출력하세요

SELECT * FROM gogak; -- 일단 함 보자
SELECT * FROM gift;

-- TODO : ORACLE
-- TODO : ANSI Join 구문


--  #6202) 연습 
-- 앞 예제에서 조회한 상품의 이름(gname)과 필요수량이 몇개인지 조회하세요
-- (그룹함수 동원되어야 한다)
-- TODO : ORACLE
-- TODO : ANSI Join 구문



-- #6203) 연습
-- Student 테이블과 exam_01 테이블, hakjum 테이블을 조회하여 
-- 학생들의 이름과 점수와 학점을 출력하세요

select * from exam_01;  -- 일단 함 보자
select * from hakjum;
	
-- TODO : ORACLE	
-- TODO : ANSI 구문 (과제)



--  #6204) 연습
--Gagak 과 gift 테이블 join : 
--자기 포인트(point) 보다 낮은 포인트의 상품 중 
--한가지를 선택할수 있다고 할때 
--'산악용자전거'를 선택할 수 있는 
--고객명(gname)과 포인트(point), 
--상품명(gname)을 출력하세요

-- TODO : ORACLE
-- TODO : ANSI 구문



--  #6205) 연습
--emp2, p_grade 테이블 join : 
--사원들의 이름(name)과 나이, 현재직급, 예상직급을 출력하세요. 
--예상직급은 나이로 계산하며 해당 나이가 받아야 하는 직급을 의미합니다. 
--나이는 오늘(SYSDATE)을 기준으로 하되 소수점 이하는 절삭하여 계산하세요
--(emp2 의 position 은 null 허용함에 주의)
--** 나이계산은 어떻게?  :  (현재연도 - 생년월일연도) + 1, 
--	SYSDATE, TO_CHAR() 사용

-- TODO : ORACLE
-- TODO : ANSI Join 구문


-----------------------------------
-- OUTER JOIN

-- #6206)
--Student 테이블과 Professor 테이블 Join : 
--학생이름과 지도교수 이름을 출력하세요. 
--단! 지도교수가 결정되지 않은 학생의 명단도 함께 출력하세요


--** 기존의 INNER Join 방식으로 먼저 만들어 보고 OUTER Join 을 해보고 비교해보자

-- TODO 

-- * Outer Join 은 따로 오라클 구문이 없다.

	
-- #6207)
--student, professor 테이블 join :  
--학생이름과 지도교수 이름을 출력, 
--단 지도 학생이 결정되지 않은 교수 명단도 출력

-- TODO



-- #6208)
--student, professor 테이블 join :  
--학생이름과 지도교수 이름을 출력, 
--단 지도 학생이 결정되지 않은 교수 명단, 
--지도교수가 결정되지 않은 학생명단 모두 출력

-- TODO


------------------------------------------------
-- self join

-- #6209) 
--dept2 테이블에서 
-- 부서명 과 그 부서의 상위부서명을 출력하세요

-- TODO : ORACLE
-- TODO : ANSI Join 구문	
	
	

-- #6210)
--professor 테이블 : 교수번호, 교수이름, 입사일, 
--그리고 자신보다 입사일 빠른 사람의 인원수를 출력하세요, 
--단 자신보다 입사일이 빠른 사람수를 오름차순으로 출력하세요
--hint: left outer 사용 
--         / 그룹함수 사용

-- left outer 를 사용하는 이유는 '조인형' 교수 때문.
-- 조인형 교수보다 먼저 입사한 사람이 없기 때문에 일반 join으론 하면 조인형 교수가 join 에서 빠져버린다.
	
-- TODO