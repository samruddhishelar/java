async function login(username, password) {
    try {
        if (username === "admin" && password === "1234") {
            console.log("Login Successful");
        } else {
            throw new Error("Invalid Username or Password");
        }
    } catch (error) {
        console.log(error.message);
    }
}

login("admin", "1234");