$(function(){
    $(".btn1").click(function(){
        if($(".art1 ul li").hasClass("on") === true){
            $(".art1 ul li").removeClass("on"); 
        }else{
            $(".art1 ul li").eq(0).addClass("on");
            return false;
        }   
    });
});