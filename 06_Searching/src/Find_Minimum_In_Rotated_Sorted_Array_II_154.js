/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    let start = 0;
    let end = nums.length - 1;
    let ans = -1;

    while (start <= end) {
        let mid = Math.floor(start + (end-start) / 2);

        if (mid < end && nums[mid] > nums[mid+1]) {
            ans = mid;
            break;
        } else if (mid > start && nums[mid] < nums[mid-1]) {
            ans = mid - 1;
            break;
            //     [5,6,8,1,2,3]
        } else if (nums[mid] > nums[start] && nums[mid] > nums[end]) {
            start = mid;
        } else if (nums[mid] < nums[end] && nums[mid] < nums[start]) {
            end = mid - 1;
        } else {
            if (nums[start] > nums[start+1]) {
                ans = start;
                break;
            } else {
                start++;
            }

            if(nums[end] < nums[end-1]) {
                ans = end - 1;
                break
            } else {
                end --;
            }
        }
    }

    console.log(ans)

    return nums[ans+1]
};

findMin([1]);