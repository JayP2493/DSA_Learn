function check(x, k, stalls) {
    let lastCow = stalls[0];
    let count = 1;

    for (let i = 1; i < stalls.length; i++) {
        if ((stalls[i] - lastCow) >= x) {
            count++;
            lastCow = stalls[i];
        }
    }

    return count >= k;
}

function aggressiveCows(stalls, k) {
    stalls.sort((a, b) => a - b);

    let start = 1;  // Start from 1, because 0 makes no sense in terms of minimum distance
    let end = stalls[stalls.length - 1] - stalls[0];
    let ans = 1;

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2);

        if (check(mid, k, stalls)) {
            ans = mid;
            start = mid + 1;
        } else {
            end = mid-1;
        }
    }

    return mid;  // Return start instead of ans
}

module.exports.aggressiveCows = aggressiveCows;
