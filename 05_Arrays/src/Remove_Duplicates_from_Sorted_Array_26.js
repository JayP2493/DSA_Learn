/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let a = 0;
    let b = 0;

    while ( b < nums.length) {
        if (nums[a] !== nums[b]) {
            nums[++a] = nums[b];
        } else {
            b++;
        }
    }

    return ++a;
};