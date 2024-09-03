const oddCells = function(m, n, indices) {

    const ansArr = [];

    for (let i = 0; i < m; i++) {
        ansArr.push(new Array(n).fill(0))
    }

    for (let i = 0; i < indices.length; i++) {
        let row = indices[i][0];
        let col = indices[i][1];

        for (let j = 0; j < n; j++) {
            ansArr[row][j]++;
        }

        for (let j = 0; j < m; j++) {
            ansArr[j][col]++;
        }
    }

    let ans = 0;

    for (let i = 0; i < ansArr.length; i++) {
        for (let j = 0; j < ansArr[i].length; j++) {
            if (ansArr[i][j]%2 !== 0) {
                ans++
            }
        }
    }

    return ans;
};