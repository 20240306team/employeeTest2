1. 자신의 이름명의 패키지를 만들어서 요구사항에 맞는 소스코드를 완성하세요
2. configuration 은 공통으로 사용합니다 따라서 자신의 mapper를 config.addmapper(자신의 매퍼명.class) 를 추가하면 됩니다




**sout 일반사원이라면 1번 관리자라면 2번(J1,J2) / 신입사원이라면 3번을 눌러주세요** 
**sout 아이디와 비밀번호를 입력해 주세요**

로그인클래스(이름, E-MAIL, 아이디,비밀번호, 직급) : EMPLOYEE DTO(사번 ,이메일,이름,핸드폰번호, 부서직급, 보너스레벨, 레벨별 보너스금액, 연봉 ,직원코드, 직급)
서로 비교해서 이름과 이메일이 같으면 로그인 성공 다르면 실패

**sout "로그인에 성공했습니다.** /else "로그인에 실패했습니다..."

Scanner
sout 아이디
sout 비밀번호


**1번 일반사원의 경우** 

if성공 > true 반환시 

sout 메뉴를 선택하세요 

1. 핸드폰번호조회 
2. 개인정보조회 

3-1 .내 연봉확인하기 (조건은 자동으로 연동만 하면 됨 (로그인한 정보와 이름, email 같은 것만 볼 수 있게 설정)) 보너스 레벨 join 미니멈, 멕시멈 이 사이에 있는 확인 후 보너스 금액 확인 

보너스 있는 달의 월급은 

            min_sal< A=salary*(1+bonus) <max_sal (max_sal 을 넘게 되면 최대 max_sal 까지만 받게 된다) 
이고
전체 연봉은
            A+salary*11

            
3-2. 내정보변경하기(UPDATE) ( 이메일, 핸드폰번호 )

**2번 관리자의 경우**

if성공 > true 반환시 

sout 메뉴를 선택하세요

1. 직원 정보 조회
2. 보너스 레벨 수정하기


**3번** 

1. 주민번호 잡코드(sc 부장,~ , 사원 → String, string 받아서 직급정보 전환해줌) 샐러리레벨 아이디 비밀번호 입력
