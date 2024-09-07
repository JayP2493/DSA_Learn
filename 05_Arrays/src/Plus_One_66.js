/**
 * @param {number[]} digits
 * @return {number[]}
 */
const plusOne = function(digits) {
    if (digits[digits.length-1] < 9) {
        digits[digits.length-1]++;
        return digits;
    } else {
        let k = 1;

        for (let i = 0; i < digits.length; i++) {
            let sum = digits[digits.length-1-i]+k;
            digits[digits.length-1-i] = sum%10;
            k = Math.floor(sum/10);
        }

        if (k) {
            digits.unshift(1);
        }
    }

    return digits;
};

console.log(plusOne([1,2,3]))
console.log(plusOne([1,2,9]))
console.log(plusOne([9,9,9]))
console.log(plusOne([4,3,2,1]))
console.log(plusOne([9]))