$(function(){
    $(".img_slide li").css("left","100%");
    $(".img_slide li").eq(0).css("left",0);
    //첫번 째(equal 0번) 사진만 보이는 위치

    let i =0;

    setInterval(auto,2000);

    function auto(){
      i++;
      if(i==3){
        i=0;
      }
      $(".img_slide li").eq(i).css("left","100%").animate({"left":0},1000);
      $(".img_slide li").eq(i-1).css("left",0).animate({"left":"-100%"},1000);
    }
});