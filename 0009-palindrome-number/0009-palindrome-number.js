/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let toText = x.toString();

    for (let i = 0; i < Math.floor(toText.length/2);i++){
        if (toText[i] !== toText[toText.length-1-i]){
            return false
        }
    }

    return true
};