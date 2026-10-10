//math.js
export function add(a, b) {
    return a + b;
}

export function subtract(a, b) {
    return a - b;
}

export function multiply(a, b) {
    return a * b;
}

export function divide(a, b) {
    return a / b;
}



<!DOCTYPE html>
<html>
<body>

<h2>Arithmetic Operations</h2>
<p id="result"></p>

<script type="module">
    import { add, subtract, multiply, divide } from './math.js';

    document.getElementById("result").innerHTML = `
        Addition = ${add(10, 5)}<br>
        Subtraction = ${subtract(10, 5)}<br>
        Multiplication = ${multiply(10, 5)}<br>
        Division = ${divide(10, 5)}
    `;
</script>

</body>
</html>