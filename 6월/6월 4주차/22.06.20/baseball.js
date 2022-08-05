

//컴퓨터 3자리 값 출력
let randomNum =[]
for(i=0;i<3;i++){
    comNum = Math.floor(Math.random()*9+1)
    if(randomNum.indexOf(comNum)===-1){
        randomNum.push(comNum) 
    }
    else{
        i--
    }
}

console.log(randomNum)

// 3자리값 연속적으로 입력 받기
let playNum = new Array(3);

    for(let i=0 ; i<playNum.length ; i++) {
		playNum[i] = Number(prompt("1 ~ 9 \n반복되지 않는 정수 입력",""));
	}
    
    //스트라이크 확인

    let ball = 0;
    let strike = 0;

    for (let i = 0; i < 3; i++) {
        if (comNum[i] == playNum[i]) { //같은 자리이면 strike
            strike++;
        }
    }

    console.log(strike,ball)