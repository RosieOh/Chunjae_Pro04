# Project for Pro04

#### maked by RosieOh for FullStack Developer

## 💡 Developer Commit Convention

|       Tags       |               Explanation               |
| :--------------: | :-------------------------------------: |
|       Feat       |            새로운 기능 추가             |
|       Fix        |                버그 수정                |
| !BREAKING CHANGE |         커다란 API 변경의 경우          |
|     !HOTFIX      |          급한 치명적 버그 수정          |
|      Build       |           빌드 관련 파일 수정           |
|      Design      |        CSS를 포함 UI 디자인 변경        |
|       Docs       |                문서 수정                |
|      Style       | 코드 포맷팅, 세미콜론 누락, 코드 변경 X |
|     Refactor     |              코드 리팩토링              |
|     Comment      |        필요한 주석 추가 및 변경         |
|       Test       |            테스트 코드 수정             |
|      Rename      |         파일, 폴더명 이름 수정          |
|      Remove      |             파일, 폴더 삭제             |
|      Chore       |            빌드, 패키지 수정            |

# spring 최종 세팅

## pom.xml
```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>kr.ed.teaspoon</groupId>
  <artifactId>pro03</artifactId>
  <packaging>war</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>pro03 Maven Webapp</name>
  <url>http://maven.apache.org</url>

  <!-- 속성 추가 -->
  <properties>
    <java-version>17</java-version>
    <org.springframework-version>5.3.20</org.springframework-version>
    <org.aspectj-version>1.9.0</org.aspectj-version>
    <org.slf4j-version>2.0.0</org.slf4j-version>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
  </properties>

  <dependencies>
    <!-- spring mvc -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>${org.springframework-version}</version>
    </dependency>

    <!-- aspectj -->
    <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjrt -->
    <dependency>
      <groupId>org.aspectj</groupId>
      <artifactId>aspectjrt</artifactId>
      <version>${org.aspectj-version}</version>
      <scope>runtime</scope>
      <!--      영역을 미치는 영역이 scope. runtime으로 되어있으면 실행할때만 가능-->
    </dependency>

    <!-- slf4j and log4j-->
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-api</artifactId>
      <version>${org.slf4j-version}</version>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>jcl-over-slf4j</artifactId>
      <version>${org.slf4j-version}</version>
      <scope>runtime</scope>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-log4j12</artifactId>
      <version>${org.slf4j-version}</version>
      <scope>runtime</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/log4j/log4j -->
    <dependency>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
      <version>1.2.15</version>
      <exclusions>
        <exclusion>
          <groupId>javax.mail</groupId>
          <artifactId>mail</artifactId>
        </exclusion>
        <exclusion>
          <groupId>javax.jms</groupId>
          <artifactId>jms</artifactId>
        </exclusion>
        <exclusion>
          <groupId>com.sun.jdmk</groupId>
          <artifactId>jmxtools</artifactId>
        </exclusion>
        <exclusion>
          <groupId>com.sun.jmx</groupId>
          <artifactId>jmxri</artifactId>
        </exclusion>
      </exclusions>
      <scope>runtime</scope>
    </dependency>

    <!-- spring context -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>${org.springframework-version}</version>
      <exclusions>
        <exclusion>
          <!--          컨트롤러, 서비스에서 사용할 수 있는 commons-logging. -->
          <groupId>commons-logging</groupId>
          <artifactId>commons-logging</artifactId>
        </exclusion>
        <!-- artifactId: war, jar의 이름 -->
      </exclusions>
    </dependency>

    <!-- 의존성 주입 라이브러리 -->
    <!-- https://mvnrepository.com/artifact/javax.inject/javax.inject -->
    <dependency>
      <groupId>javax.inject</groupId>
      <artifactId>javax.inject</artifactId>
      <version>1</version>
    </dependency>

    <!-- 서블릿(servlet-api 2.5, jsp-api 2.1, jstl 1.2) -->
    <!-- https://mvnrepository.com/artifact/javax.servlet/servlet-api -->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>2.5</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/javax.servlet.jsp/jsp-api -->
    <dependency>
      <groupId>javax.servlet.jsp</groupId>
      <artifactId>jsp-api</artifactId>
      <version>2.1</version>
    </dependency>


    <!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
    </dependency>

    <!-- 단위 및 목업 테스트 도구(junit 4.13) -->
    <!-- https://mvnrepository.com/artifact/junit/junit -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13</version>
    </dependency>

    <!-- spring 테스트 도구 (spring-test 스프링 버전과 동일하게) -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-test -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>5.3.20</version>
    </dependency>

    <!-- lombok (1.18.22) -->
    <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.20</version>
    </dependency>

    <!-- DB 접속 로그를 기록하는 라이브러리 - log4jdbc-log4j2-jdbc4 (1.16) -->
    <!-- https://mvnrepository.com/artifact/org.bgee.log4jdbc-log4j2/log4jdbc-log4j2-jdbc4 -->
    <dependency>
      <groupId>org.bgee.log4jdbc-log4j2</groupId>
      <artifactId>log4jdbc-log4j2-jdbc4</artifactId>
      <version>1.16</version>
    </dependency>


    <!-- spring jdbc 라이브러리 - spring-jdbc (스프링 버전과 동일) -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>5.3.20</version>
    </dependency>

    <!-- 데이터베이스 공용 연결 라이브러리 - commons-dbcp (1.4) -->
    <!-- https://mvnrepository.com/artifact/commons-dbcp/commons-dbcp -->
    <dependency>
      <groupId>commons-dbcp</groupId>
      <artifactId>commons-dbcp</artifactId>
      <version>1.4</version>
    </dependency>

    <!-- maria db 연결 라이브러리 - mariadb-java-client (3.1.4) -->
    <!-- https://mvnrepository.com/artifact/org.mariadb.jdbc/mariadb-java-client -->
    <dependency>
      <groupId>org.mariadb.jdbc</groupId>
      <artifactId>mariadb-java-client</artifactId>
      <version>3.1.4</version>
    </dependency>

    <!-- 스프링 트랜잭션 라이브러리 - spring-tx 스프링 mvc 버전과 동일 -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-tx -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>5.3.20</version>
    </dependency>

    <!-- mybatis 라이브러리 - mybatis 3.4.0 -->
    <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>3.4.0</version>
    </dependency>

    <!-- mybatis-spring 1.3.2 -->
    <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis-spring -->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis-spring</artifactId>
      <version>1.3.2</version>
    </dependency>

    <!-- 구글 JSON : gson 2.7, jsoup 1.12.1, json 20200518 -->
    <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
    <dependency>
      <groupId>com.google.code.gson</groupId>
      <artifactId>gson</artifactId>
      <version>2.7</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.jsoup/jsoup -->
    <dependency>
      <groupId>org.jsoup</groupId>
      <artifactId>jsoup</artifactId>
      <version>1.12.1</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.json/json -->
    <dependency>
      <groupId>org.json</groupId>
      <artifactId>json</artifactId>
      <version>20200518</version>
    </dependency>


    <!-- jackson 라이브러리 - jackson-databind 2.9.4, jackson-mapper-asl 1.9.13 -->
    <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
      <version>2.9.4</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.codehaus.jackson/jackson-mapper-asl -->
    <dependency>
      <groupId>org.codehaus.jackson</groupId>
      <artifactId>jackson-mapper-asl</artifactId>
      <version>1.9.13</version>
    </dependency>


    <!-- 스프링 암호화 라이브러리 기본 엔진 spring-security-core 스프링mvc 버전과 동일 -->
    <!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-core -->
    <dependency>
      <groupId>org.springframework.security</groupId>
      <artifactId>spring-security-core</artifactId>
      <version>5.4.0</version>
    </dependency>


    <!-- 스프링 암호화 라이브러리 웹 용 spring-security-web 스프링mvc 버전과 동일  -->
    <!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-web -->
    <dependency>
      <groupId>org.springframework.security</groupId>
      <artifactId>spring-security-web</artifactId>
      <version>5.4.0</version>
    </dependency>

    <!-- 스프링 암호화 라이브러리 설정 spring-security-config 스프링mvc 버전과 동일 -->
    <!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-config -->
    <dependency>
      <groupId>org.springframework.security</groupId>
      <artifactId>spring-security-config</artifactId>
      <version>5.4.0</version>
    </dependency>

    <!-- 파일 첨부 및 업로드 라이브러리 commons-fileupload 1.3.2, commons-io 2.4  -->
    <!-- https://mvnrepository.com/artifact/commons-fileupload/commons-fileupload -->
    <dependency>
      <groupId>commons-fileupload</groupId>
      <artifactId>commons-fileupload</artifactId>
      <version>1.3.2</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
    <dependency>
      <groupId>commons-io</groupId>
      <artifactId>commons-io</artifactId>
      <version>2.4</version>
    </dependency>

    <!--  이미지 편집 라이브러리 imgscalr-lib 4.0 -->
    <!-- https://mvnrepository.com/artifact/org.imgscalr/imgscalr-lib -->
    <dependency>
      <groupId>org.imgscalr</groupId>
      <artifactId>imgscalr-lib</artifactId>
      <version>4.0</version>
    </dependency>

    <!-- 자바 이메일 기본 라이브러리 javax.mail-api 1.4.7 -->
    <!-- https://mvnrepository.com/artifact/javax.mail/javax.mail-api -->
    <dependency>
      <groupId>javax.mail</groupId>
      <artifactId>javax.mail-api</artifactId>
      <version>1.4.7</version>
    </dependency>

    <!-- 이메일 및 자원에 대한 외부 송출 라이브러리 spring-context-support 스프링mvc 버전과 동일 -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-context-support -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context-support</artifactId>
      <version>5.3.20</version>
    </dependency>

    <!-- java의 validation 라이브러리 validation-api 2.0.1.Final -->
    <!-- https://mvnrepository.com/artifact/javax.validation/validation-api -->
    <dependency>
      <groupId>javax.validation</groupId>
      <artifactId>validation-api</artifactId>
      <version>2.0.1.Final</version>
    </dependency>


    <!-- 폼 검증을 애노테이션으로 검증하는 라이브러리 hibernate-annotations 3.5.6-Final -->
    <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-annotations -->
    <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-annotations</artifactId>
      <version>3.5.6-Final</version>
    </dependency>

    <!-- hibernate Validator 라이브러리 hibernate-validator 6.0.8.Final, jaxb-api 2.3.0 -->
    <!-- https://mvnrepository.com/artifact/org.hibernate.validator/hibernate-validator -->
    <dependency>
      <groupId>org.hibernate.validator</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>6.0.8.Final</version>
    </dependency>
  </dependencies>
  <build>
    <finalName>pro03</finalName>
  </build>
</project>
```

