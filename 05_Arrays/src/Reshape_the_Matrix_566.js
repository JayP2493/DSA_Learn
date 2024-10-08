/**
 * @param {number[][]} mat
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(mat, r, c) {
    if ((mat.length * mat[0].length) === (r * c)) {
        let ansArr = [];
        let temp = [];

        for (let i = 0; i < mat.length; i++) {
            for (let j = 0; j < mat.length; j++) {
                temp.push(mat[i][j]);

                if(temp.length === c) {
                    ansArr.push(temp);
                    temp = [];
                    row = 0;
                }
            }
        }

        return ansArr;
    } else {
        return mat;
    }
};

console.log(matrixReshape([[1,2,3,4]],2,2))