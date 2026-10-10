function divide(a, b) {
    return new Promise((resolve, reject) => {
        if (b === 0) {
            reject("Cannot divide by zero");
        } else {
            resolve(a / b);
        }
    });
}

divide(10, 2)

    .then(result => console.log("Result =", result))
    .catch(error => console.log(error));