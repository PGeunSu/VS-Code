<?php
  function cal1($age){
    if($age >= 18){
        $fee = 18000;
    }else if($age >= 11 && $age <= 17){
        $fee = 15000;
    }else if($age >= 4 && $age <= 10){
        $fee = 13000;
    }else{
        $fee = 0;
    }
    return $fee;
  }

  function cal2($day, $age){

    if($day = "주간"){
        if($age >= 18){
            $fee = 32000;
        }else if($age >= 11 && $age <= 17){
            $fee = 28000;
        }else if($age >= 4 && $age <= 10){
            $fee = 25000;
        }else{
            $fee = 0;
        }
    }

    if($day = "야간"){
        if($age >= 18){
            $fee = 29000;
        }else if($age >= 11 && $age <= 17){
            $fee = 25000;
        }else if($age >= 4 && $age <= 10){
            $fee = 22000;
        }else{
            $fee = 0;
        }
    }
    return $fee;
  }

  function cal3($age){
    if($age >= 18){
        $fee = 29000;
    }else if($age >= 11 && $age <= 17){
        $fee = 25000;
    }else if($age >= 4 && $age <= 10){
        $fee = 22000;
    }else{
        $fee = 0;
    }
    return $fee;
  }

  $age = 24;
  $day = "주간";
  $category = 3;

  if($category == 1){
    $money = cal1($age);
   }else if($category == 2){
    $money = cal2($day, $age);
   }else if($category == 3){
    $money = cal3($age);
   }
   
   if($category == 1){
    $cat = "일반 입장권";
   }else if($category == 2 && $day = "주간"){
    $cat = "자유이용권(주간)";
   }else if($category == 2 && $day = "야간"){
    $cat = "자유이용권(야간) ";
   }else{
    $cat = "빅5 이용권";
   }

   echo "입장권 종류 : $cat <br>";
   echo "입장객 나이 : $age 세<br>"; 
   echo "입장료 : $money 원<br>";
