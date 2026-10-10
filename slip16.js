function sum(...numbers) {
    let total = 0;

    for (let n of numbers) {
        total += n;
    }

    return total;
}

console.log("Sum =", sum(10, 20, 30, 40));