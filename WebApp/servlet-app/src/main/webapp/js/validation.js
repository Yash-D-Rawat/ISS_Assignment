function validateLogin() {
    let u = document.getElementById("username").value.trim();
    let p = document.getElementById("password").value.trim();
    let error = document.getElementById("clientError");

    error.innerHTML = "";

    if (u === "") {
        error.innerHTML = "Username is required";
        return false;
    }

    if (p === "") {
        error.innerHTML = "Password is required";
        return false;
    }

    if (p.length < 4) {
        error.innerHTML = "Password must be at least 4 characters";
        return false;
    }

    return true;
}

function validateRegister() {
    let u = document.getElementById("username").value.trim();
    let p = document.getElementById("password").value.trim();
    let error = document.getElementById("clientError");

    error.innerHTML = "";

    if (u === "") {
        error.innerHTML = "Username is required";
        return false;
    }

    if (p.length < 4) {
        error.innerHTML = "Password must be at least 4 characters";
        return false;
    }

    return true;
}
