import sys
from time import sleep
import time

def apply_gradient(text):
   
    colors =  [
    "\033[38;5;198m",  # Hot Pink
    "\033[38;5;200m",  # Bubblegum Pink
    "\033[38;5;225m",  # Baby Pink (lightest)
    "\033[38;5;200m",  # Bubblegum Pink
    "\033[38;5;198m"   # Hot Pink
]
    gradient_text = ''
    for i, char in enumerate(text):
        color = colors[i % len(colors)]
        gradient_text += color + char
    gradient_text += "\033[0m"  
    return gradient_text

def print_lyrics():
    lines = [
        ("nang damdamin ko", 0.10),  
        ("'di mo ba ako lilisanin?", 0.16),
        ("hindi pa ba sapat ang pagpapahirap sakin?", 0.15),
        ("hindi na ba ma-mamamayapa?", 0.15),
        ("hindi na ba ma-mamamayapa?", 0.17),
        ("hindi na makalaya", 0.29),
        ("dinadalaw mo 'ko bawat gabi", 0.18),
        ("wala mang nakikita", 0.18),
        ("haplos mo'y ramdam pa rin sa dilim", 0.1),
    ]
    delays = [0.9, 0.7, 0.8, 1, 
              0.8, 1.4, 1.3, 
              1.4, 1.0]  

    for i, (line, char_delay) in enumerate(lines):
        words = line.split(' ')  
        for word in words:
            if word == "hindi":
                
                print(apply_gradient("hindi"), end=' ')
            else:
                
                for char in word:
                    print(char, end='')
                    sys.stdout.flush()
                    sleep(char_delay)
                print(' ', end='')  

        time.sleep(delays[i])  
        print('') 


print_lyrics()
