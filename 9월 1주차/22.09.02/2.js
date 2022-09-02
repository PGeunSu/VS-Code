
  

$(function () {

    $("article").on('mousewheel',function(e){		
        var wheelDelta = e.originalEvent.wheelDelta;		
        if(wheelDelta > 0){			
            console.log("up");			
            $(this).scrollLeft(-wheelDelta + $(this).scrollLeft());		
        }else{		console.log("down");			
        $(this).scrollLeft(-wheelDelta + $(this).scrollLeft());	
    	}});
    

$(window).scroll(function () {
    
   var sct = ($(this).scrollLeft())


if(sct >= $("article").eq(0).offset().left){
    $("nav ul li").removeClass("on");
    $("nav ul li").eq(0).addClass("on");
  }
  if(sct >= $("article").eq(1).offset().left){
    $("nav ul li").removeClass("on");
    $("nav ul li").eq(1).addClass("on");
  }
  if(sct >= $("article").eq(2).offset().left){
    $("nav ul li").removeClass("on");
    $("nav ul li").eq(2).addClass("on");
  }
  if(sct >= $("article").eq(3).offset().left){
    $("nav ul li").removeClass("on");
    $("nav ul li").eq(3).addClass("on");
  }

 });

 $('article').mousewheel(function(event,d){
    if(d>0){ //휠을 위로 올릴 때
        let prev = $(this).prev().offset().top;
        $('html,body').stop().animate({scrollLeft : prev},1000,'easeOutBounce')

    }
    if(d<0){ //휠을 아래로 내릴 때
        let next = $(this).next().offset().top;
        $('html,body').stop().animate({scrollLeft : next},1000,'easeOutBounce'   )

    }
});



});
