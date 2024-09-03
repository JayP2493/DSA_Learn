/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    let count = 0;

    for (let i = 0; i < nums.length ; i++) {
        let tempCount = 0;
        let temp = nums[i];

        while (temp > 0) {
            tempCount++;
            temp -= temp%10;
            temp /= 10;
        }

        if (tempCount%2 == 0) {
            count++;
        }
    }

    return count;
};