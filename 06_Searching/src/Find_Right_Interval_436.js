const findRightInterval = function(intervals) {
    let map = {};
    let arr = [];
    let max = Number.MIN_SAFE_INTEGER;

    for (let i = 0; i < intervals.length; i++) {
        map[intervals[i][0]] = i;
        arr.push(intervals[i][0]);
        max = Math.max(max,intervals[i][0]);
    }

    arr.sort((a,b) => a-b);

    let ansArr = [];

    for (let i = 0; i < intervals.length; i++) {
        let temp = find (intervals[i][1],arr,max);

        if (typeof(temp) === "undefined") {
            ansArr.push(-1);
        } else {
            ansArr.push(map[temp]);
        }
    }

    function find (target,arr,max) {
        if (target > max) {
            return undefined;
        } else {
            let start = 0;
            let end = arr.length-1;

            while (start < end) {
                let mid = Math.floor(start + (end-start)/2)

                if (arr[mid] === target) {
                    return arr[mid];
                } else if (arr[mid] > target) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }

            return arr[end];
        }
    }

    return ansArr;
};

console.log(findRightInterval([[3,4],[2,3],[1,2]]))
console.log(findRightInterval([[1,4],[2,3],[3,4]]))