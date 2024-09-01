/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    let ansArray = [];
    let max = 0;

    for (let candie of candies) {
        max = Math.max (candie,max);
    }

    for (let candie of candies) {
        ansArray.push(max <= candie+extraCandies);
    }

    return ansArray;
};