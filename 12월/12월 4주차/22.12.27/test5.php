<?php
    $h = 170;
    $w = 50;
    $a = ($h - 100) * 0.9;

echo ("키 : $h <br>");
echo ("몸무게 : $w <br>");

if($w > $a)
    echo "체중 조절 필요";
else
    echo "체중 조절 필요 x";

?>