## dispatcher-servlet
```
<?xml version="1.0" encoding="UTF-8"?>
<beans:beans xmlns="http://www.springframework.org/schema/mvc"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xmlns:beans="http://www.springframework.org/schema/beans"
             xmlns:context="http://www.springframework.org/schema/context"
             xsi:schemaLocation="http://www.springframework.org/schema/mvc https://www.springframework.org/schema/mvc/spring-mvc.xsd
       http://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">
    <!-- dispatcher-servlet.xml : 내부 웹 접근 및 처리 작업 설정 파일 -->

    <!-- 접근 자원에 대한 권한 설정, 실제로 디렉토리가 있어야 사용이 가능 -->
    <!-- webapp 이 root -->
    <resources mapping="/resources/**" location="/resources/"/>
    <resources mapping="/data/**" location="/data/"/>
    <resources mapping="/admin/**" location="/WEB-INF/views/admin" />
    <resources mapping="/board/**" location="/WEB-INF/views/board" />
    <resources mapping="/check/**" location="/WEB-INF/views/check"/>
    <resources mapping="/databank/**" location="/WEB-INF/views/databank"/>
    <resources mapping="/free/**" location="/WEB-INF/views/free"/>
    <resources mapping="/include/**" location="/WEB-INF/views/include"/>
    <resources mapping="/member/**" location="/WEB-INF/views/member"/>
    <resources mapping="/notice/**" location="/WEB-INF/views/notice"/>
    <resources mapping="/qna/**" location="/WEB-INF/views/qna"/>
    <resources mapping="/reservation/**" location="/WEB-INF/views/reservation"/>
    <resources mapping="/util/**" location="/WEB-INF/views/util"/>

    <!-- 리졸버에 대한 접두사와 접미사 설정 -->
    <!--
        ex)
        /notice/noticeList 를 호출할 경우 실제 경로인
        /WEB-INF/views, .jsp 를 합쳐서 불러옴
    -->
    <beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <beans:property name="prefix" value="/WEB-INF/views" /> <!-- 접두사 -->
        <beans:property name="suffix" value=".jsp" /> <!-- 접미사 -->
    </beans:bean>

    <!-- 멀티파트 리졸버 설정 -->
    <!-- 파일 업로드와 관련된 리졸버 설정 -->
    <beans:bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
        <beans:property name="maxUploadSize" value="10485768"/> <!-- 파일 업로드 최대 사이즈 지정 -->
    </beans:bean>

    <!-- 멀티파트 업로드 디렉토리 지정 -->
    <beans:bean id="uploadPath" class="java.lang.String">
        <!-- 개발자 서버에서 자신의 디렉토리 경로에 저장 -->
        <beans:constructor-arg value="D:\chunjae_frontend\spring\spring1\pro03\src\main\webapp\resources\upload" />
    </beans:bean>

    <!-- 기본 메인 패키지 및 컨트롤러 패키지 설정 -->
    <!-- 여기안에 컨트롤러 dto, dao 등을 만들어서 사용 -->
    <context:component-scan base-package="kr.ed.teaspoon"/>
    <annotation-driven /> <!-- 이게 없으면 연결이 안됨 -->

    <!-- 인터셉터 : 글쓰기와 같은 회원권한을 가진 경우는 반드시 로그인 페이지를 거쳐서 시도할 것  -->
<!--    <beans:bean id="sampleIntercepter" class="kr.ed.teaspoon.util.SampleIntercepter" />-->
<!--    <beans:bean id="adminIntercepter" class="kr.ed.teaspoon.util.AdminIntercepter" />-->
<!--    <interceptors>-->
<!--        <interceptor>-->
<!--            &lt;!&ndash; free 디렉토리 내의 모든 것은 sampleIntercepter 클래스에서 제시한 조건이 맞으면 접근 가능 &ndash;&gt;-->
<!--            <mapping path="/free/**"/>-->
<!--            <beans:ref bean="sampleIntercepter" />-->
<!--        </interceptor>-->
<!--        <interceptor>-->
<!--            &lt;!&ndash; admin 디렉토리 내의 모든 것은 adminIntercepter 클래스에서 제시한 조건이 맞으면 접근 가능 &ndash;&gt;-->
<!--            <mapping path="/admin/**"/>-->
<!--            <beans:ref bean="adminIntercepter" />-->
<!--        </interceptor>-->
<!--    </interceptors>-->
</beans:beans>
```

