/**
 * @param {number[]} nums
 * @return {number[]}
 */
const buildArray = function(nums) {
    arr(nums,0);
    return nums;
}

function arr (nums,start) {
    if (start < nums.length) {
        let ans = nums[nums[start]];
        arr(nums,start+1);
        nums[start] = ans;
    }
}

console.log(buildArray([0,2,1,5,3,4]));
console.log(buildArray([5,0,1,2,3,4]));