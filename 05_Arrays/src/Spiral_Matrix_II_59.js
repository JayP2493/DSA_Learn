const generateMatrix = function(n) {
    let ansArr = [];
    for (let i = 0; i < n; i++) {
        ansArr.push(new Array(n).fill(0))
    }

    let count = 1;

    let rStart = 0;
    let rEnd = n-1;
    let cStart = 0;
    let cEnd = n-1;

    while (count <= (n*n)) {

        for (let i = cStart; i <= cEnd; i++) {
            ansArr[rStart][i] = count;
            count++;
        }
        rStart++;

        if (!(count <= (n*n))) break;

        for (let i = rStart; i <= rEnd; i++) {
            ansArr[i][cEnd] = count;
            count++;
        }
        cEnd--;

        if (!(count <= (n*n))) break;

        for (let i = cEnd; i >= cStart; i--) {
            ansArr[rEnd][i] = count;
            count++;
        }
        rEnd--;

        if (!(count <= (n*n))) break;

        for (let i = rEnd; i >= rStart; i--) {
            ansArr[i][cStart] = count;
            count++;
        }
        cStart++;

        if (!(count <= (n*n))) break;
    }

    return ansArr;
};

console.log(generateMatrix(3))
console.log(generateMatrix(1))
console.log(generateMatrix(5))