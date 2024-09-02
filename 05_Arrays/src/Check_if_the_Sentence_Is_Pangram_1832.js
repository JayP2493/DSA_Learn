/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {
    if (sentence.length < 26) {
        return false;
    }
    let count = 0;
    const obj = {};

    for (let i = 0; i < sentence.length; i++) {
        let letter = sentence[i];
        if (!obj[letter]) {
            obj[letter] = 1;
            count++;
        }
    }

    return count >= 26;
};