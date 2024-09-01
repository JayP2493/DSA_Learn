/**
 * @param {number[][]} accounts
 * @return {number}
 */
const maximumWealth = function(accounts) {
    let maxSum = 0;

    for (let account of accounts) {
        maxSum = Math.max(maxSum,(account.reduce((amount,sum) => amount + sum)));
    }

    return maxSum;
};