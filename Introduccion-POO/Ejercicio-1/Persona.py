class Persona:
    def __init__(self, nombre, ciudad, edad):
        self.nombre = nombre
        self.ciudad = ciudad
        self.edad = edad

    def saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def es_mayor(self):
        if self.edad > 18:
            print(f"Sí es mayor y tiene {self.edad} años")
        else:
            print(f"No es mayor de edad y tiene {self.edad} años")


# Parte principal (equivalente a main en Java)
if __name__ == "__main__":
    p1 = Persona("David", "Bogota", 32)
    p2 = Persona("Roxana", "Buenos Aires", 15)
    p3 = Persona("Rai", "La Paz", 22)

    print("---------------Lista de Personas------------")
    p1.saludo()
    p2.saludo()
    p3.saludo()

    print("--------------¿Quién es mayor?----------------")
    p1.es_mayor()
    p2.es_mayor()
    p3.es_mayor()