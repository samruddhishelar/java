const fs = require("fs");
const filepath = "student.txt";

fs.stat(filepath, (err, stats) => {
    if (err) {
        console.log("Error:", err.message);
        return;
    }

    console.log("File/Directory Info");
    console.log("-------------------");
    console.log(`Size: ${stats.size} bytes`);

    if (stats.isFile()) {
        console.log("Type: File");
    } else if (stats.isDirectory()) {
        console.log("Type: Directory");
    }

    console.log(`Creation Time: ${stats.birthtime}`);
    console.log(`Last Access Time: ${stats.atime}`);
    console.log(`Last Modified Time: ${stats.mtime}`);
});