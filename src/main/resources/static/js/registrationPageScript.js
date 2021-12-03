const login = document.getElementById('login');
const email = document.getElementById('email');
const password = document.getElementById('password');
const btn = document.getElementById('btn');

btn.addEventListener('click', () => {
    const text = input.value;
    fetch('/registration', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ text })
    })