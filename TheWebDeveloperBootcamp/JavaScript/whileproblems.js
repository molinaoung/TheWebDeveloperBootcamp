console.log("PRINT ALL NUMBERS BETWEEN -10 and 19");
var num = -10;

while(num<20){
	console.log(num);

num++;
}

console.log("PRINT ALL EVEN NUMBERS BETWEEN 10 and 40");
var num1 = 10;
while(num1<42){
	if(num1%2 == 0){
		console.log(num1);
	}
num1++;
}
//Alternative method
// var num1 = 10;
// while(num1<=40){
// 		console.log(num1);
// num1+=2;
// }


console.log("PRINT ALL ODD NUMBERS BETWEEN 300 and 333");
var num2 = 300;
while(num2<334){
	if(num2%2 == 1){
		console.log(num2);
	}
num2++;
}

//can also do num2 % 2!== 0;

console.log("PRINT ALL NUMBERS DIVISIBLE BY 5 and 3 between 5 and 50");
var num3 = 5;
while(num3<51){
	if(num3%5 == 0 && num3%3 ==0 ){
		console.log(num3);
	}
num3++;
}
