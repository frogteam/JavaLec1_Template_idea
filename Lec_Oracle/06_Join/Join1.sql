-- JOIN
-- FROM 절의 테이블에 별칭(alias) 를 줄수 있다

-- TODO


-- 카티션곱 (Cartesian Product)
-- 두개의 테이블을 JOIN 하게 되면, 
-- 각 테이블의 레코드들의 모든 조합이 출력된다.
-- WHERE 나 ON 등으로 JOIN 조건이 주어지지 않으면 
-- 모든 카티션곱이 출력된다. 

-- TODO	
		
-- TODO
-- 위의 카티션 곱에서 조건을 주면 원한는 레코드만 추출 가능.

-----------------------------------------------------------------------------------
-- Equi Join (등가 Join)
-- 일반적으로 많이 쓰이는 Join 이며, 양쪽 테이블 Join 한 카티션곱에서 ‘같은조건’이 존재할 경우만 값을 가져오는 것

-- 예) #6101 
-- student 테이블과 department 테이블을 사용하여 학생이름, 1전공 학과번호, 1전공 학과 이름을 출력하세요
-- TODO : ORACLE

-- TODO : ANSI


-- 제2전공은?
-- null 은 카티션 곱에 참여 안함.
-- TODO


-- 연습 #6102)
-- student 테이블, professor 테이블 을 join하여 
-- ‘학생이름’, ‘지도교수번호’, ‘지도교수이름’ 을 출력하세요

-- TODO : ORACLE
-- TODO : ANSI


-- 3테이블 JOIN

-- #6103
-- student, department, professor 테이블 을 join 하여 
--  학생의 이름, 학과이름, 지도교수 이름  을 출력하세요

-- TODO : 3개 테이블 join  ORACLE 구문

-- TODO : ANSI 방식 3개 테이블 join


-- 연습 #6104
-- emp2 테이블과 p_grade 테이블을 조회하여 
-- 사원의 이름과 직급, 현재연봉, 
-- 해당직급의 연봉의 하한금액(s_pay)과 
-- 상한금액(e_pay)을 출력하세요

select * from emp2;   -- 일단 함 보자
select * from p_grade;


-- TODO : ORACLE
-- TODO : ANSI 구문


-- 연습 #6105
-- student - professor 테이블 join 하여 
-- 제1전공(deptno1) 이 101번인 학생들의 
-- 학생이름과 지도교수 이름을 출력하세요

-- TODO : ORACLE
-- TODO : ANSI Join 구문

