const spiralMatrixIII = function(rows, cols, rStart, cStart) {
    const direction = [[0,1],[1,0],[0,-1],[-1,0]];
    const ansArr = [];
    ansArr.push([rStart,cStart]);

    let step = 0;
    let dir = 0;
    const cPos = [rStart,cStart];

    while (ansArr.length < (rows*cols)) {
        if (dir%2 === 0) step++;

        for (let i = 0; i < step; i++) {
            cPos[0] += direction[dir][0];
            cPos[1] += direction[dir][1];

            if ((cPos[0] >= 0 && cPos[0] < rows) && (cPos[1] >= 0 && cPos[1] < cols)) {
                ansArr.push([cPos[0],cPos[1]]);
            }
        }

        dir = (dir+1)%4;
    }

    return ansArr;
};

console.log(spiralMatrixIII(1,4,0,0))
console.log(spiralMatrixIII(5,6,1,4))