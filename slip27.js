const fs = require('fs');

fs.readFile('student.json', 'utf8', (err, data) => {
    if (err) {
        console.log("Read Error");
        return;
    }

    let student = JSON.parse(data);

    student.name = "Rahul";
    student.marks = 90;

    fs.writeFile('student.json',
        JSON.stringify(student, null, 2), (err) => {
        if (err) {
            console.log("Write Error");
            return;
        }
        console.log("JSON File Updated");
    });
});


//json data
//student.json
{
  "name": "Amit",
  "marks": 75
}
