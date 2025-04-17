# Simple Microwave Simulator
import time

class Microwave:
    def __init__(self):
        self.power = 800  # Watts
        self.time_left = 0  # Seconds
        self.is_running = False

    def start(self, seconds):
        if not self.is_running:
            self.time_left = seconds
            self.is_running = True
            print(f"Microwave started! Heating for {seconds} seconds at {self.power}W.")
            self._countdown()
        else:
            print("Microwave is already running!")

    def stop(self):
        if self.is_running:
            self.is_running = False
            print("Microwave stopped.")
        else:
            print("Microwave isn't running!")

    def _countdown(self):
        while self.time_left > 0 and self.is_running:
            mins, secs = divmod(self.time_left, 60)
            print(f"⏰ Time left: {mins:02d}:{secs:02d}", end="\r")
            time.sleep(1)
            self.time_left -= 1
        if self.time_left == 0 and self.is_running:
            print("\n🔔 Ding! Food is ready!")
            self.is_running = False

    def adjust_time(self, seconds):
        if not self.is_running:
            self.time_left = seconds
            print(f"Time set to {seconds} seconds.")
        else:
            print("Can't adjust time while running!")


microwave = Microwave()
microwave.start(10) 
