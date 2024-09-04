const transpose = function (matrix) {
  let ans = [];
  for (let i = 0; i < matrix[0].length; i++) {
    let temp = new Array(matrix.length).fill(0);
    ans.push(temp);
  }

  for (let i = 0; i < ans.length; i++) {
    for (let j = 0; j < ans[i].length; i++) {
      ans[i][j] = matrix[j][i];
    }
  }

  return ans;
};

console.log(transpose([1, 2, 3], [4, 5, 6], [7, 8, 9]));
