const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter a list of numbers separated by spaces: ', (userInput) => {
  // Split the user input into an array of numbers
  const numbers = userInput.split(' ').map(Number);

  if (!isValidInput(numbers)) {
    console.log('Invalid input. Please enter numbers separated by spaces.');
    rl.close();
    return;
  }

  // Sort the array in descending order
  numbers.sort((a, b) => b - a);

  console.log('Sorted array in descending order:', numbers);
  rl.close();
});

function isValidInput(arr) {
  // Check if the input is an array of numbers
  return Array.isArray(arr) && arr.every(number => !isNaN(number));
}
