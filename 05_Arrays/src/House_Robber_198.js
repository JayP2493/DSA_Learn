/**
 * @param {number[]} nums
 * @return {number}
 */
const rob = function(nums) {
    let rob1 = 0;
    let rob2 = 0;

    for (const num of nums) {
        let temp = Math.max(rob1+num,rob2)
        rob2 = rob1;
        rob1 = temp;
    }

    return rob2;
};