CREATE DATABASE haebeop;

-- 윈도우 컴퓨터 사용시 호환성 문제로 인해 필수적으로 세팅 해줘야함
ALTER DATABASE haebeop DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


USE haebeop;

CREATE TABLE test(num INT AUTO_INCREMENT PRIMARY KEY,
                  title VARCHAR(100) NOT NULL);

INSERT INTO test VALUES (DEFAULT, '테스트제목1');
INSERT INTO test VALUES (DEFAULT, '테스트제목2');
INSERT INTO test VALUES (DEFAULT, '테스트제목3');
INSERT INTO test VALUES (DEFAULT, '테스트제목4');
INSERT INTO test VALUES (DEFAULT, '테스트제목5');

SELECT * from test;

COMMIT;

SELECT * FROM emp;

DESC test;

DESC emp;

----------------------------------------------------------------------------------------------------------------------------

CREATE TABLE user(
                     id VARCHAR(20) NOT NULL,
                     pw VARCHAR(100) NOT NULL,
                     NAME VARCHAR(50),
                     email VARCHAR(100) NOT NULL,
                     tel VARCHAR(20) NOT NULL,
                     addr1 VARCHAR(200),
                     addr2  VARCHAR(100),
                     postcode VARCHAR(10),
                     regdate DATETIME DEFAULT CURRENT_TIMESTAMP(),
                     birth DATE NOT NULL,
                     pt INT(11) DEFAULT 0,
                     visited INT(11) DEFAULT 0
);

INSERT INTO user(id, pw, NAME, email, tel, birth, pt) VALUES('admin','1234', '관리자', 'admin@shop.com', '010-1004-1004', '1998-01-01', 0);
INSERT INTO user(id, pw, NAME, email, tel, birth, addr1, pt) VALUES('sirious920','1234', '오태훈', 'dhxogns920@shop.com', '010-7329-7484', '1998-09-20','서울 금천구 디지털로 185<br>2관 11층<br>08511', 1);

-- 계정 사용자 암호화 처리
UPDATE user SET pw='6lRVDcHqc9ceHafDPXmPbz2r4KRXzN1Bi/k0wAQZFua0seXPMFKXMHY6Ut5PW6anSpaKsA==' WHERE id='admin';
UPDATE user SET pw='6lRVDcHqc9ceHafDPXmPbz2r4KRXzN1Bi/k0wAQZFua0seXPMFKXMHY6Ut5PW6anSpaKsA==' WHERE id='sirious920';

-- 게시판 테이블
CREATE TABLE board (
                       bno INT PRIMARY KEY AUTO_INCREMENT,
                       title VARCHAR(200) NOT NULL,
                       content VARCHAR(1000),
                       author VARCHAR(16),
                       regdate DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
                       visit INT DEFAULT 0
);

-- 기본형 게시판 더미게시글 10개 추가
INSERT INTO board(title, content, author) VALUES ('게시판1', '게시판 1번 글 입니다.', 'admin');
INSERT INTO board(title, content, author) VALUES ('게시판2', '게시판 2번 글 입니다.', 'admin');
INSERT INTO board(title, content, author) VALUES ('게시판3', '게시판 3번 글 입니다.', 'admin');
INSERT INTO board(title, content, author) VALUES ('게시판4', '게시판 4번 글 입니다.', 'admin');
INSERT INTO board(title, content, author) VALUES ('게시판5', '게시판 5번 글 입니다.', 'admin');
INSERT INTO board(title, content, author) VALUES ('게시판6', '게시판 6번 글 입니다.', 'admin');
INSERT INTO board(title, content, author) VALUES ('게시판7', '게시판 7번 글 입니다.', '저자7');
INSERT INTO board(title, content, author) VALUES ('게시판8', '게시판 8번 글 입니다.', '저자8');
INSERT INTO board(title, content, author) VALUES ('게시판9', '게시판 9번 글 입니다.', '저자9');
INSERT INTO board(title, content, author) VALUES ('게시판10', '게시판 10번 글 입니다.', '저자10');

COMMIT;

SELECT * FROM board;

------------------------------------------------------------------------------------------------------

CREATE TABLE free (
                      fno INT PRIMARY KEY AUTO_INCREMENT,
                      title VARCHAR(200) NOT NULL,
                      content VARCHAR(1500),
                      author VARCHAR(16),
                      resdate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                      cnt INT DEFAULT 0,
);

-- 자유게시판 더미 게시글 10개 추가
INSERT INTO free (title, content, author) VALUES ('자유게시판1', '자게 1번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판2', '자게 2번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판3', '자게 3번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판4', '자게 4번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판5', '자게 5번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판6', '자게 6번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판7', '자게 7번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판8', '자게 8번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판9', '자게 9번 게시글입니다.');
INSERT INTO free (title, content, author) VALUES ('자유게시판10', '자게 10번 게시글입니다.');

COMMIT;

SELECT * FROM free;

