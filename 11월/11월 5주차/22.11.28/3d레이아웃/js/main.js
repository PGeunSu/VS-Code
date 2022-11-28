$(function(){
    $(".btnMenu").on("click",function(){
        $("nav, section").addClass("on");
        $(".btnMenu").css({"display" : "none"});
    });

    $("nav li").on("click", function(){
        $("section div, nav, section").removeClass("on");
        $(".btnMenu").css({"display" : "block"});
    
        var i = $(this).index();
        console.log(i);
        
        $('section > div').eq(i).addClass('on');
});


});