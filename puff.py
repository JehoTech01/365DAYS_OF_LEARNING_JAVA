import time

class Vape:
    def __init__(self):
        self.total_puffs = 2000
        self.remaining_puffs = 2000
        self.battery = 100  # Percentage
        self.e_liquid = 100  # Percentage
        self.is_on = False
        self.is_burned = False

    def power_button(self):
        self.is_on = not self.is_on
        status = "ON" if self.is_on else "OFF"
        print(f"\n⚡ Power {status} | Puffs left: {self.remaining_puffs} | Battery: {self.battery}% | E-Liquid: {self.e_liquid}%")

    def puff(self):
        if not self.is_on:
            print("Device is off. Hold power button to activate.")
            return

        if self.is_burned:
            print("🔥 BURNED! Cannot puff anymore. Replace coil.")
            return

        if self.remaining_puffs <= 0:
            print("💨 OUT OF PUFFS! Refill or replace cartridge.")
            return

        if self.battery <= 5:
            print("🪫 LOW BATTERY! Charge soon.")
        elif self.e_liquid <= 10:
            print("⚠️ LOW E-LIQUID! Refill soon.")

        # Simulate puff effects
        self.remaining_puffs -= 1
        self.battery = max(0, self.battery - 0.5)
        self.e_liquid = max(0, self.e_liquid - 0.3)

        # Burn warning below 1000 puffs
        if self.remaining_puffs < 1000 and not self.is_burned:
            burn_risk = (1000 - self.remaining_puffs) / 10
            if burn_risk > 30:  # 30% chance to burn when critically low
                self.is_burned = True
                print(f"🔥 BURNED COIL! Only {self.remaining_puffs} puffs used.")
            else:
                print(f"⚠️ WARNING: {self.remaining_puffs} puffs left. Risk of burning!")

        print(f"💨 Puff taken! Remaining: {self.remaining_puffs} | Battery: {self.battery:.1f}% | E-Liquid: {self.e_liquid:.1f}%")

    def charge(self):
        self.battery = 100
        print("🔋 Fully charged!")

    def refill(self):
        self.e_liquid = 100
        print("🧴 E-liquid refilled!")


vape = Vape()
vape.power_button()  # Turn on

for _ in range(1500):
    vape.puff()
    time.sleep(0.1)

vape.power_button()  # Turn off