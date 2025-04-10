class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10
        print(f"La velocidad es: {self.velocidad}")

    def frenar(self):
        self.velocidad -= 5
        print(f"La velocidad es: {self.velocidad}")

    def mostrar(self):
        print(f"El auto es: {self.marca}")
        print(f"El modelo es: {self.modelo}")
        print(f"Su velocidad es: {self.velocidad}")


if __name__ == "__main__":
    c1 = Coche("Hyundai", "Creta 2019", 190)
    c2 = Coche("Toyota", "Toyota Hilux", 175)

    print("----------AUTOS ACELERADOS----------")
    c1.acelerar()
    c2.acelerar()

    print("----------AUTOS FRENADOS------------")
    c1.frenar()
    c2.frenar()

    print("---------LOS AUTOS SON--------------")
    c1.mostrar()
    c2.mostrar()
