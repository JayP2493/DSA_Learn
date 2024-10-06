/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
const findMedianSortedArrays = function(nums1, nums2) {
    if (nums1.length > nums2.length) {
        return findMedianSortedArrays (nums2, nums1);
    }

    const m = nums1.length;
    const n = nums2.length;

    const ansLength = m+n;
    const ansIndex = Math.floor((ansLength+1)/2);

    let start = 0;
    let end = m;

    while (start <= end) {
        let mid = Math.floor(start + (end-start)/2);
        let mid2 = ansIndex - mid;

        let l1 = Number.MIN_SAFE_INTEGER;
        let l2 = Number.MIN_SAFE_INTEGER;
        let r1 = Number.MAX_SAFE_INTEGER;
        let r2 = Number.MAX_SAFE_INTEGER;

        if (m > mid) r1 = nums1[mid];
        if (n > mid2) r2 = nums2[mid2];
        if (0 <= mid-1) l1 = nums1[mid-1];
        if (0 <= mid2-1) l2 = nums2[mid2-1];

        if (l1 <= r2 && l2 <= r1) {
            if (ansLength%2 === 1) {
                return Math.max(l1,l2);
            } else {
                return (Math.max(l1,l2) + Math.min(r1,r2))/2;
            }
        } else if (l1 > r2) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }

    return 0;
};