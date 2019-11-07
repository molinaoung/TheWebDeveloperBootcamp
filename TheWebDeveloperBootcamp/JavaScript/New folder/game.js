//Create secretNumber
var secretNumber = 4;

//Ask user for guess
var guess = Number(prompt("Guess a number"));

//Can do it this way too ^
// var stringGuess = prompt("Guess a number");
// var guess = Number(stringGuess);

//Check if guess is right
if (guess === secretNumber){
	alert("YOU GOT IT RIGHT");
	console.log("You guessed the number correctly!");
}
else if(guess < secretNumber){
	console.log("Your guess is too low. Please try again!");
}
else{
	console.log("Your guess is too high. Please try again!");
}
