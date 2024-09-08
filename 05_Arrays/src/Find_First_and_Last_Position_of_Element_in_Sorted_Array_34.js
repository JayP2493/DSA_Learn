/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const searchRange = function(nums, target) {
    const ans = [-1,-1];
    ans[0] = first(nums,target);
    ans[1] = last(nums,target);


    function first (nums,target) {
        let ans = -1;
        let start = 0;
        let end = nums.length-1;

        while (start <= end) {
            let mid = Math.floor(start + ((end-start)/2));

            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] === target) ans = mid;
        }

        return ans;
    }

    function last (nums,target){
        let ans = -1;
        let start = 0;
        let end = nums.length-1;

        while (start <= end) {
            let mid = Math.floor(start + ((end-start)/2));

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] === target) ans = mid;
        }

        return ans;
    }

    return ans;
};

console.log(searchRange([5,7,7,8,8,10],8))