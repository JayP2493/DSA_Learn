/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    let ansArr = [];
    let j = 0;

    for(let i = 0; i < n; i++) {
        ansArr[j++] = nums[i];
        ansArr[j++] = nums[i+n];
    }

    return ansArr;
};