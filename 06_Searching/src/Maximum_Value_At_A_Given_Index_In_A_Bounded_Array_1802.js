/**
 * @param {number} n
 * @param {number} index
 * @param {number} maxSum
 * @return {number}
 */
var maxValue = function(n, index, maxSum) {
    let start = 1;
    let end = maxSum;
    let ans = 0;

    while (start <= end) {
        let mid = Math.floor(start + (end-start)/2);
        let totalSum = mid + sum(index,mid) + sum(n-1-index,mid);

        if (totalSum <= maxSum) {
            ans = mid;
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return ans;
};

function sum (count,val) {
    let x = Math.min(count,val-1);
    let sum = (val*x) - (x*(x+1))/2;

    sum += Math.max(0,count-val+1);

    return sum;
}

console.log(maxValue(4,2,6))
console.log(maxValue(6,1,10))
console.log(maxValue(8,7,14))
console.log(maxValue(4,0,4))
console.log(maxValue(4,0,395252961))
console.log(maxValue(9,5,24))
console.log(maxValue(9,5,24))