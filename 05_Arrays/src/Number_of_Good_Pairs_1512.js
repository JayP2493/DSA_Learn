/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    let arr = [];
    let ans = 0;

    for (let num of nums) {
        if(!arr[num]) {
            arr[num] = 1;
        } else {
            arr[num]++;
        }
    }

    for (let i of arr) {
        if (i) {
            ans += ((i * (i-1))/2);
        }
    }

    return ans;
};

console.log(numIdenticalPairs([1,2,3,1,1,3]))