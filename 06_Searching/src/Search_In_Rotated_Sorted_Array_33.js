/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let start = 0;
    let end = nums.length - 1;

    while (start <= end) {
        let mid = start + ((end-start) >> 1);


        if (nums[mid] == target) {
            return mid;
        }

        // left sorted right unsorted
        if(nums[start] < nums[mid] || nums[end] < nums[mid]) {
            if (target >= nums[start] && target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else if(nums[start] > nums[mid] || nums[end] > nums[mid]) {
            if (target <= nums[end] && target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } else {
            end--;
            start++;
        }
    }

    return -1;
};

console.log(search([4,5,6,7,0,1,2],0))