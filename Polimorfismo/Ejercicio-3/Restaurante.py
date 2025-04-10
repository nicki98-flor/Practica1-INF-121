class Cocinero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        total = self.sueldo_mes + (self.horas_extra * self.sueldo_hora)
        print(f"{self.nombre} es Cocinero y su sueldo total es: {total}")

    def get_sueldo_mes(self):
        return self.sueldo_mes

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Sueldo: {self.sueldo_mes}")


class Mesero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora, propina):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self):
        total = self.sueldo_mes + (self.horas_extra * self.sueldo_hora) + self.propina
        print(f"{self.nombre} es Mesero y su sueldo total es: {total}")

    def get_sueldo_mes(self):
        return self.sueldo_mes

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Sueldo: {self.sueldo_mes}")


class Administrativo:
    def __init__(self, nombre, sueldo_mes, cargo):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.cargo = cargo

    def sueldo_total(self):
        print(f"{self.nombre} es Administrativo y su sueldo total es: {self.sueldo_mes}")

    def get_sueldo_mes(self):
        return self.sueldo_mes

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Sueldo: {self.sueldo_mes}, Cargo: {self.cargo}")


# Programa principal
if __name__ == "__main__":
    c1 = Cocinero("Carlos", 2500, 10, 15)
    m1 = Mesero("Luis", 1800, 5, 12, 200)
    m2 = Mesero("Ana", 1700, 8, 12, 150)
    a1 = Administrativo("Marta", 3000, "Gerente")
    a2 = Administrativo("Pedro", 2500, "Supervisor")

    print("----------------Calculo de sueldos totales--------------")
    c1.sueldo_total()
    m1.sueldo_total()
    m2.sueldo_total()
    a1.sueldo_total()
    a2.sueldo_total()

    x = 2500
    print("--------------------------------------------------------")
    print(f"Empleados con sueldo igual a {x}:")
    if c1.get_sueldo_mes() == x: c1.mostrar()
    if m1.get_sueldo_mes() == x: m1.mostrar()
    if m2.get_sueldo_mes() == x: m2.mostrar()
    if a1.get_sueldo_mes() == x: a
