// Question 1: Sum of all natural numbers from 1 to n
function sumof(number){
    let sum = 0;
    for (let i=1; i<=number; i++){
        sum = sum + i;
    }
    return sum;

}
console.log(sumof(5));
console.log(sumof(20));

//Question 2: Sum of digits of a number
