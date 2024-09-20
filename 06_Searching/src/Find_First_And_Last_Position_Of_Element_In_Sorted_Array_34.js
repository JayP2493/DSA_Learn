/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const searchRange = function(nums, target) {
    let ans = [-1,-1];
    ans[0] = search(nums,target,true);

    if (ans[0] != -1) {
        ans[1] = ans[1] = search(nums,target,false);
    }

    return ans;
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