/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const maxFrequency = function(nums, k) {
    nums.sort((a, b) => a-b);

    let resul = 1;
    let preSum = new Array(nums.length).fill(0);
    preSum[0] = nums[0];

    for (let i = 1; i < nums.length; i++) {
        preSum[i] += preSum[i-1] + nums[i];
    }

    for (let i = 0; i < nums.length; i++) {
        let freq = binarySearch(i,nums,k,preSum);
        resul = Math.max(resul,freq);
    }

    return resul;
};

function binarySearch (i, arr, k, preSumArray) {
    let start = 0;
    let end = i;
    let ans = i;

    while (start <= end) {
        let mid = Math.floor((start) + ((end-start)/2));
        let windowSum = (i-mid+1) * arr[i];
        let originalSum = preSumArray[i] - preSumArray[mid] + arr[mid];
        let possibleOps = windowSum - originalSum;

        if (possibleOps > k) {
            start = mid + 1;
        } else {
            ans = mid;
            end = mid - 1;
        }
    }

    return (i-ans+1)
}

console.log(maxFrequency([1,2,4],5) === 3)
console.log(maxFrequency([1,4,8,13],5))
console.log(maxFrequency([3,9,6],2))