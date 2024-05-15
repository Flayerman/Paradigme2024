const number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]

const phone = (num)=>{
    const horreurN2 = [];
    horreurN2.push("(");
    horreurN2.push(num[0]);
    horreurN2.push(num[1]);
    horreurN2.push(num[2]);
    horreurN2.push(")");
    horreurN2.push(" ");
    horreurN2.push(num[3]);
    horreurN2.push(num[4]);
    horreurN2.push(num[5]);
    horreurN2.push("-");
    horreurN2.push(num[6]);
    horreurN2.push(num[7]);
    horreurN2.push(num[8]);
    horreurN2.push(num[9]);
    return horreurN2.join("");
}


console.log(phone(number));