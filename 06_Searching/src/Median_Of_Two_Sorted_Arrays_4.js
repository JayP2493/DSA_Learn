const findMedianSortedArrays = function(nums1, nums2) {
    if (nums1.length > nums2.length) {
        return findMedianSortedArrays(nums2,nums1);
    }

    let n = nums1.length;
    let m = nums2.length;

    let ansLength = m+n;
    let leftIndex = (m+m+1)/2;

    let start = 0;
    let end = nums1.length-1;

    while (start <= end) {
        let mid = Math.floor(start + (end-start)/2);
        let mid2 = leftIndex - mid;

        let l1 = Number.MIN_SAFE_INTEGER;
        let l2 = Number.MIN_SAFE_INTEGER;

        let r1 = Number.MAX_SAFE_INTEGER;
        let r2 = Number.MAX_SAFE_INTEGER;

        if (mid < m) r1 = nums1[mid];
        if (mid2 < n) r2 = nums2[mid2];
        if (mid >= 0) l1 = nums1[mid-1];
        if (mid2 >= 0) l2 = nums2[mid2-1];

        if (l1 <= r2 && l2 <= r1) {
            if (ansLength%2 === 1) {
                return Math.max(l1,l2);
            } else {
                return (Math.max(l1,l2) + Math.min(r1,r2))/2;
            }
        } else if (l1 > l2) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return 0;
};