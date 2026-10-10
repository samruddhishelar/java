const fs = require('fs');


fs.copyFile('a.txt', 'b.txt', (err) => {
    if (err) {
        console.log("Copy Error");
        return;
    }
    console.log("File Copied");

   
    fs.rename('b.txt', 'c.txt', (err) => {
        if (err) {
            console.log("Rename Error");
            return;
        }
        console.log("File Renamed");

       
        fs.unlink('c.txt', (err) => {
            if (err) {
                console.log("Delete Error");
                return;
            }
            console.log("File Deleted");
        });
    });
});