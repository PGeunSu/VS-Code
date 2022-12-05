$(function(){
    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        
       
    for(var i = 0; i < 5; i++){
            $("section > article").eq(i).css({ transform: "translateZ(" + (-5000 * i + sct) + "px)"});
        }
 
});
});