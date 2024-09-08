/**
 * @param {string} date
 * @return {string}
 */
const convertDateToBinary = function(date) {
    let ansArr = [];
    let temp = [];

    temp.push(Number(date.substring(0,4)));
    temp.push(Number(date.substring(5,7)));
    temp.push(Number(date.substring(8,10)));

    ansArr.push(temp[0].toString(2));
    ansArr.push(temp[1].toString(2));
    ansArr.push(temp[2].toString(2));

    return (`${ansArr[0]}-${ansArr[1]}-${ansArr[2]}`)
};

console.log(convertDateToBinary("1900-01-01"));