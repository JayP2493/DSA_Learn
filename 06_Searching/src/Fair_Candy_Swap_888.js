/**
 * @param {number[]} aliceSizes
 * @param {number[]} bobSizes
 * @return {number[]}
 */
const fairCandySwap = function(aliceSizes, bobSizes) {
    let aliceSum = aliceSizes.reduce((accu,currentValue) => accu+currentValue);
    let bobSum = bobSizes.reduce((accu,currentValue) => accu+currentValue);

    bobSizes.sort((a,b) => a-b);

    let diff = (bobSum - aliceSum) /2;

    for (let i = 0; i < aliceSizes.length; i++) {
        let start = 0;
        let end = bobSizes.length-1;

        while (start <= end) {

            let mid = start + ((end-start) >> 1);
            let shouldAliceCandy = aliceSizes[i] + diff;

            if (shouldAliceCandy === bobSizes[mid]) {
                return [aliceSizes[i],bobSizes[mid]];
            } else if (shouldAliceCandy < bobSizes[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    return [-1,-1];
};

console.log(fairCandySwap([1,1],[2,2]),
fairCandySwap([1,2],[2,3]),
fairCandySwap([2],[1,3]))