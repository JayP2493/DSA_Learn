const minAbsoluteSumDiff = function(nums1, nums2) {
    let mod = 1000000007;
    let totalSum = 0;
    let maxImprovement = 0;

    let copyArr = [...nums1].sort((a, b) => a - b);

    for (let i = 0; i < nums1.length; i++) {
        let cDiff = Math.abs(nums1[i] - nums2[i]);
        totalSum += cDiff;
        maxImprovement = 0;

        let nearby = find (copyArr,nums2[i]);

        if (nearby < nums2.length) {
            let nDiff = Math.abs(copyArr[nearby] - nums2[i]);
            maxImprovement = Math.max(maxImprovement, (cDiff - nDiff));
        }

        if (nearby > 0) {
            let nDiff = Math.abs(copyArr[nearby-1] - nums2[i]);
            maxImprovement = Math.max(maxImprovement, (cDiff - nDiff));
        }
    }

    function find (arr,target) {
        let start = 0;
        let end = arr.length-1;

        while (start < end) {
            let mid = Math.floor(start + (end-start)/2);

            if (arr[mid] === target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }

};