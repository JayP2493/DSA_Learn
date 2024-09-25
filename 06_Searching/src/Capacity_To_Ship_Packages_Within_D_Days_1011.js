/**
 * @param {number[]} weights
 * @param {number} days
 * @return {number}
 */
const shipWithinDays = function(weights, days) {
    let start = weights[0];
    let end = 0;

    for (let wei of weights) {
        start = Math.max(start,wei);
        end += wei;
    }


    while (start < end) {
        let mid = Math.floor(start + (end-start)/2);

        if (shipSearch (weights, mid, days)) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }

    return start;
};

function shipSearch (weights, mid, targetDays) {
    let days = 0;
    cSum = 0

    for (let wei of weights) {

        if (cSum+wei > mid) {
            days++;
            cSum = wei;
        } else {
            cSum += wei;
        }
    }

    return days < targetDays;
}

console.log(shipWithinDays([1,2,3,4,5,6,7,8,9,10],5))