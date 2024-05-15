const number = [[10,0],[3,5],[5,8]];

const aboutToBus = (num)=>{
    const sort = num.reduce((Toatal,[In-Out])=>In-Out,0,);
    return sort;
}

console.log(aboutToBus(number));










/*
number([[10,0],[3,5],[5,8]]) -> 5
number([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]) -> 17
number([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]) -> 21
*/