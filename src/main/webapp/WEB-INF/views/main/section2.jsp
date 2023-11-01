<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.servletContext.contextPath }" />

<link rel="stylesheet" href="${path1}/resources/css/common.css">
<section class="section latest-blog">
    <div class="container">
        <div class="columns is-justify-content-center is-desktop">
            <div class="column is-7-desktop has-text-centered">
                <div class="section-title">
                    <span class="h6 text-color">Latest News</span>
                    <h2 class="mt-4 content-title">Latest articles to Education knowledge</h2>
                </div>
            </div>
        </div>
        <div class="main-featured">
            <div class="item">
                <h1 class="heading">News</h1>
                <a href="/media/press/view/1/55" class="article-card">
                    <div class="img">
                        <img src="${path1}/resources/upload/noimg1.jpg" alt="">
                    </div>
                    <div class="txt">
                        <div class="tag">
                            <ul>
                                <li>#교육</li>
                                <li>#지속가능한 교육</li>
                                <li>#혁신</li>
                            </ul>
                        </div>
                        <div class="heading">AI로 공부하는 암기 과목, 천재교육 밀크티 기말고사 오픈</div>
                        <div class="date">2023.10.31</div>
                    </div>
                </a>
            </div>

            <div class="item">
                <h1 class="heading">Culture</h1>
                <a href="/story/work/view/1/8" class="article-card">
                    <div class="img">
                        <img src="${path1}/resources/upload/noimg2.jpg" alt="">
                    </div>
                    <div class="txt">
                        <div class="tag">
                            <ul>
                                <li>#미래를 대비하는 우리의 자세</li>
                                <li>#교육 필진</li>
                            </ul>
                        </div>
                        <div class="heading">천재교육, 'HME 학력평가' 실시…누적 응시자 224만여명</div>
                        <div class="date">2023.10.31</div>
                    </div>
                </a>
            </div>

            <div class="item">
                <h1 class="heading">Future</h1>
                <a href="/story/culture/view/1/10" class="article-card">
                    <div class="img">
                        <img src="${path1}/resources/upload/noimg3.jpg" alt="">
                    </div>
                    <div class="txt">
                        <div class="tag">
                            <ul>
                                <li>#고등수학</li>
                            </ul>
                        </div>
                        <div class="heading">"고등수학 내신 대비"…천재교육, '개념.ZIP' 기본서 출간</div>
                        <div class="date">2023.10.30</div>
                    </div>
                </a>
            </div>
        </div>
        <div class="main-peoples animated">
            <img src="https://www.woowayouths.com/assets/img/main/people_01.png" class="img1" alt="">
            <img src="https://www.woowayouths.com/assets/img/main/people_02.png" class="img2" alt="">
            <img src="https://www.woowayouths.com/assets/img/main/people_03.png" class="img3" alt="">
            <img src="https://www.woowayouths.com/assets/img/main/people_04.png" class="img4" alt="">
            <img src="https://www.woowayouths.com/assets/img/main/people_05.png" class="img5" alt="">
            <div class="txt">
                <p>오늘보다 더 나은 교육을 향해<br>출발 준비 완료!</p>
                <strong>우리는 <b>스마트 해법</b> 입니다.</strong>
            </div>
        </div>
        <script>

            $(window).scroll(function(e) {
                var trigger_top = $(window).scrollTop() + $(window).height() - ($(window).height() * .2);
                if (trigger_top >= $('.main-peoples').offset().top) {
                    $('.main-peoples').addClass('animated');
                }
            }).scroll();

        </script>
        </div>
    </div>
</section>
