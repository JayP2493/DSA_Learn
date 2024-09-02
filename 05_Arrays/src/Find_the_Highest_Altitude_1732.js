var largestAltitude = function(gain) {
    let current = 0;
    let maxAlt = 0;

    for (let val of gain) {
        current += val;
        maxAlt = Math.max(current,maxAlt);
    }

    return maxAlt;
};