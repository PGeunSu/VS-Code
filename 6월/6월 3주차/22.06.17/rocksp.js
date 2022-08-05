

const scissors= '가위';
const rock= '바위';
const paper= '보';
const money= 10000;

const input =prompt('가위 바위 보')

if (input !== scissors && input !== rock && input !== paper) {
    alert('가위, 바위, 보 중 하나를 입력해야 합니다!');
}

const coin = Number(prompt("베팅 금액을 입력해주세요. \n최소 금액 1000원"));


if(coin <= 1000){
    alert('최소 금액은 1000원 이상입니다!')
}
let pc =Math.random() ;

if(pc < 0.33){
    pc=scissors;
}
else if(pc < 0.66 ){
    pc=rock;
}
else {
    pc=paper; 
}

switch(input){
    case scissors:
        switch(pc){
            case scissors:
            money;
            break;
            case rock: 
            money-coin;
                break;
                case paper: 
                money+coin*2;
                    break; 
        }
    }
        


    //     break;
    //     case rock:
    //     switch(pc){
    //         case scissors : 
    //         break;
    //         case rock:
    //             break;
    //             case paper: 
    //                 break;
    //     }
    //     break;
    //     case papaer:
    //     switch(pc){
    //         case scissors: 
    //         break;
    //         case rock: 
    //             break;
    //             case paper: 
    //                 break;
    //     }
    // }
