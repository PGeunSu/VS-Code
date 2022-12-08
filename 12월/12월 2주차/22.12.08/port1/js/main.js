$(function(){
    setTimeout(function(){
        $(".slider li .text0").addClass("on");
        $(".slider li .atext0").addClass("on");
    }); 
});

$(function(){
    var bx = $(".slider").bxSlider({
        auto : true,
        controls : false,
        page : false,
        mode : "fade",
        pause : 5000,
        autoHover : true,
        onSlideBefore:function(){},
        onSlideAfter : function(){
            var k = bx.getCurrentSlide();
            $(".slider li").find("h2").removeClass("on");
            $(".slider li").find("p").removeClass("on");
            $(".slider li .text" + k).addClass("on");
            $(".slider li .atext" + k).addClass("on");
        
        } 
    });

    var a1 = $(".s2_title img").offset().top;
    var a2 = $(".s2_title h2").offset().top;
    var a3 = $(".s2_title p").offset().top;
    var a4 = $(".s2_table li").offset().top;

    console.log(a1,a2,a3,a4);

    $(window).scroll(function(){
        var sct = $(this).scrollTop(); //스크롤의 위치값
        if(a1 < sct + 700){
            $(".s2_title img").addClass("slide");
        }
        if(a2 < sct + 700){
            $(".s2_title h2").addClass("slide");
        }
        if(a3 < sct + 700){
            $(".s2_title p").addClass("slide");
        }
        if(a4 < sct + 700){
            $(".s2_table li").eq(0).addClass("slide");
            setTimeout(function(){
                $(".s2_table li").eq(1).addClass("slide");
            },300)
            setTimeout(function(){
                $(".s2_table li").eq(2).addClass("slide");
            },600)
            setTimeout(function(){
                $(".s2_table li").eq(3).addClass("slide");
            },900)
        }
    });

    var b1 = $(".s3_title img").offset().top;
    var b2 = $(".s3_title h2").offset().top;
    var b3 = $(".s3_title p").offset().top;
    var b4 = $(".s3_table li").offset().top;

    console.log(b1,b2,b3,b4);

    $(window).scroll(function(){
        var sct = $(this).scrollTop(); //스크롤의 위치값
        if(b1 < sct + 700){
            $(".s3_title img").addClass("slide");
        }
        if(b2 < sct + 700){
            $(".s3_title h2").addClass("slide");
        }
        if(b3 < sct + 700){
            $(".s3_title p").addClass("slide");
        }
        if(b4 < sct + 700){
            $(".s3_table li").eq(0).addClass("slide");
            setTimeout(function(){
                $(".s3_table li").eq(1).addClass("slide");
            },300)
            setTimeout(function(){
                $(".s3_table li").eq(2).addClass("slide");
            },600)
            setTimeout(function(){
                $(".s3_table li").eq(3).addClass("slide");
            },900)
            setTimeout(function(){
                $(".s3_table li").eq(4).addClass("slide");
            },1200)
        }
    });

    var c1 = $(".s4_title img").offset().top;
    var c2 = $(".s4_title h2").offset().top;
    var c3 = $(".s4_title p").offset().top;
    var c4 = $(".s4_table li").offset().top;

    console.log(c1,c2,c3,c4);

    $(window).scroll(function(){
        var sct = $(this).scrollTop(); //스크롤의 위치값
        if(c1 < sct + 700){
            $(".s4_title img").addClass("slide");
        }
        if(c2 < sct + 700){
            $(".s4_title h2").addClass("slide");
        }
        if(c3 < sct + 700){
            $(".s4_title p").addClass("slide");
        }
        if(c4 < sct + 700){
            $(".s4_table li").eq(0).addClass("slide");
            setTimeout(function(){
                $(".s4_table li").eq(1).addClass("slide");
            },300)
            setTimeout(function(){
                $(".s4_table li").eq(2).addClass("slide");
            },600)
            setTimeout(function(){
                $(".s4_table li").eq(3).addClass("slide");
            },900)
           
        }
    });

    var d1 = $("#s5").offset().top;
    var e1 = $("#s6").offset().top;
    var f_box = $(".fix_box").offset().top;

    $(window).scroll(function(){
        var sct = $(this).scrollTop(); //스크롤의 위치값
        $(".fix_box").stop().animate({top:sct+f_box},500);
        if(d1 < sct + 700){
            $(".s5_contents").addClass("slide1");
        }
        if(e1 < sct + 700){
            $(".left1").addClass("slide1");
        }
        
});

$('.popup1').draggable();

if($.cookie("popup1") == "none"){
    $(".popup1").hide();
}

$(".btn2").click(function(){
    $(".popup1").fadeOut("fast");
});

$(".btn1").click(function(){
    $.cookie("popup1", "none", {expires : 1});
    $(".popup1").fadeOut("fast");
})




});