// https://www.hackerrank.com/challenges/30-review-loop

function processData(input) {
  const arr = input.split('\n');
  arr.shift();

  for (const word of arr) {
    let even = '';
    let odd = '';

    for (let i = 0; i < word.length; i++) {
      if (i % 2 === 0) {
        even += word[i];
      } else {
        odd += word[i];
      }
    }

    console.log(`${even} ${odd}`);
  }
}
