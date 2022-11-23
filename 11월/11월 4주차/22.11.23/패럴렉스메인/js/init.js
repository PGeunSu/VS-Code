$(function () {
    var ht;
    $(window).resize(function(){
        ht = $(window).height(); //현재 브라우저의 높이를 구함
        $("section").height(ht); //브라우저의 높이값을 가져와서 컨텐츠 영역에 대입
    });

    $(window).trigger("resize"); //브라우저를 켜자마자 강제로 resize실행

    //왼쪽에 메뉴를 클릭할 때 마다 스크롤하는 기능
    $("#menu li").click(function(){
        var i = $(this).index(); //현재 클릭한 곳의 인덱스를 구한다.
        //$(this).addClass("on");
        //$("#menu li").removeClass("on");
        //$("#menu li").eq(i).addClass("on");

        // var ii = $("section").eq(i).offset().top;
        // $("html,body").stop().animate({ scrollTop : ii },1300);
        $("html,body").stop().animate({ scrollTop : ht * i },1300);

        return false;

        
    });
    $(window).on("scroll",function(){
        var sct = $(window).scrollTop();

        /*
        if(sct >= ht * 0 && sct < ht * 1){
            $("#menu li").removeClass("on");
            $("#menu li").eq(0).addClass("on");
        }
        if(sct >= ht * 1 && sct < ht * 2){
            $("#menu li").removeClass("on");
            $("#menu li").eq(1).addClass("on");
        }
        if(sct >= ht * 2 && sct < ht * 3){
            $("#menu li").removeClass("on");
            $("#menu li").eq(2).addClass("on");
        }
        if(sct >= ht * 3 && sct < ht * 4){
            $("#menu li").removeClass("on");
            $("#menu li").eq(3).addClass("on");
        }
        
    });
   
        for(i = 0; i < 5; i++){
            if(sct >= ht * i && sct < ht * (i + 1)){
                $("#menu li").removeClass("on");
                $("#menu li").eq(i).addClass("on");
            }
        }
         */

        var i = 0;
        $("#menu li").each(function(i){
            if(sct >= ht * i && sct < ht * (i + 1)){
                $("#menu li").removeClass("on");
                $("#menu li").eq(i).addClass("on");
            }
        });

        $("section").mousewheel(function(event ,d){
            if(d > 0){
                var prev = $(this).prev().offset().top;
                $("html, body").stop().animate({ scrollTop: prev}, 500, "easeOutBounce");
            }
            if(d < 0){
                var next = $(this).next().offset().top;
                $("html, body").stop().animate({ scrollTop: next}, 500, "easeOutBounce");
            }
        });

    });

    $("section").on("mousemove", function (e) {
        var posX = e.pageX;
        var posY = e.pageY;
        
        //1페이지
        $(".p11").css({
            right : 20 - posX / 30, bottom : 20 - posY / 30
        });
        $(".p12").css({
            right : 130 - posX / 20, bottom : -40 - posY / 20,
        });
        $(".p13").css({
            right : 60 + posX / 20, bottom : 180 - posY / 20,
        });

        //2페이지
        $('.p21').css({
            'right':-180 - (posX/30), 'bottom':-480 - (posY/30)
        });
        $('.p22').css({
            'right':130 + (posX/50), 'bottom':-40 + (posY/50)
        });

        //3페이지
        $('.p31').css({ 
            'right':280 - (posX/30), 'bottom':30 - (posY/30)
        });
        $('.p32').css({
            'right':110 + (posX/20),  'bottom':-270 +  (posY/20)
        });
        $('.p33').css({
            'right':-70 + (posX/20),'bottom':-130 + (posY/20)
        });
    
        //4페이지
        $('.p41').css({
        'right':20 - (posX/30), 'bottom':-120 - (posY/30)
        });
        $('.p42').css({
        'right':0 - (posX/20), 'bottom':-180 - (posY/20)
        });
    });


    //팝업창

    $(".popup").draggable();

    if($.cookie("popup") == "none"){
        $(".popup").hide();
    }
    
    $(".btn2").click(function(){
        $(".popup").fadeOut("fast");
    });
    
    $(".btn1").click(function(){
        $.cookie("popup", "none", {expires : 1});
        $(".popup").fadeOut("fast");
    });
});

