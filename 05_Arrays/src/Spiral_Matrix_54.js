const spiralOrder = function(matrix) {
    let rStart = 0;
    let rEnd = matrix.length-1;
    let cStart = 0;
    let cEnd = matrix[0].length-1;

    let count = matrix.length * matrix[0].length;
    let ansArray = [];

    while (count > 0) {

        for (let i = cStart; i <= cEnd; i++) {
            ansArray.push(matrix[rStart][i]);
            count--;
        }
        rStart++;

        if (count <= 0) break;

        for (let i = rStart; i <= rEnd; i++) {
            ansArray.push(matrix[i][cEnd]);
            count--;
        }
        cEnd--;

        if (count <= 0) break;

        for (let i = cEnd; i >= cStart; i--) {
            ansArray.push(matrix[rEnd][i]);
            count--;
        }
        rEnd--;

        if (count <= 0) break;

        for (let i = rEnd; i >= rStart; i--) {
            ansArray.push(matrix[i][cStart]);
            count--;
        }
        cStart++;

        if (count <= 0) break;
    }

    return ansArray;
};

console.log(spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))
console.log(spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))