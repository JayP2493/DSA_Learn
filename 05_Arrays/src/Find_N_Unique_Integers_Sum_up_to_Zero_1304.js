var sumZero = function(n) {
    if (n === 1) {
        return [0]
    } else {
        let temp = new Array(n).fill(0);
        let start = 0;
        let end = n-1;

        while (start < end) {
            temp[start] = (start+1) * -1;
            temp[end] = start+1;
            start++;
            end--;
        }
        return temp;
    }
};

console.log(sumZero(5))
console.log(sumZero(3))
console.log(sumZero(1))