const luckyNumbers = function(matrix) {
    const ans = [];

    for (let i = 0; i < matrix.length; i++) {
        const min = [Number.MAX_SAFE_INTEGER,0];

        for (let j = 0; j < matrix[0].length; j++) {
            if (min[0] > matrix[i][j]) {
                min[0] = matrix[i][j];
                min[1] = j;
            }
        }

        if (check(min,matrix)) {
            ans.push(min[0]);
        }
    }

    return ans;
};

function check (min,matrix) {
    for (let i = 0; i < matrix.length; i++) {
        if (matrix[i][min[1]] > min[0]) {
            return false;
        }
    }

    return true;
}

console.log(luckyNumbers([[3,7,8],[9,11,13],[15,16,17]]))
console.log(luckyNumbers([[1,10,4,2],[9,3,8,7],[15,16,17,12]]))
console.log(luckyNumbers([[7,8],[1,2]]))