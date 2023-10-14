const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Function to reverse every word in a sentence
function reverseSentence(sentence) {
  // Split the sentence into words
  const words = sentence.split(' ');

  // Reverse each word and join them back into a sentence
  const reversedSentence = words.map(word => reverseWord(word)).join(' ');

  return reversedSentence;
}

// Function to reverse a single word
function reverseWord(word) {
  return word.split('').reverse().join('');
}


rl.question('Enter a sentence: ', (userInput) => {
  const reversedSentence = reverseSentence(userInput);
  console.log('Reversed sentence: ' + reversedSentence);
  rl.close();
});