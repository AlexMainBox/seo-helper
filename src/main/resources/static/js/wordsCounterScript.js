const input = document.getElementById('input');
const btn = document.getElementById('send');
const output = document.getElementById('output');

btn.addEventListener('click', () => {
    const text = input.value;
    fetch('/wordsCounter', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ text })
    })
    .then(r => r.text())
    .then(t => output.innerText = t)
})