------------------------------------------------------------------------------------------------------------

-- qna(묻고 답하기 - 질문, 답변) 테이블 작성
CREATE TABLE qna(
                    qno INT PRIMARY KEY AUTO_INCREMENT,
                    title VARCHAR(100) NOT NULL,
                    content VARCHAR(1000) NOT NULL,
                    author VARCHAR(16),
                    resdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                    visit INT DEFAULT 0,
                    lev INT DEFAULT 0,
                    par INT,
                    secret BOOLEAN DEFAULT FALSE,
                    FOREIGN KEY(author) REFERENCES user(id) ON DELETE CASCADE
);

-- qna 게시판 더미 게시글 작성
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문1', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문2', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문3', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문1', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문1', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문1', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문1', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문1', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문1', '질문 1번 입니다.');
INSERT INTO qna(title, content, author, lev, secret) VALUE ('질문1', '질문 1번 입니다.');

-- 핵심 기능 : 공지사항, 자료실, 자유게시판, 강의별 댓글, 교재와 시범강의
-- 부가 기능 : 파일업로드, 채팅, 타계정 또는 SNS로 로그인, 수강평, 달력, 가입 시 축하 이메일 보내기, 비밀번호 변경 시 이메일 보내기 등
-- 메인 기능 : 교재와 시범강의

-- 공지사항 (순번, 제목, 내용, 작성일, 읽은 횟수)
create table notice(
                       nno int primary KEY AUTO_INCREMENT,
                       title varchar(200) not NULL,
                       content varchar(1000),
                       resdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                       visit int DEFAULT 0
);

-- 자료실(순번, 제목, 내용, 자료파일1, 자료파일2, 자료파일3, 작성일, 작성자, 읽은 횟수)
CREATE TABLE dataroom (
                          dno INT PRIMARY KEY AUTO_INCREMENT,
                          uname VARCHAR(200),
                          subject VARCHAR(300),
                          content VARCHAR(1000),
                          filename1 VARCHAR(500),
                          filename2 VARCHAR(500),
                          filename3 VARCHAR(500),
);

COMMIT;

select * from filetest2;

-- 과목(과목코드, 과목명, 과목단가)
CREATE TABLE subject (
                         scode VARCHAR(200),				-- 과목 코드
                         sname VARCHAR(100),				-- 과목명
                         sprice VARCHAR(100),				-- 과목 단가
);

-- 강의(강의코드, 강의명, 강의파일, 과목코드, 교재코드, 강사코드, 수강인원)
CREATE TABLE lecture (
                         lcode VARCHAR(200),																-- 강의코드
                         lname VARCHAR(100),																-- 강의명
                         lfile VARCHAR(500),																-- 강의파일(영상으로 받아오기)
                         FOREIGN KEY(lscode) REFERENCES subject(scode) ON DELETE CASCADE,		-- 과목 코드(subject 테이블에서 외래키로 받아오기)
                         bcode VARCHAR(100),																-- 교재 코드
                         pcode VARCHAR(100),																-- 강사코드
                         stup VARCHAR(100),																-- stup(student point) : 수강 인원 수
);

-- 수강(수강코드, 강의코드, 학생아이디, 수강총시간, 수강완료여부)
CREATE TABLE applylecture (
                              alcode VARCHAR(200) NOT NULL,																		--
                              FOREIGN KEY(allec_code) REFERENCES lecture(lcode) ON DELETE CASCADE,
                              stuid VARCHAR(100) NOT NULL,
                              altime TIMESTAMP default CURRENT_TIMESTAMP,
                              per INT,
);

-- 강사(강사코드, 강사명, 연락처, 이메일)
crete TABLE teacher (
	tcode VARCHAR(100) NOT NULL,
	tname VARCHAR(50) NOT NULL,
	ttel VARCHAR(50) NOT NULL,
	temail VARCHAR(100) NOT NULL,
);

-- 교재(교재코드, 교재명, 교재목차, 출판사, 출판일, 저자, 가격, 기타메모)
CREATE TABLE textbook (
                          tbcode VARCHAR(100) NOT NULL,
                          tbname VARCHAR(50) NOT NULL,
                          tbindex VARCHAR(50) NOT NULL,
                          tbpublisher VARCHAR(50) NOT NULL,
                          tbpubday VARCHAR(50) NOT NULL,
                          tbauthor VARCHAR(50) NOT NULL,
                          price VARCHAR(100) NOT NULL,
                          tbnote VARCHAR(1000) NOT NULL,
);

-- 강의배정이란?
-- 과목, 강사, 교재 정보를 강의 테이블에 등록하느 행위로
-- 하나의 과목당 여러 강의를 모두 등록해야한다.

-- 수강 신청이란? 강의 정보를 보고, 학생이 수강신청을 하는 행위를 말하며,
-- 학생별로 모든 강의정보가 등록되어야하며, 만약 수강신청시 수강인원이
-- 초과될 경우 수강신청을 할 수 없다.



