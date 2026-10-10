const path = require("path");


let joinedPath = path.join("student", "documents", "file.txt");
console.log(`Joined Path: ${joinedPath}`);


let resolvePath = path.resolve("student", "documents", "file.txt");
console.log(`Resolved Path: ${resolvePath}`);


let fileName = path.basename("student/documents/file.txt");
console.log(`File Name: ${fileName}`);


let directoryName = path.dirname("student/documents/file.txt");
console.log(`Directory Name: ${directoryName}`);


let extension = path.extname("student/documents/file.txt");
console.log(`File Extension: ${extension}`);