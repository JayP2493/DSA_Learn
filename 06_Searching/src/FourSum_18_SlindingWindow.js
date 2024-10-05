/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
const fourSum = function(nums, target) {
    nums.sort((a, b) => a-b);
    let ans = [];
    let n = nums.length;

    for (let i = 0; i < n-3; i++) {
        for (let j = i+1; j < n-2; j++) {

            let start = j + 1;
            let end = n-1;

            while (start < end) {
                let sum = nums[start] + nums[end] + nums[i] + nums[j];

                if (sum === target) {
                    ans.push([nums[start],nums[end],nums[i],nums[j]]);
                    ans[ans.length-1].sort((a, b) => a-b);

                    let startVal = nums[start++];
                    let endVal = nums[end--];

                    while (start < end && nums[start] === startVal) {
                        start++;
                    }

                    while (start < end && nums[end] === endVal) {
                        end--;
                    }
                } else if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }
            j = forward(nums,j)
        }
        i = forward(nums,i)
    }

    return ans;
};

function forward(arr,index) {
    let temp = arr[index++];

    while (index < arr.length && temp === arr[index]) {
        index ++;
    }

    return index-1;
}

console.log(fourSum([1,0,-1,0,-2,2],0))
console.log(fourSum([-2,-1,-1,1,1,2,2],0))