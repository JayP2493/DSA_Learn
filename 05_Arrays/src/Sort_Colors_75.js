/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
const sortColors = function(nums) {
    let temp = Array.from(nums);

    let start = 0;
    let end = nums.length-1;

    for (let i = 0; i < nums.length; i++) {
        if (temp[i] === 0) {
            nums[start] = temp[i];
            start++
        } else if (temp[i] === 2) {
            nums[end] = temp[i];
            end--;
        }
    }

    while (start <= end) {
        nums[start] = 1;
        start++;
    }
};