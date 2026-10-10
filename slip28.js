const fs = require("fs");
const path = require("path");

const directory = ".";
const extensions = [".txt", ".json", ".js"];

fs.readdir(directory, (err, files) => {
    if (err) {
        console.log("Error reading directory:",
            err.message);
        return;
    }

    console.log("Matching Files:");

    files.forEach((file) => {
        const extension = path.extname(file);

        if (extensions.includes(extension)) {
            console.log(file);
        }
    });
});