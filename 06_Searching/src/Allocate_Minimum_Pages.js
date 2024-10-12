function findPages(a, n, m) {
    // your code here
    if (m > n) {
        return -1;
    }

    let start = Math.max(...a);
    let end = a.reduce((a,b) => a+b,0);
    let ans = -1;

    while (start <= end) {
        let mid = Math.floor(start + (end-start)/2);

        if (isPossible(a,n,m,mid)) {
            ans = mid;
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return ans

    function isPossible(a,n,m,mid) {
        let currentPages = a[0];
        let studentRequired = 1;

        for (let i = 1; i < a.length; i++) {
            currentPages += a[i];

            if (currentPages > mid) {
                studentRequired++;
                currentPages = a[i];
            }
        }

        return studentRequired <= m;
    }
}

console.log(findPages([13,31,37,45,46,54,55,63,73,84,85],11,9))