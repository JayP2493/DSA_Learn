const diagonalSum = function(mat) {
    let sum = 0;
    let col = 0;

    for (let i = 0; i < mat.length; i++) {
        sum += mat[i][col];
        sum += mat[i][mat.length-1-col];
        col++;
    }

    if (mat.length%2 !== 0) {
        let mid = Math.floor(mat.length/2)
        sum -= mat[mid][mid];
    }

    return sum;
};