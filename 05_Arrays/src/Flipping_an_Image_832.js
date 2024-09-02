/**
 * @param {number[][]} image
 * @return {number[][]}
 */
var flipAndInvertImage = function(image) {
    for (let i = 0; i < image.length; i++) {
        let start = 0;
        let end = image[i].length-1;

        while (start < end) {
            let temp = image[i][start];
            image[i][start] = image[i][end];
            image[i][end] = temp;
            start++;
            end--;
        }

        for (let j = 0; j < image[i].length; j++) {
            if (image[i][j] === 0) {
                image[i][j] = 1;
            } else {
                image[i][j] = 0;
            }
        }
    }

    return image;
};

console.log(flipAndInvertImage([[1,1,0],[1,0,1],[0,0,0]]))
console.log(flipAndInvertImage([[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]))