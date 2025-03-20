



// Function to show the selected tool and hide others
Function showTool(toolId) {
  Const tools = document.querySelectorAll(‘.tool’);
  Tools.forEach(tool => {
      Tool.style.display = ‘none’;  // Hide all tools
  });
  Document.getElementById(toolId).style.display = ‘block’;  // Show the selected tool
}

// Morse Code to Text and Text to Morse Code Converter
Const morseCode = {
  ‘A’: ‘.-‘, ‘B’: ‘-…’, ‘C’: ‘-.-.’, ‘D’: ‘-..’, ‘E’: ‘.’, ‘F’: ‘..-.’, ‘G’: ‘--.’, ‘H’: ‘….’,
  ‘I’: ‘..’, ‘J’: ‘.---‘, ‘K’: ‘-.-‘, ‘L’: ‘.-..’, ‘M’: ‘—‘, ‘N’: ‘-.’, ‘O’: ‘---‘, ‘P’: ‘.--.’,
  ‘Q’: ‘--.-‘, ‘R’: ‘.-.’, ‘S’: ‘…’, ‘T’: ‘-‘, ‘U’: ‘..-‘, ‘V’: ‘…-‘, ‘W’: ‘.—‘, ‘X’: ‘-..-‘,
  ‘Y’: ‘-.—‘, ‘Z’: ‘--..’, ‘1’: ‘.----‘, ‘2’: ‘..---‘, ‘3’: ‘…--‘, ‘4’: ‘….-‘, ‘5’: ‘…..’,
  ‘6’: ‘-….’, ‘7’: ‘--…’, ‘8’: ‘---..’, ‘9’: ‘----.’, ‘0’: ‘-----‘, ‘ ‘: ‘/’, ‘.’: ‘.-.-.-‘,
  ‘,’: ‘--..—‘, ‘?’: ‘..--..’, “’”: ‘.----.’, ‘!’: ‘-.-.—‘, ‘/’: ‘-..-.’, ‘(‘: ‘-.--.’, ‘)’: ‘-.--.-‘,
  ‘&’: ‘.-…’, ‘:’: ‘---…’, ‘;’: ‘-.-.-.’, ‘=’: ‘-…-‘, ‘+’: ‘.-.-.’, ‘-‘: ‘-….-‘, ‘_’: ‘..--.-‘,
  ‘”’: ‘.-..-.’, ‘$’: ‘…-..-‘, ‘@’: ‘.--.-.’
};
Const morseToText = {};
For (let char in morseCode) {
  morseToText[morseCode[char]] = char;
}

Function convertTextToMorse() {
  Let text = document.getElementById(‘textToMorseInput’).value.toUpperCase();
  Let morse = text.split(‘’).map(char => morseCode[char] || char).join(‘ ‘);
  Document.getElementById(‘textToMorseOutput’).value = morse;
}

Function convertMorseToText() {
  Let morse = document.getElementById(‘textToMorseInput’).value.trim().split(‘ ‘);
  Let text = morse.map(code => morseToText[code] || ‘’).join(‘’);
  Document.getElementById(‘textToMorseOutput’).value = text;
}

// Text to Binary and Binary to Text Converter
Function convertTextToBinary() {
  Let text = document.getElementById(‘textToBinaryInput’).value;
  Let binary = text.split(‘’).map(char => char.charCodeAt(0).toString(2).padStart(8, ‘0’)).join(‘ ‘);
  Document.getElementById(‘textToBinaryOutput’).value = binary;
}

Function convertBinaryToText() {
  Let binary = document.getElementById(‘textToBinaryInput’).value;
  Let text = binary.split(‘ ‘).map(bin => String.fromCharCode(parseInt(bin, 2))).join(‘’);
  Document.getElementById(‘textToBinaryOutput’).value = text;
}

// Word Counter
Function countWords() {
  Let text = document.getElementById(‘wordCounterInput’).value;
  Let wordCount = text.trim().split(/\s+/).filter(word => word).length;
  Document.getElementById(‘wordCountOutput’).innerText = ‘Word Count: ‘ + wordCount;
}

// ROT13 to Text and Text to ROT13 Converter
Function rot13(str) {
  Return str.replace(/[A-Za-z]/g, function© {
      Return String.fromCharCode(((c <= “Z” ? 90 : 122) >= (c = c.charCodeAt(0) + 13) ? c : c – 26));
  });
}

Function convertTextToROT13() {
  Let text = document.getElementById(‘textToROT13Input’).value;
  Let rot13Text = rot13(text);
  Document.getElementById(‘textToROT13Output’).value = rot13Text;
}

Function convertROT13ToText() {
  convertTextToROT13();  // ROT13 is reversible, so same function works for both
}

// Age Calculator
Function calculateAge() {
  Let dob = new Date(document.getElementById(‘dobInput’).value);
  Let diff = Date.now() – dob.getTime();
  Let age = new Date(diff);
  Document.getElementById(‘ageOutput’).innerText = ‘Your age is: ‘ + Math.abs(age.getUTCFullYear() – 1970);
}

// BMI Calculator
Function calculateBMI() {
  Let weight = parseFloat(document.getElementById(‘weightInput’).value);
  Let height = parseFloat(document.getElementById(‘heightInput’).value) / 100; // convert cm to meters
  Let bmi = (weight / (height * height)).toFixed(2);
  Document.getElementById(‘bmiOutput’).innerText = ‘Your BMI is: ‘ + bmi;
}

// Show Morse Code Converter by default on page load
Window.onload = function() {
  showTool(‘morse’);
};