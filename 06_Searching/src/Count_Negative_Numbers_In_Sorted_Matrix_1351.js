/**
 * @param {number[][]} grid
 * @return {number}
 */
const countNegatives = function(grid) {
    let sum = 0;

    for (let i = 0; i < grid.length; i++) {
        sum += neg(grid[i]);
    }

    return sum;
};

function neg (arr) {
    let start = 0;
    let end = arr.length-1;

    while (start <= end) {
        let mid = start + ((end - start) >> 2);

        if (arr[mid] < 0) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return arr.length - 1 - end;
}