## spring-security.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<beans:beans xmlns="http://www.springframework.org/schema/security"
             xmlns:beans="http://www.springframework.org/schema/beans"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/security
    http://www.springframework.org/schema/security/spring-security.xsd">
    <!-- spring-security.xml : 암호화 패턴 설정 파일 -->
    <beans:bean id="bcryptPasswordEncoder" class="org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder" />
</beans:beans>
```
<?xml version="1.0" encoding="UTF-8"?>
<web-app version="2.5" xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee https://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">
  <display-name>Archetype Created Web Application</display-name>

  <!-- 빈 설정 파일 등록 -->
  <context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/applicationContext.xml</param-value>
  </context-param>

  <!-- 한글 깨짐 방지 -->
  <filter>
    <filter-name>encodingFilter</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
      <param-name>encoding</param-name>
      <param-value>UTF-8</param-value>
    </init-param>
  </filter>
  <filter-mapping>
    <filter-name>encodingFilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>

  <!-- 모든 서블릿과 필터가 공유하는 context spring 컨테이너 생성 -->
  <listener>
    <listener-class>org.springframework.web.context.ContextCleanupListener</listener-class>
  </listener>

  <!-- 내부 웹 접근 및 관련 처리 작업 설정 파일 : dispatcher -->
  <!-- 암호화 패턴 설정 파일 등록 : security -->
  <servlet>
    <servlet-name>appServlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>
        /WEB-INF/dispatcher-servlet.xml
        /WEB-INF/spring-security.xml
      </param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <!-- 이걸 안 넣으면 servlet의 servlet-name에 오류가 발생한다. -->
  <servlet-mapping>
    <servlet-name>appServlet</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
</web-app>
```

