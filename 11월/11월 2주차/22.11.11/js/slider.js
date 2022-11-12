$(function(){
    $(".bxslider").bxSlider({
        auto: true, //false - 기본값 (자동 슬라이드)
        mode : "fade", //슬라이드(수평(default) - horizontal), (수직 - vertical),(fade - 나타났다 사라짐)
        //pause : 2000, 실제 슬라이드 속도
        //speed : 500, 사진이 넘어가는 속도
        controls : false, //화살표 숨김 
        pager : false, // pager- 블릿 숨김

    });

    $(".bxslider2").bxSlider({
        auto : true,
        moveSlides : 2, //한번에 슬라이드 되는 사진 수
        minSlides : 1,
        maxSlides : 4,
        slideWidth : 230,
        slideMargin : 10,
    });
});

