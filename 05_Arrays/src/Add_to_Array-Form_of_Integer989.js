/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
const addToArrayForm = function (num, k) {
    let ansArr = [];

    for (let i = num.length-1; i >= 0; i--) {
        let sum = num[i]+k;
        ansArr.push(sum%10);
        k = Math.floor(sum/10);
    }

    while (k > 0) {
        ansArr.push(k%10);
        k = Math.floor(k/10);
    }

    ansArr.reverse();

    return ansArr;
};

console.log(addToArrayForm([1,2,0,0],34))
console.log(addToArrayForm([2,7,4],181))
console.log(addToArrayForm([2,1,5],806))
console.log(addToArrayForm([1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3],516))
