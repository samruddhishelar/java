
const fs = require('fs');

console.log("Synchronous Operation");

fs.writeFileSync('sync.txt', 'Hello Synchronous');
let data1 = fs.readFileSync('sync.txt', 'utf8');

console.log(data1);
console.log("Synchronous Operation Completed");

console.log("Asynchronous Operation");

fs.writeFile('async.txt', 'Hello Asynchronous', (err) => {
    if (err) {
        console.log("Error writing file");
        return;
    }

    fs.readFile('async.txt', 'utf8', (err, data) => {
        if (err) {
            console.log("Error reading file");
            return;
        }
        console.log(data);
        console.log("Asynchronous Operation Completed");
    });
});

console.log("Main Program Continues");
