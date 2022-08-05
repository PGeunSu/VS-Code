
let comScore = 0;
let userScore = 0;


function game(){

    const textElem=document.getElementById("text")
    const shootType=Math.random()<0.5? 2:3;

if(shootType===2){
if(Math.random()<0.5){
    textElem.innerHTML = "컴퓨터 : 2점슛 성공"
    comScore +=2;
    document.getElementById("comScore").innerHTML = comScore;

}
else{   
    textElem.innerHTML="컴퓨터 : 2점슛 실패"
}
}
else{
    if(Math.random()<0.33){
    textElem.innerHTML="컴퓨터 : 3점슛 성공"
    comScore += 3;
    document.getElementById("comScore").innerHTML = comScore;
    }
    else{
    textElem.innerHTML="컴퓨터 : 3점슛 실패"

    }
}



// function onUser(){  

    if(round<1){
        alert("게임이 종료 되었습니다")
        if(comScore > userScore){
            alert("스코어 결과 :\n"+comScore+" : "+userScore+"\nLose")}
            if(comScore < userScore){
                alert("스코어 결과 :\n"+comScore+" : "+userScore+"\nwin")
            }
            return;
}
    

    const textElem1=document.getElementById("text1")
    const shootType1=Math.random()<0.5? 2:3;
    round--;
    document.getElementById("round").innerHTML = round;

if(shootType1===2){
if(Math.random()<0.5){
    textElem1.innerHTML = "유저 : 2점슛 성공"
    userScore +=2;
    document.getElementById("userScore").innerHTML = userScore;

}
else{   
    textElem1.innerHTML="유저 : 2점슛 실패"
}
}
else{
    if(Math.random()<0.33){
    textElem1.innerHTML="유저 : 3점슛 성공"
    userScore += 3;
    document.getElementById("userScore").innerHTML = userScore;
    }
    else{
    textElem1.innerHTML="유저 : 3점슛 실패"

    }
}
}
let round = 15;

function reset(){
    comScore = 0;
    userScore = 0;
    round = 15;
    document.getElementById("userScore").innerHTML = userScore;
    document.getElementById("comScore").innerHTML = comScore;
    document.getElementById("round").innerHTML = round;
}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ2,3점슛 나눈 거
// }
// function onUser2(){

//     const textElem=document.getElementById("text")
//     const shootType=Math.random()<0.5? 2:3;

//     round--;
//     document.getElementById("round").innerHTML = round;

// if(shootType===2){
// if(Math.random()<0.5){
//     textElem.innerHTML = "2점슛 성공"
//     userScore +=2;
//     document.getElementById("userScore").innerHTML = userScore;

// }
// else{
//     textElem.innerHTML="2점슛 실패"
// }
// }
// }
// function onUser3(){
  
//     const textElem=document.getElementById("text")
//     const shootType=Math.random()<0.5? 2:3;
    
//     round--;
//     document.getElementById("round").innerHTML = round;

// if(shootType===2){
// if(Math.random()<0.33){
//     textElem.innerHTML="3점슛 성공"
//     userScore += 3;
//     document.getElementById("userScore").innerHTML = userScore;
//     }
//     else{
//     textElem.innerHTML="3점슛 실패"

//     }
// }
// }




// 유저 만들기
//2점 슛, 3점슛