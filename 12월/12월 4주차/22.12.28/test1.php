<?php
    function hello(){
        echo ("안녕!");
    }

    function plus($a, $b){
        $c = $a + $b;
        echo $c;
    }

$result1 = plus(10,20);
echo $result1 . "<br>";

$result2 = plus(300,500);
echo $result2 . "<br>";