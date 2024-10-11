function aggressiveCow (stoles,k) {
    stoles.sort((a, b) => a-b);

    let start = 1;
    let end = stoles[stoles.length-1] - stoles[0];
    let ans = 1;

    while (start <= end) {
        let mid = Math.floor(start + (end-start)/2);

        if (find(stoles,k,mid)) {
            ans = mid;
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    function find(stoles,k,mid) {
        let lastPos = stoles[0];
        let count = 1;

        for (let i = 1; i < stoles.length; i++) {
            if ((stoles[i] - lastPos) >= mid) {
                count++;
                lastPos = stoles[i];
            }
        }

        return count >= k;
    }

    return ans;
}

console.log(aggressiveCow([1,2,3],2));