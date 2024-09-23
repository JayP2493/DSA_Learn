/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
const minEatingSpeed = function(piles, h) {
    let start = 1;
    let end = Math.max(...piles);

    while (start < end) {
        let mid = Math.floor(start + (end-start)/2);
        let eatPerHour = counter(piles,mid);

        if (eatPerHour <= h) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }

    return end;

    function counter(piles,mid) {
        let ans = 0;

        for(let num of piles) {
            ans += Math.floor(num/mid);
            if (num%mid !== 0) {
                ans++;
            }
        }

        return ans;
    }
};

console.log(minEatingSpeed([3,6,7,11],8))
console.log(minEatingSpeed([30,11,23,4,20],5))
console.log(minEatingSpeed([30,11,23,4,20],6))