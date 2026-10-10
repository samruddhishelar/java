const fs = require('fs');

fs.mkdir('Student', (err) => {
    if (err) {
        console.log("Error");
        return;
    }
    console.log("Folder Created");

    fs.readdir('.', (err, files) => {
        if (err) {
            console.log("Error");
            return;
        }
        console.log("Files:", files);

        fs.rename('Student', 'Data', (err) => {
            if (err) {
                console.log("Error");
                return;
            }
            console.log("Folder Renamed");

            const student = {
                name: "Rahul",
                course: "BSc CS"
            };

            fs.writeFile('Data/student.json',
                JSON.stringify(student), (err) => {
                if (err) {
                    console.log("Error");
                    return;
                }
                console.log("JSON Data Saved");

                fs.readFile('Data/student.json', 'utf8', (err, data) => {
                    if (err) {
                        console.log("Error");
                        return;
                    }

                    console.log(JSON.parse(data));

                    fs.rm('Data', { recursive: true }, (err) => {
                        if (err) {
                            console.log("Error");
                            return;
                        }
                        console.log("Folder Deleted");
                    });
                });
            });
        });
    });
});