const minCostToMoveChips = function(position) {
    let odd = 0;
    let even = 0;

    for (let i of position) {
        if (i%2 === 0) {
            even++;
        } else {
            odd++;
        }
    }

    return Math.min(even,odd);
};