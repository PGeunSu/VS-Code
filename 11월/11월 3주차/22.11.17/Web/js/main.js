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

        onSlideBefore:function(){},
        onSlideAfter : function(){
            var k = bx.getCurrentSlide();
            $(".slider li").find("h2").removeClass("on");
            $(".slider li").find("p").removeClass("on");
            $(".slider li .text" + k).addClass("on");
            $(".slider li .atext" + k).addClass("on");
        
        } 
    });
});