/**
 * @param {number} target
 * @return {number}
 */
const reachNumber = function (target) {
    target = Math.abs(target);
    let start = 1;
    let end = target;

    let lastStep = 0;
    let lastSum = 0;

    while (start <= end) {
        let mid = Math.floor(start + (end - start) / 2);
        let cSum = (mid * (mid + 1)) / 2;

        if (cSum === target) {
            return mid;
        } else if (cSum >= target) {
            lastStep = mid;
            lastSum = cSum;
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    let diff = lastSum - target;
    if (diff % 2 !== 0) {

        if ((lastStep + 1) % 2 !== 0) {
            lastStep += 1;
        } else {
            lastStep += 2;
        }
    }

    return lastStep;
};