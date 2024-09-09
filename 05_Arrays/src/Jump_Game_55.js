/**
 * @param {number[]} nums
 * @return {boolean}
 */
const canJump = function(nums) {
    let goal = nums.length-1;

    for(let i = 1; i < nums.length; i++) {
        let temp = nums.length-1-i
        if ((temp) + nums[temp] >= goal) {
            goal = temp;
        }
    }

    return goal === 0;
};

