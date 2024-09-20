/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const searchRange = function(nums, target) {
    return [search(nums,target,true),search(nums,target,false)];
};

function search (nums,target,dir) {
    let start = 0;
    let end = nums.length-1;
    let ans = -1;

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2);

        if (nums[mid] > target) {
            end = mid - 1;
        } else if (nums[mid] < target) {
            start = mid + 1;
        } else {
            ans = mid;
            if (dir) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    return  ans;
}