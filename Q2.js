const maskify ="4556364607935616";

console.log(maskify.slice(0,maskify.length));

const cb = (mask)=>{
    const sort = []
    const cens = "#".repeat(mask.length-4);
    sort.push(cens);
    const nb1 = mask[mask.length-4];
    sort.push(nb1);
    const nb2 = mask[mask.length-3];
    sort.push(nb2);
    const nb3 = mask[mask.length-2];
    sort.push(nb3);
    const nb4 = mask[mask.length-1];
    sort.push(nb4);
    const sortie = sort.join('');
    return sortie;
}
console.log(cb(maskify));