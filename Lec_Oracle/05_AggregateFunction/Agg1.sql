-- 그룹 함수 (Aggregate Function) 예
-- TODO


-- 교수님들의 보너스 평균값 출력 ( AVG() 사용)
-- 그룹함수는 null 값은 계산안하기 때문에
-- null 허용 필드에 대해 계산할때는 반드시 nvl, nvl2 사용해야 함.
-- TODO


-- GROUP BY 의 예
-- Professor 테이블에서 학과별로 교수들의 평균 보너스를 출력하세요
-- TODO 



-- #5101)연습
-- professor 테이블 : 학과별, 직급별로 교수들의 평균 급여를 출력하세요
-- TODO



-- HAVING : 그룹 함수에 조건 추가
-- 부서별 평균급여를 출력하되, 평균급여가 450 보다 많은 학과만 출력
-- TODO




-- <SELECT 쿼리문 순서>
-- 	SELECT
-- 	FROM
-- 	WHERE
-- 	GROUP BY
-- 	HAVING
--  ORDER BY


-- #5102)연습
-- emp 테이블: 매니저별(MGR)로 관리하는 직원들의 
-- ‘매니저’, ‘직원수’와 ‘급여총액’과 ‘급여평균’과 ‘교통비 (COMM) 평균’ 지급액 을 출력하세요.  
-- 단 사장님은 (job = president)제외
-- TODO



-- #5103)연습
-- professor 테이블 :  직위가 정교수 혹은 조교수 인 분들 중에서 ‘과별(deptno)’로  
-- 과번호, 소속교수 총수, 근속일 평균, 급여평균, 보너스 평균을 출력해보세요
-- TODO


-- #5104)연습
-- student 테이블 : 학과별(deptno1) 로,  
-- 학과번호, 학생수, 최대몸무게 - 최소몸무게 차이 값을 출력해보세요
-- TODO


-- #5105) 그 차이가 30 이상인것만 출력하려면?
-- TODO

