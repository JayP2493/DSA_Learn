/**
 * @param {number[]} arr
 * @return {number}
 */
var peakIndexInMountainArray = function(arr) {
    let start  = 0;
    let end = arr.length-1;

    while (start < end) {
        let mid = start + ((end-start)>>2);

        if(arr[mid] > arr[mid+1]) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }

    return start;
};