
const fs = require('fs');

fs.writeFile('student.txt', 'Student Record', (err) => {
    if (err) {
        console.log("Error creating file");
        return;
    }
    console.log("File Created");

    fs.readFile('student.txt', 'utf8', (err, data) => {
        if (err) {
            console.log("Error reading file");
            return;
        }
        console.log("File Content:", data);

        fs.appendFile('student.txt', '\nRoll No: 101', (err) => {
            if (err) {
                console.log("Error appending file");
                return;
            }
            console.log("Data Added");

            fs.readFile('student.txt', 'utf8', (err, data) => {
                if (err) {
                    console.log("Error reading updated file");
                    return;
                }
                console.log("Updated Content:\n" + data);
            });
        });
    });
});
