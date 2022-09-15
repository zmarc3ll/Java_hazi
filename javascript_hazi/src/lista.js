const lista=[];

function hozzaad(n) {
    if (n<0) {
        console.log("Hiba!")
    } else  {
        lista.push(n);
    }
    
}

function atlag(){
    let total=0;
    for (let index = 0; index < lista.length; index++) {
        total=total+lista[index];
    }
    console.log(total/lista.length);
}

export {hozzaad, atlag};