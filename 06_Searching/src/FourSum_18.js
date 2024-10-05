/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
const fourSum = function(nums, target) {
    nums.sort((a, b) => a-b);
    let n = nums.length;

    let ans = [];

    for (let i = 0; i < n-3; i++) {
        for (let j = i+1; j < n-2; j++) {
            for (let k = j+1; k < n-1; k++) {
                let sum = nums[i]+nums[j]+nums[k];
                let target2 = target - sum;

                let temp = bSearch(nums,target2,k+1,n-1);

                if (temp >= 0) {
                    ans.push([nums[i],nums[j],nums[k],nums[temp]]);
                }

                k = forward(nums,k);
            }
            j = forward(nums,j);
        }
        i = forward(nums,i);
    }

    return ans;
};

function bSearch(arr,target,start,end) {
    while (start <= end) {
        let mid = Math.floor((start) + (end-start)/2);

        if (arr[mid] === target) {
            return mid;
        } else if (arr[mid] > target) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return -1;
}

function forward(arr,index) {
    let temp = arr[index++];

    while (index < arr.length && temp === arr[index]) {
        index ++;
    }

    return index-1;
}

console.log(fourSum([1,0,-1,0,-2,2],0))