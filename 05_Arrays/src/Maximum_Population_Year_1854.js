const maximumPopulation = function(logs) {
    let arr = new Array(2052).fill(0);

    for (let log of logs) {
        arr[log[0]]++;
        arr[log[1]]--;
    }

    let ans = [1950,arr[1950]];

    for (let i = 1950; i < arr.length; i++) {
        arr[i] += arr[i-1];

        if (arr[i] > ans[1]) {
            ans[0] = i;
            ans[1] = arr[i];
        }
    }

    return ans[0];
};

console.log(maximumPopulation([[1993,1999],[2000,2010]]));
console.log(maximumPopulation([[1950,1961],[1960,1971],[1970,1981]]));