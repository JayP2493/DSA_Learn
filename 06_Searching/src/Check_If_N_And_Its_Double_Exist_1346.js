/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    arr.sort((a,b) => a - b);
    let zero = 0;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            zero++;
            continue;
        }

        let start = 0;
        let end = arr.length - 1;

        while (start <= end) {
            let mid = Math.floor(start + (end-start)/2);

            if ((arr[i]*2) === arr[mid]) {
                return true;
            } else if ((arr[i]*2) < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    return zero >= 2; 
};