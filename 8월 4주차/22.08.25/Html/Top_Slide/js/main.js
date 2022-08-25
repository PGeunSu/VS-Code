$(function(){
    $(".img_slide li").css("top","100%");
    $(".img_slide li").eq(0).css("top",0);
    //첫번 째(equal 0번) 사진만 보이는 위치

    let i =0;

    setInterval(auto,2000);

    function auto(){
      i++;
      if(i==3){
        i=0;
      }
      $(".img_slide li").eq(i).css("top","100%").animate({"top":0},1000);
      $(".img_slide li").eq(i-1).css("top",0).animate({"top":"-100%"},1000);
    }
});