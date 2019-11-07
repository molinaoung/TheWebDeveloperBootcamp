
function isEven(num){
	if(num%2 === 0){
		return true;
	}
	else{
		return false;
	}
}

isEven(4);

//Quicker version
//num % 2 === 0; is a true or false statement. returns value immediately

// function isEven(num){
// 	return num % 2 === 0;
// }


function factorial(num2){

var result =1;

for(var i=2;i<=num2;i++){
	result *= i;
}
return result; 
}

function kebabToSnake(str){
	//replace all '-' with "_"
	var newStr = str.replace(/-/g, "_");
	//capture new copy in newStr variable
	return newStr;
}

kebabToSnake("hello-friend")