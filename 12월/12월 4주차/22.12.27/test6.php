<?php
    $result = 90;
    $grade = "";

    if($result >= 90 && $result <= 100){
        $grade = "A+";
    }elseif($result >= 80 && $result < 90 ){
        $grade = "B+";
    }elseif($result >= 70 && $result < 80 ){
        $grade = "C+";
    }elseif($result >= 60 && $result < 70 ){
        $grade = "D+";
    }else{
        $grade = "F";
    }

    echo "입력된 점수 : $result 점<br>";
    echo "등급 : $grade";

    

?>