## log4j.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE log4j:configuration PUBLIC "-//APACH//DTD LOG4J 1.2//EN" "log4j.dtd">
<log4j:configuration>
    <appender name="console" class="org.apache.log4j.ConsoleAppender">
        <param name="Target" value="System.out"/>
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="%-5p:%c-%m%n"/>
        </layout>
    </appender>
    <logger name="org.springframework.core">
        <level value="info" />
    </logger>
    <logger name="org.springframework.beans">
        <level value="info" />
    </logger>
    <logger name="org.springframework.context">
        <level value="info" />
    </logger>
    <logger name="org.springframework.web">
        <level value="info" />
    </logger>
    <logger name="kr.ed.teaspoon.controller">
        <level value="info"/>
    </logger>
    <logger name="kr.ed.teaspoon.dao">
        <level value="info"/>
    </logger>
    <logger name="kr.ed.teaspoon.dto">
        <level value="info"/>
    </logger>
    <logger name="kr.ed.teaspoon.service">
        <level value="info"/>
    </logger>
    <logger name="kr.ed.teaspoon.util">
        <level value="info"/>
    </logger>
    <root>
        <priority value="info"/>
        <appender-ref ref="console"/>
    </root>
</log4j:configuration>
<!-- TRACE > DEBUG > INFO > WARN > ERROR > FATAL -->
```

## log4jdbc.log4j.properties
```
log4jdbc.drivers=org.mariadb.jdbc.Driver
log4jdbc.spylogdelegator.name=net.sf.log4jdbc.log.slf4j.Slf4jSpyLogDelegator
```

## logback.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <logger name="jdbc.sqlonly" level="DEBUG" />
    <logger name="jdbc.sqltiming" level="INFO" />
    <logger name="jdbc.audit" level="WARN" />
    <logger name="jdbc.resultset" level="ERROR" />
    <logger name="jdbc.resultsettable" level="ERROR" />
    <logger name="jdbc.connection" level="INFO" />

    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
        <layout class="ch.qos.logback.classic.PatternLayout">
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-4level [%logger.%method:%line]-
                %msg%n</pattern>
        </layout>
    </appender>

    <appender name="LOGFILE"
              class="ch.qos.logback.core.rolling.RollingFileAppender">
        <file>/WEB-INF/logback.log</file>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>logback.%d{yyyy-MM-dd}.log</fileNamePattern>
            <!-- 30일 지난 파일은 삭제한다. -->
            <maxHistory>30</maxHistory>
        </rollingPolicy>
        <encoder>
            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} %-4level [%logger.%method:%line]
                - %msg %n</pattern>
        </encoder>
    </appender>

    <!-- 로그의 레벨( 지정된 로그 레벨 이상만 수집 ) : DEBUG < INFO < WARN < ERROR < FATAL -->
    <logger name="myweb" additivity="false">
        <level value="INFO" />
        <appender-ref ref="LOGFILE" />
        <appender-ref ref="CONSOLE" />
    </logger>

    <root>
        <level value="INFO" />
        <appender-ref ref="CONSOLE" />
    </root>
</configuration>
```

## mybatis-config.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration PUBLIC
        "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<!-- mybatis 설정 -->
<configuration>
    <typeAliases>
        <!-- teaspoon 내의 모든 패키지 사용 가능 -->
        <package name="kr.ed.teaspoon"/>
    </typeAliases>
</configuration>
```

## sampleMapper.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC
        "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="sample">
    <!-- sql의 select 구문을 입력 -->
    <!-- resultType : 결과를 무슨 타입으로 볼 건지 설정 -->
    <select id="sampleList" resultType="kr.ed.teaspoon.dto.Sample">
        select * from sample
    </select>

    <!-- ? 대신 #{}을 사용, #{}는 mybatis의 값이다. -->
    <select id="sampleDetail" resultType="kr.ed.teaspoon.dto.Sample">
        select * from sample where no=#{no}
    </select>
    <select id="sampleCount" resultType="integer">
        select count(*) from sample
    </select>
    <insert id="sampleInsert">
        insert into sample values (default, #{name})
    </insert>
    <update id="sampleUpdate">
        update sample set name=#{name} where no=#{no}
    </update>
    <delete id="sampleDelete">
        delete from sample where no=#{no}
    </delete>
</mapper>
```
