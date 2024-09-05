const findRotation = function(mat, target) {
    for (let i = 0; i < 4; i++) {
        mat = rotate(mat);
        if (check(mat,target)) {
            return true;
        }
    }

    function rotate(mat) {
        let ans = [];
        for (let i = 0; i < mat.length; i++) {
            let temp = [];
            for (let j = 0; j < mat[0].length; j++) {
                temp.push(mat[j][mat.length-1-i]);
            }
            ans.push(temp);
        }
        return ans;
    }

    function check(mat,target) {
        for (let i = 0; i < mat.length; i++) {
            for (let j = 0; j < mat[0].length; j++) {
                if (mat[i][j] !== target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    return false;
};
