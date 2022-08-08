
const API_URL = "https://floating-harbor-78336.herokuapp.com/fastfood"

$(function(){
    $('.btn-search').click(function(){
        // console.log("써치"); 
        const searchKeyword = $(".txt-search").val();
       search(1, 10, searchKeyword)
    });
});

//get : (제이쿼리) 서버에 데이터를 요청하고 가져오는 일을 쉽게 도와주는 녀석

function search(page,perPage,searchKeyword){
    if(typeof page !=="number" || page < 1) page = 1;
    if(typeof perPage!="number" || page<=0) perPage=10;
    $.get(API_URL,//요청할 URL/
    {page : page, perPage : perPage, searchKeyword : searchKeyword},//요청에 넘길 조건 
    function(data){ //요청에 의해서 응답이 왔을 때 실행될 함수
    const list=data.list;
    const total=data.total;
    $('.total').html('총'+total+"개의 패스트푸드점을 찾았다!");

    const $list = $('.list');

    for(let i = 0; i<list.length;i++){
        let item = list[i]; 

        const $elem = $('#item-template').clone().removeAttr("id");
        // const $clone = $elem.clone();
        // $clobe.removeAttr("id");         위에 거를 풀어쓴 결과

        $elem.find('.item-num').html(i+1);
        $elem.find('.item-name').html(item.name);
        $elem.find('.item-addr').html(item.addr);

        $list.append($elem);
    }
    showPaging(page, perPage, total);
    // console.log(data);
    //요청이 실행되면 함수를 불러와라 
});//텍스트 타입 
//서버로부터 받은 데이터를 변환해서 돌려줌
//ex : json, html 
}

function showPaging(page,perPage,total){
    const $paging = $('.paging').empty();
    let numPages = 5;
    let pageStart = Math.floor((page-1)/numPages)*numPages + 1;
    let pageEnd = pageStart + numPages -1;
    let totalPages  = Math.floor((total-1)/perPage) +1;
    if(pageEnd>totalPages)pageEnd = totalPages;

    //
    let prevPage = pageStart - 1;
    let nextPage = pageEnd + 1;
    if(prevPage < 1)prevPage = 1;
    if(nextPage > totalPages)nextPage = totalPages;

    const $prevElem = $(
        '<a href = "javascript:search('+prevPage+','+perPage+')">이전</a>)');
        $prevElem.addClass("prev");
        $paging.append($prevElem);


    for(let i=pageStart;i<=pageEnd;i++){
        //perPage 추가
        const $elem = $("<a href =  javascript:search(" + i + ")>" + i + "</a>"); 

        if(i===page){
            $elem.addClass("current");
            
        }
        $paging.append($elem);

    };
    const $nextElem = $(
        '<a href = "javascript:search('+nextPage+','+perPage+')">다음</a>)');
        $nextElem.addClass("next");
        $paging.append($nextElem);
}