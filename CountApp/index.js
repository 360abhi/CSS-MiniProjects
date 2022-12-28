let count = 0;
let countEl = document.getElementById('count-el')
let saveEl = document.getElementById('save-el')

function increment(){
    count += 1;
    countEl.innerText = count;
}


let done = false


function save(){
   
    if(!done){var myvar = count+ " "}
    else{
        var myvar = " - "+ count
    }
    done = true;
    saveEl.textContent += myvar 
    countEl.innerText = 0
    count = 0;
}