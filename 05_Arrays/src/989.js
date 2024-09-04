/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
var addToArrayForm = function (num, k) {
  let ans = [];
  let temp = k;

  while (temp > 0) {
    ans.push(temp % 10);
    temp -= temp % 10;
  }

  for (let i = 0; i < num.length; i++) {}
};
