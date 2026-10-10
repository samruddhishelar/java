
const fs = require('fs');

fs.writeFile('example.txt', 'Hello Node.js', (err) => {
    if (err) {
        console.log("Error writing file");
        return;
    }
    console.log("File Created");

    fs.readFile('example.txt', 'utf8', (err, data) => {
        if (err) {
            console.log("Error reading file");
            return;
        }
        console.log("File Content:", data);

        fs.appendFile('example.txt', '\nWelcome to Node.js', (err) => {
            if (err) {
                console.log("Error appending file");
                return;
            }
            console.log("Data Added");

            fs.unlink('example.txt', (err) => {
                if (err) {
                    console.log("Error deleting file");
                    return;
                }
                console.log("File Deleted");
            });
        });
    });
});
